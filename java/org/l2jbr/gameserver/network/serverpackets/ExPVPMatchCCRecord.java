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
package org.l2jbr.gameserver.network.serverpackets;

import java.util.Map;
import java.util.Map.Entry;

import org.l2jbr.commons.network.PacketWriter;
import org.l2jbr.gameserver.model.actor.instance.PlayerInstance;
import org.l2jbr.gameserver.network.OutgoingPackets;

/**
 * @author Mobius
 */
public class ExPVPMatchCCRecord implements IClientOutgoingPacket
{
	public static final int INITIALIZE = 0;
	public static final int UPDATE = 1;
	public static final int FINISH = 2;
	
	private final int _state;
	private final Map<PlayerInstance, Integer> _players;
	
	public ExPVPMatchCCRecord(int state, Map<PlayerInstance, Integer> players)
	{
		_state = state;
		_players = players;
	}
	
	@Override
	public boolean write(PacketWriter packet)
	{
		OutgoingPackets.EX_PVP_MATCH_CCRECORD.writeId(packet);
		packet.writeD(_state); // 0 - initialize, 1 - update, 2 - finish
		packet.writeD(_players.size());
		for (Entry<PlayerInstance, Integer> entry : _players.entrySet())
		{
			packet.writeS(entry.getKey().getName());
			packet.writeD(entry.getValue());
		}
		return true;
	}
}
