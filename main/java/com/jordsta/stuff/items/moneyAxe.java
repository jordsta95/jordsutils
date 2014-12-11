package com.jordsta.stuff.items;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class moneyAxe extends ItemAxe{
    public moneyAxe(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("moneyAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Main.jordsutilsTab);
    }
}
