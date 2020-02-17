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
package org.l2jbr.gameserver.network.serverpackets.equipmentupgrade;

import org.l2jbr.commons.network.PacketWriter;
import org.l2jbr.gameserver.network.OutgoingPackets;
import org.l2jbr.gameserver.network.serverpackets.AbstractItemPacket;

/**
 * @author Mobius
 */
public class ExUpgradeSystemResult extends AbstractItemPacket
{
	private final int _objectId;
	private final int _success;
	
	public ExUpgradeSystemResult(int objectId, int success)
	{
		_objectId = objectId;
		_success = success;
	}
	
	@Override
	public boolean write(PacketWriter packet)
	{
		OutgoingPackets.EX_UPGRADE_SYSTEM_RESULT.writeId(packet);
		packet.writeH(_success);
		packet.writeD(_objectId);
		return true;
	}
}
