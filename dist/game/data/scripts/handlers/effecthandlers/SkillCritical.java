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

import org.l2jbr.gameserver.model.StatsSet;
import org.l2jbr.gameserver.model.actor.Creature;
import org.l2jbr.gameserver.model.effects.AbstractEffect;
import org.l2jbr.gameserver.model.skills.Skill;
import org.l2jbr.gameserver.model.stats.BaseStats;
import org.l2jbr.gameserver.model.stats.Stats;

/**
 * @author Sdw
 */
public class SkillCritical extends AbstractEffect
{
	private final BaseStats _stat;
	
	public SkillCritical(StatsSet params)
	{
		_stat = params.getEnum("stat", BaseStats.class, BaseStats.STR);
	}
	
	@Override
	public void pump(Creature effected, Skill skill)
	{
		effected.getStat().mergeAdd(Stats.SKILL_CRITICAL, _stat.ordinal());
	}
}
