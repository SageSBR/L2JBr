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
package org.l2jbr.gameserver.model.alchemy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.l2jbr.gameserver.model.StatsSet;
import org.l2jbr.gameserver.model.holders.ItemHolder;

/**
 * @author Sdw
 */
public class AlchemyCraftData
{
	private final int _id;
	private final int _level;
	private final int _grade;
	private final int _category;
	private Set<ItemHolder> _ingredients;
	private ItemHolder _productionSuccess;
	private ItemHolder _productionFailure;
	
	public AlchemyCraftData(StatsSet set)
	{
		_id = set.getInt("id");
		_level = set.getInt("level");
		_grade = set.getInt("grade");
		_category = set.getInt("category");
	}
	
	public int getId()
	{
		return _id;
	}
	
	public int getLevel()
	{
		return _level;
	}
	
	public int getGrade()
	{
		return _grade;
	}
	
	public int getCategory()
	{
		return _category;
	}
	
	public void addIngredient(ItemHolder ingredient)
	{
		if (_ingredients == null)
		{
			_ingredients = new HashSet<>();
		}
		_ingredients.add(ingredient);
	}
	
	public Set<ItemHolder> getIngredients()
	{
		return _ingredients != null ? _ingredients : Collections.emptySet();
	}
	
	public void setProductionSuccess(ItemHolder item)
	{
		_productionSuccess = item;
	}
	
	public ItemHolder getProductionSuccess()
	{
		return _productionSuccess;
	}
	
	public void setProductionFailure(ItemHolder item)
	{
		_productionFailure = item;
	}
	
	public ItemHolder getProductionFailure()
	{
		return _productionFailure;
	}
}
