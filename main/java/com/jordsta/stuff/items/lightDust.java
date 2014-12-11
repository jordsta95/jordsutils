package com.jordsta.stuff.items;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class lightDust extends Item {
	public lightDust(){
		setUnlocalizedName("lightDust");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Main.jordsutilsTab);
	}
}
