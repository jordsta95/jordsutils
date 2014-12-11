package com.jordsta.stuff.blocks;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class secretStone extends BlockStone {
//need this block to have Stone texture from Minecraft
	public secretStone()
	{
		setBlockName("secretStone");
		setCreativeTab(Main.jordsutilsTab);
	}
	
	@Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }

}
