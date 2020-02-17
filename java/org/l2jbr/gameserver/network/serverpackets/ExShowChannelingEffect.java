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

import org.l2jbr.commons.network.PacketWriter;
import org.l2jbr.gameserver.model.actor.Creature;
import org.l2jbr.gameserver.network.OutgoingPackets;

/**
 * @author Sdw
 */
public class ExShowChannelingEffect extends AbstractItemPacket
{
	private final Creature _caster;
	private final Creature _target;
	private final int _state;
	
	public ExShowChannelingEffect(Creature caster, Creature target, int state)
	{
		_caster = caster;
		_target = target;
		_state = state;
	}
	
	@Override
	public boolean write(PacketWriter packet)
	{
		OutgoingPackets.EX_SHOW_CHANNELING_EFFECT.writeId(packet);
		packet.writeD(_caster.getObjectId());
		packet.writeD(_target.getObjectId());
		packet.writeD(_state);
		return true;
	}
}
