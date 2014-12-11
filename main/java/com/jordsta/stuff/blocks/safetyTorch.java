package com.jordsta.stuff.blocks;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.Random;

public class safetyTorch extends Block implements ITileEntityProvider
{
	
	public safetyTorch()
	{
		super(Material.glass);
		this.setCreativeTab(Main.jordsutilsTab);
		this.setBlockName("safetyTorch");
		this.setLightLevel(4.0F);
		this.setTickRandomly(true);
		//setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setHardness(1.0f);
		setResistance(1.0f);
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) 
	{
		return new InterdictionTile();
	}
	

	
	
	public static String name = "safetyTorch";
	private String privateName = "safetyTorch";
	private IIcon[] icons = new IIcon[6];
	
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		for (int i = 0; i <icons.length; i++){
		icons[i] = iconRegister.registerIcon(Reference.MODID + ":" + name + i);
	}
	}
	
	@Override
	public IIcon getIcon(int side, int meta){
		return icons[side];
	}
   

}