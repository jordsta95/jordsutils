package com.jordsta.stuff.blocks;

import java.util.Random;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class dropLight extends BlockFalling {
	
	public dropLight()
		{
			setBlockName("dropLight");
			setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(Main.jordsutilsTab);
			setHardness(20.0f);
			setResistance(3.0f);
			setStepSound(Block.soundTypeGlass);
			setLightLevel(1.0F);
		}
	public static boolean fallinstantly = true;
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Main.lightDust;
	}


}
