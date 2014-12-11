package com.jordsta.stuff.items;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class unrefinedCurrency extends Item {

	public unrefinedCurrency(){
		setUnlocalizedName("unrefinedCurrency");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Main.jordsutilsTab);
	}
}
