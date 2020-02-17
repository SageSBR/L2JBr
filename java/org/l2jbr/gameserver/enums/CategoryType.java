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
package org.l2jbr.gameserver.enums;

/**
 * This class defines all category types.
 * @author xban1x
 */
public enum CategoryType
{
	FIGHTER_GROUP,
	MAGE_GROUP,
	WIZARD_GROUP,
	CLERIC_GROUP,
	ATTACKER_GROUP,
	TANKER_GROUP,
	FIRST_CLASS_GROUP,
	SECOND_CLASS_GROUP,
	THIRD_CLASS_GROUP,
	FOURTH_CLASS_GROUP,
	EQUIP_ENABLE_R,
	FIFTH_CLASS_GROUP,
	SIXTH_CLASS_GROUP,
	SIXTH_SIGEL_GROUP,
	SIXTH_TIR_GROUP,
	SIXTH_OTHEL_GROUP,
	SIXTH_YR_GROUP,
	SIXTH_FEOH_GROUP,
	SIXTH_IS_GROUP,
	SIXTH_WYNN_GROUP,
	SIXTH_EOLH_GROUP,
	BOUNTY_HUNTER_GROUP,
	WARSMITH_GROUP,
	SUMMON_NPC_GROUP,
	KNIGHT_GROUP,
	WHITE_MAGIC_GROUP,
	HEAL_GROUP,
	ASSIST_MAGIC_GROUP,
	WARRIOR_GROUP,
	HUMAN_2ND_GROUP,
	ELF_2ND_GROUP,
	DELF_2ND_GROUP,
	ORC_2ND_GROUP,
	DWARF_2ND_GROUP,
	STRIDER,
	STRIDER_GROUP,
	RED_STRIDER_GROUP,
	WOLF_GROUP,
	GROWN_UP_WOLF_GROUP,
	HATCHLING_GROUP,
	BABY_PET_GROUP,
	UPGRADE_BABY_PET_GROUP,
	WYVERN_GROUP,
	ALL_WOLF_GROUP,
	WOLF,
	SIN_EATER_GROUP,
	PET_GROUP,
	ITEM_EQUIP_PET_GROUP,
	SUBJOB_GROUP_DAGGER,
	SUBJOB_GROUP_BOW,
	SUBJOB_GROUP_KNIGHT,
	SUBJOB_GROUP_SUMMONER,
	SUBJOB_GROUP_HALF_HEALER,
	SUBJOB_GROUP_DANCE,
	SUBJOB_GROUP_WIZARD,
	HUMAN_FALL_CLASS,
	HUMAN_WALL_CLASS,
	HUMAN_MALL_CLASS,
	HUMAN_CALL_CLASS,
	ELF_FALL_CLASS,
	ELF_MALL_CLASS,
	ELF_WALL_CLASS,
	ELF_CALL_CLASS,
	DELF_FALL_CLASS,
	DELF_MALL_CLASS,
	DELF_WALL_CLASS,
	DELF_CALL_CLASS,
	ORC_FALL_CLASS,
	ORC_MALL_CLASS,
	DWARF_ALL_CLASS,
	DWARF_BOUNTY_CLASS,
	DWARF_SMITH_CLASS,
	KAMAEL_ALL_CLASS,
	KAMAEL_FIRST_CLASS_GROUP,
	KAMAEL_SECOND_CLASS_GROUP,
	KAMAEL_THIRD_CLASS_GROUP,
	KAMAEL_FOURTH_CLASS_GROUP,
	BEGINNER_FIGHTER,
	BEGINNER_MAGE,
	KAMAEL_MALE_MAIN_OCCUPATION,
	KAMAEL_FEMALE_MAIN_OCCUPATION,
	ARCHER_GROUP,
	SHIELD_MASTER,
	BARD,
	FORCE_MASTER,
	WEAPON_MASTER,
	BOW_MASTER,
	DAGGER_MASTER,
	HEAL_MASTER,
	WIZARD_MASTER,
	BUFF_MASTER,
	SUMMON_MASTER,
	WARRIOR_CLOACK,
	ROGUE_CLOACK,
	MAGE_CLOACK,
	SHIELD_MASTER2_3,
	BARD2_3,
	FORCE_MASTER2_3,
	WEAPON_MASTER2_3,
	BOW_MASTER2_3,
	DAGGER_MASTER2_3,
	HEAL_MASTER2_3,
	WIZARD_MASTER2_3,
	BUFF_MASTER2_3,
	SUMMON_MASTER2_3,
	ATTRIBUTE_GROUP_SUMMONER,
	SUB_GROUP_WARRIOR,
	SUB_GROUP_ROGUE,
	SUB_GROUP_KNIGHT,
	SUB_GROUP_SUMMONER,
	SUB_GROUP_WIZARD,
	SUB_GROUP_HEALER,
	SUB_GROUP_ENCHANTER,
	SUB_GROUP_HEC,
	SUB_GROUP_HEW,
	SUB_GROUP_HEF,
	SUB_GROUP_ORC,
	SUB_GROUP_WARE,
	SUB_GROUP_BLACK,
	SUB_GROUP_DE,
	SUB_GROUP_KAMAEL,
	LIGHT_TANKER_GROUP,
	DARK_TANKER_GROUP,
	MELEE_ATTACKER,
	RECOM_KNIGHT_GROUP,
	RECOM_MAGIC_GROUP,
	RECOM_WARRIOR_GROUP,
	RECOM_ROGUE_GROUP,
	RECOM_KAMAEL_GROUP,
	RECOM_ORCF_GROUP,
	RECOM_ORCM_GROUP,
	RECOM_ERTHEIAF_GROUP,
	RECOM_ERTHEIAM_GROUP,
	DEINONYCHUS_PET_GROUP,
	BEASTFARM_BEAST,
	BEASTFARM_INVADER,
	ICEQUEEN_NPC,
	FAIRY_PC_SIDE,
	FAIRY_WISP,
	FAIRY_GLIMMER,
	TANKER_CATEGORY,
	WARRIOR_CATEGORY,
	ROGUE_CATEGORY,
	ARCHER_CATEGORY,
	WIZARD_CATEGORY,
	SUMMONER_CATEGORY,
	HEALER_CATEGORY,
	ENCHANTER_CATEGORY,
	RUMBLE_MONSTERS,
	RUMBLE_GUARDIANS,
	TWO_POINT_MULTI_SUMMON,
	APM_ZERO_WARRIOR_GROUP,
	APM_ZERO_MAGE_GROUP,
	APM_1ST_KNIGHT_GROUP,
	APM_1ST_WARRIOR_GROUP,
	APM_1ST_WIZARD_GROUP,
	APM_1ST_HEALER_GROUP,
	APM_2ND_KNIGHT_GROUP,
	APM_2ND_WARRIOR_GROUP,
	APM_2ND_ROGUE_GROUP,
	APM_2ND_WIZARD_GROUP,
	APM_2ND_ARCHER_GROUP,
	APM_2ND_BUFFER_GROUP,
	APM_2ND_SUMMONER_GROUP,
	APM_2ND_ONLY_GROUP,
	APM_3RD_KNIGHT_GROUP,
	APM_3RD_WARRIOR_GROUP,
	APM_3RD_ROGUE_GROUP,
	APM_3RD_WIZARD_GROUP,
	APM_3RD_ARCHER_GROUP,
	APM_3RD_BUFFER_GROUP,
	APM_3RD_SUMMONER_GROUP,
	APM_3RD_ONLY_GROUP,
	SUBCLASS_TANKER,
	SUBCLASS_WARRIOR,
	SUBCLASS_ROUGE,
	SUBCLASS_ARCHER,
	SUBCLASS_WIZARD,
	SUBCLASS_SUMMON,
	SUBCLASS_HEAL,
	SUBCLASS_ENCHANTER,
	SUBCLASS_SPEACIAL,
	SUBCLASS_KAMAEL,
	EXCEPT_KAMAEL_GROUP,
	R_HUMANMAGE_GROUP,
	R_HUMANFIGHTER_GROUP,
	DIVISION_TANKER,
	DIVISION_WARRIOR,
	DIVISION_ROUGE,
	DIVISION_ARCHER,
	DIVISION_WIZARD,
	DIVISION_SUMMON,
	DIVISION_ENCHANTER,
	DIVISION_HEAL,
	HUMAN_FOURTH_CLASS_GROUP,
	ELF_FOURTH_CLASS_GROUP,
	DARKELF_FOURTH_CLASS_GROUP,
	ORC_FOURTH_CLASS_GROUP,
	DWARF_FOURTH_CLASS_GROUP,
	FOURTH_LANCE_CLASS_GROUP,
	FOURTH_BOW_CLASS_GROUP,
	EQUIP_ENABLE_HEAVY_ATTACK,
	EQUIP_ENABLE_HEAVY_DEFENSE,
	EQUIP_ENABLE_LIGHT_HIT,
	EQUIP_ENABLE_LIGHT_ENCHANT,
	EQUIP_ENABLE_ROBE_MAGIC,
	EQUIP_ENABLE_ROBE_RECOVERY,
	DILLER_GROUP,
	MAESTRO_GROUP,
	MAESTRO_GROUP_CRAFT,
	SUB_GROUP_WARRIOR2,
	SUB_GROUP_ROGUE2,
	SUB_GROUP_KNIGHT2,
	SUB_GROUP_SUMMONER2,
	SUB_GROUP_WIZARD2,
	SUB_GROUP_HEALER2,
	SUB_GROUP_ENCHANTER2,
	G_CARTIA_PC_GROUP,
	G_CARTIA_NPC_GROUP,
	HEAVY_GROUP,
	LIGHT_GROUP,
	ROBE_GROUP,
	M_WARRIOR_GROUP,
	PHYSICS_CLASS_GROUP,
	HEATSAND_SUMMON_CLASS_GROUP,
	MAGIC_CLASS_GROUP,
	LONG_DISTANCE_CLASS_GROUP,
	CLOSE_DISTANCE_CLASS_GROUP,
	HS_WIZARD_CLASS_GROUP,
	HS_WARRIOR_CLASS_GROUP,
	SUBCLASS_PALADIN,
	SUBCLASS_DARKAVENGER,
	SUBCLASS_TEMPLEKNIGHT,
	SUBCLASS_SHILLIENKNIGHT,
	SUBCLASS_GLADIATOR,
	SUBCLASS_WARLORD,
	SUBCLASS_DESTROYER,
	SUBCLASS_TYRAN,
	SUBCLASS_BERSERKER,
	SUBCLASS_TREASUREHUNTER,
	SUBCLASS_PLAINSWALKER,
	SUBCLASS_ABYSSWALKER,
	SUBCLASS_BOUNTYHUNTER,
	SUBCLASS_HAWKEYE,
	SUBCLASS_SILVERRANGER,
	SUBCLASS_PHANTOMRANGER,
	SUBCLASS_ARBALESTER,
	SUBCLASS_SORCERER,
	SUBCLASS_NECROMANCER,
	SUBCLASS_SPELLSINGER,
	SUBCLASS_SPELLHOWLER,
	SUBCLASS_SOULBREAKER,
	SUBCLASS_WARLOCK,
	SUBCLASS_ELEMENTALSUMMONER,
	SUBCLASS_PHANTOMSUMMONER,
	SUBCLASS_BISHOP,
	SUBCLASS_ELDER,
	SUBCLASS_SHILLIENELDER,
	SUBCLASS_PROPHET,
	SUBCLASS_SWORDSINGER,
	SUBCLASS_BLADEDANCER,
	SUBCLASS_WARCRYER,
	SUBCLASS_INSPECTOR,
	WINDREFINE_ERTHEIA_GROUP,
	WINDREFINE_ERTHEIA_GROUP1,
	WINDREFINE_ERTHEIA_GROUP2,
	ERTHEIA_ALL_CLASS,
	ERTHEIA_FIRST_CLASS_GROUP,
	ERTHEIA_SECOND_CLASS_GROUP,
	ERTHEIA_THIRD_CLASS_GROUP,
	ERTHEIA_FOURTH_CLASS_GROUP,
	ERTHEIA_WIZARD_GROUP,
	ERTHEIA_FIGHTER_GROUP,
	ERTHEIA_THIRD_WIZARD_GROUP,
	ERTHEIA_THIRD_FIGHTER_GROUP,
	VANGUARD_OF_ADEN_FCC,
	COMMON_MONSTER_FCC,
	EQEIP_ENABLE_LHAND,
	G_EV_MON_MINIGAME,
	HEAVY_ARMOR_CLASS,
	LIGHT_ARMOR_CLASS,
	ROBE_CLASS,
	EXCEPT_ERTHEIA_CLASS;
	
	/**
	 * Finds category by it's name
	 * @param categoryName
	 * @return A {@code CategoryType} if category was found, {@code null} if category was not found
	 */
	public static CategoryType findByName(String categoryName)
	{
		for (CategoryType type : values())
		{
			if (type.name().equalsIgnoreCase(categoryName))
			{
				return type;
			}
		}
		return null;
	}
}
