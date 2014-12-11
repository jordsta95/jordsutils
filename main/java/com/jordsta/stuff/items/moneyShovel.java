package com.jordsta.stuff.items;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class moneyShovel extends ItemSpade{
    public moneyShovel(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("moneyShovel");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Main.jordsutilsTab);
    }
}

