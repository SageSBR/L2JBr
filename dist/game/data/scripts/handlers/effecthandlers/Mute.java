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
package handlers.effecthandlers;

import org.l2jbr.gameserver.ai.CtrlEvent;
import org.l2jbr.gameserver.model.StatsSet;
import org.l2jbr.gameserver.model.actor.Creature;
import org.l2jbr.gameserver.model.effects.AbstractEffect;
import org.l2jbr.gameserver.model.effects.EffectFlag;
import org.l2jbr.gameserver.model.effects.EffectType;
import org.l2jbr.gameserver.model.items.instance.ItemInstance;
import org.l2jbr.gameserver.model.skills.Skill;

/**
 * Mute effect implementation.
 */
public class Mute extends AbstractEffect
{
	public Mute(StatsSet params)
	{
	}
	
	@Override
	public long getEffectFlags()
	{
		return EffectFlag.MUTED.getMask();
	}
	
	@Override
	public EffectType getEffectType()
	{
		return EffectType.MUTE;
	}
	
	@Override
	public void onStart(Creature effector, Creature effected, Skill skill, ItemInstance item)
	{
		if ((effected == null) || effected.isRaid())
		{
			return;
		}
		
		effected.abortCast();
		effected.getAI().notifyEvent(CtrlEvent.EVT_MUTED);
	}
}
