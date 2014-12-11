package com.jordsta.stuff.items;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class moneyPick extends ItemPickaxe{
    public moneyPick(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("moneyPick");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Main.jordsutilsTab);
    }
}
