package com.jordsta.stuff.blocks;

import java.util.Random;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.RegistryNamespaced;

public class endOre extends Block {

	public endOre()
	{
		super(Material.rock);
		setBlockName("endOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Main.jordsutilsTab);
		setHardness(20.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 7);
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Main.unrefinedCurrency;
	}

}
