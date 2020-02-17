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
package handlers.skillconditionhandlers;

import org.l2jbr.gameserver.model.StatsSet;
import org.l2jbr.gameserver.model.WorldObject;
import org.l2jbr.gameserver.model.actor.Creature;
import org.l2jbr.gameserver.model.actor.instance.PlayerInstance;
import org.l2jbr.gameserver.model.skills.ISkillCondition;
import org.l2jbr.gameserver.model.skills.Skill;
import org.l2jbr.gameserver.network.SystemMessageId;

/**
 * @author
 */
public class CanBookmarkAddSlotSkillCondition implements ISkillCondition
{
	private final int _teleportBookmarkSlots;
	
	public CanBookmarkAddSlotSkillCondition(StatsSet params)
	{
		_teleportBookmarkSlots = params.getInt("teleportBookmarkSlots");
	}
	
	@Override
	public boolean canUse(Creature caster, Skill skill, WorldObject target)
	{
		final PlayerInstance player = caster.getActingPlayer();
		if (player == null)
		{
			return false;
		}
		
		if ((player.getBookMarkSlot() + _teleportBookmarkSlots) > 18)
		{
			player.sendPacket(SystemMessageId.YOUR_NUMBER_OF_MY_TELEPORTS_SLOTS_HAS_REACHED_ITS_MAXIMUM_LIMIT);
			return false;
		}
		
		return true;
	}
}
