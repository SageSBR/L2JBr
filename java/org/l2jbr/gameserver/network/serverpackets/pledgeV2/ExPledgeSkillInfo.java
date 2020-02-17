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
package org.l2jbr.gameserver.network.serverpackets.pledgeV2;

import org.l2jbr.commons.network.PacketWriter;
import org.l2jbr.gameserver.network.OutgoingPackets;
import org.l2jbr.gameserver.network.serverpackets.IClientOutgoingPacket;

/**
 * @author Mobius
 */
public class ExPledgeSkillInfo implements IClientOutgoingPacket
{
	private final int _skillId;
	private final int _skillLevel;
	private final int _timeLeft;
	private final int _availability;
	
	public ExPledgeSkillInfo(int skillId, int skillLevel, int timeLeft, int availability)
	{
		_skillId = skillId;
		_skillLevel = skillLevel;
		_timeLeft = timeLeft;
		_availability = availability;
	}
	
	@Override
	public boolean write(PacketWriter packet)
	{
		OutgoingPackets.EX_PLEDGE_SKILL_INFO.writeId(packet);
		packet.writeD(_skillId);
		packet.writeD(_skillLevel);
		packet.writeD(_timeLeft);
		packet.writeC(_availability);
		return true;
	}
}
