package com.jordsta.stuff;

import com.jordsta.stuff.blocks.blankGlass;
import com.jordsta.stuff.blocks.dropLight;
import com.jordsta.stuff.blocks.endOre;
import com.jordsta.stuff.blocks.safetyTorch;
import com.jordsta.stuff.blocks.secretStone;
import com.jordsta.stuff.items.ironNugget;
import com.jordsta.stuff.items.lightDust;
import com.jordsta.stuff.items.moneyAxe;
import com.jordsta.stuff.items.moneyBlade;
import com.jordsta.stuff.items.moneyPick;
import com.jordsta.stuff.items.moneyShovel;
import com.jordsta.stuff.items.unrefinedCurrency;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Main
{
	//Proxies
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	    	//Creative Tab
    	public static CreativeTabs jordsutilsTab = new jordsUtils("Jordan's Stuff");

	//Blocks
    public static Block endOre;
    public static Block safetyTorch;
    public static Block dropLight;
    public static Block blankGlass;
    public static Block secretStone;
    
  
    //Items
    public static Item unrefinedCurrency;
    public static Item moneyPick;
    public static Item lightDust;
    public static Item ironNugget;
    public static Item moneyAxe;
    public static Item moneyShovel;
    public static Item moneyBlade;
    
    //Tool Material
    public static final Item.ToolMaterial MONEY = EnumHelper.addToolMaterial("MONEY", 7, -1, 200.0F, 200.0F, 25);
    
    
    
    
    @EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
    	
    	
    	
    	//World gen
    	GameRegistry.registerWorldGenerator(new endOreGen(), -1);
    	

    	
    	//New Block
    	endOre = new endOre();
    	safetyTorch = new safetyTorch();
    	dropLight = new dropLight();
    	blankGlass = new blankGlass();
    	secretStone = new secretStone();
    	
    	
    	//New Items
    	unrefinedCurrency = new unrefinedCurrency();
    	moneyPick = new moneyPick(20, MONEY);
    	lightDust = new lightDust();
    	ironNugget = new ironNugget();
    	moneyBlade = new moneyBlade(20, MONEY);
    	moneyShovel = new moneyShovel(20, MONEY);
    	moneyAxe = new moneyAxe(20, MONEY);
    	
    	//Register Blocks
    	RegisterHelper.registerBlock(endOre);
    	RegisterHelper.registerBlock(safetyTorch);
    	RegisterHelper.registerBlock(dropLight);
    	RegisterHelper.registerBlock(blankGlass);
    	RegisterHelper.registerBlock(secretStone);
    	
    	
    	//Register Items
    	RegisterHelper.registerItem(unrefinedCurrency);
    	RegisterHelper.registerItem(moneyPick);
    	RegisterHelper.registerItem(lightDust);
    	RegisterHelper.registerItem(ironNugget);
    	RegisterHelper.registerItem(moneyAxe);
    	RegisterHelper.registerItem(moneyBlade);
    	RegisterHelper.registerItem(moneyShovel);
    
    	
    	//OreDict
    	OreDictionary.registerOre("nuggetIron", new ItemStack(ironNugget));
    	//Recipes
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.registerTileEntities();
    }
}
