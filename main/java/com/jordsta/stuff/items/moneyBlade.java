package com.jordsta.stuff.items;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class moneyBlade extends ItemSword{
    public moneyBlade(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("moneyBlade");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Main.jordsutilsTab);
    }
}
