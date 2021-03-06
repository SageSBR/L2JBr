/*
 * This file is part of the L2J Br project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2jbr.gameserver.network.clientpackets;

import org.l2jbr.commons.network.PacketReader;
import org.l2jbr.gameserver.instancemanager.CastleManager;
import org.l2jbr.gameserver.instancemanager.ClanEntryManager;
import org.l2jbr.gameserver.instancemanager.FortManager;
import org.l2jbr.gameserver.model.actor.instance.PlayerInstance;
import org.l2jbr.gameserver.model.clan.Clan;
import org.l2jbr.gameserver.model.clan.entry.PledgeRecruitInfo;
import org.l2jbr.gameserver.network.GameClient;
import org.l2jbr.gameserver.network.SystemMessageId;
import org.l2jbr.gameserver.network.serverpackets.ExPledgeCount;
import org.l2jbr.gameserver.network.serverpackets.JoinPledge;
import org.l2jbr.gameserver.network.serverpackets.PledgeShowInfoUpdate;
import org.l2jbr.gameserver.network.serverpackets.PledgeShowMemberListAdd;
import org.l2jbr.gameserver.network.serverpackets.PledgeShowMemberListAll;
import org.l2jbr.gameserver.network.serverpackets.SystemMessage;

/**
 * @author Mobius
 */
public class RequestPledgeSignInForOpenJoiningMethod implements IClientIncomingPacket
{
	private int _clanId;
	
	@Override
	public boolean read(GameClient client, PacketReader packet)
	{
		_clanId = packet.readD();
		packet.readD();
		return true;
	}
	
	@Override
	public void run(GameClient client)
	{
		final PlayerInstance player = client.getPlayer();
		if (player == null)
		{
			return;
		}
		
		final PledgeRecruitInfo pledgeRecruitInfo = ClanEntryManager.getInstance().getClanById(_clanId);
		if (pledgeRecruitInfo != null)
		{
			final Clan clan = pledgeRecruitInfo.getClan();
			if ((clan != null) && (player.getClan() == null))
			{
				player.sendPacket(new JoinPledge(clan.getId()));
				
				// player.setPowerGrade(9); // academy
				player.setPowerGrade(5); // New member starts at 5, not confirmed.
				
				clan.addClanMember(player);
				player.setClanPrivileges(player.getClan().getRankPrivs(player.getPowerGrade()));
				player.sendPacket(SystemMessageId.ENTERED_THE_CLAN);
				
				final SystemMessage sm = new SystemMessage(SystemMessageId.S1_HAS_JOINED_THE_CLAN);
				sm.addString(player.getName());
				clan.broadcastToOnlineMembers(sm);
				
				if (clan.getCastleId() > 0)
				{
					CastleManager.getInstance().getCastleByOwner(clan).giveResidentialSkills(player);
				}
				if (clan.getFortId() > 0)
				{
					FortManager.getInstance().getFortByOwner(clan).giveResidentialSkills(player);
				}
				player.sendSkillList();
				
				clan.broadcastToOtherOnlineMembers(new PledgeShowMemberListAdd(player), player);
				clan.broadcastToOnlineMembers(new PledgeShowInfoUpdate(clan));
				clan.broadcastToOnlineMembers(new ExPledgeCount(clan));
				
				// This activates the clan tab on the new member.
				PledgeShowMemberListAll.sendAllTo(player);
				player.setClanJoinExpiryTime(0);
				player.broadcastUserInfo();
				
				ClanEntryManager.getInstance().removePlayerApplication(_clanId, player.getObjectId());
			}
		}
	}
}