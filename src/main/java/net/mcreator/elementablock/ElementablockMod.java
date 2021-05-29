/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.elementablock;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;

import net.mcreator.elementablock.block.VerticalwarpedplanksBlock;
import net.mcreator.elementablock.block.VerticalspruceplanksBlock;
import net.mcreator.elementablock.block.VerticaloakplanksBlock;
import net.mcreator.elementablock.block.VerticaljungleplanksBlock;
import net.mcreator.elementablock.block.VerticaldarkoakplanksBlock;
import net.mcreator.elementablock.block.VerticalcrimsonplanksBlock;
import net.mcreator.elementablock.block.VerticalbirchplanksBlock;
import net.mcreator.elementablock.block.VerticalacaciaplanksBlock;
import net.mcreator.elementablock.block.GranitebricksBlock;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class ElementablockMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Block Granitebricks_BLOCK = Registry.register(Registry.BLOCK, id("granitebricks"), new GranitebricksBlock());
	public static final BlockItem Granitebricks_ITEM = Registry.register(Registry.ITEM, id("granitebricks"),
			new BlockItem(Granitebricks_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block Verticaloakplanks_BLOCK = Registry.register(Registry.BLOCK, id("verticaloakplanks"), new VerticaloakplanksBlock());
	public static final BlockItem Verticaloakplanks_ITEM = Registry.register(Registry.ITEM, id("verticaloakplanks"),
			new BlockItem(Verticaloakplanks_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block Verticalbirchplanks_BLOCK = Registry.register(Registry.BLOCK, id("verticalbirchplanks"),
			new VerticalbirchplanksBlock());
	public static final BlockItem Verticalbirchplanks_ITEM = Registry.register(Registry.ITEM, id("verticalbirchplanks"),
			new BlockItem(Verticalbirchplanks_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block Verticaldarkoakplanks_BLOCK = Registry.register(Registry.BLOCK, id("verticaldarkoakplanks"),
			new VerticaldarkoakplanksBlock());
	public static final BlockItem Verticaldarkoakplanks_ITEM = Registry.register(Registry.ITEM, id("verticaldarkoakplanks"),
			new BlockItem(Verticaldarkoakplanks_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block Verticalacaciaplanks_BLOCK = Registry.register(Registry.BLOCK, id("verticalacaciaplanks"),
			new VerticalacaciaplanksBlock());
	public static final BlockItem Verticalacaciaplanks_ITEM = Registry.register(Registry.ITEM, id("verticalacaciaplanks"),
			new BlockItem(Verticalacaciaplanks_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block Verticalspruceplanks_BLOCK = Registry.register(Registry.BLOCK, id("verticalspruceplanks"),
			new VerticalspruceplanksBlock());
	public static final BlockItem Verticalspruceplanks_ITEM = Registry.register(Registry.ITEM, id("verticalspruceplanks"),
			new BlockItem(Verticalspruceplanks_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block Verticaljungleplanks_BLOCK = Registry.register(Registry.BLOCK, id("verticaljungleplanks"),
			new VerticaljungleplanksBlock());
	public static final BlockItem Verticaljungleplanks_ITEM = Registry.register(Registry.ITEM, id("verticaljungleplanks"),
			new BlockItem(Verticaljungleplanks_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block Verticalcrimsonplanks_BLOCK = Registry.register(Registry.BLOCK, id("verticalcrimsonplanks"),
			new VerticalcrimsonplanksBlock());
	public static final BlockItem Verticalcrimsonplanks_ITEM = Registry.register(Registry.ITEM, id("verticalcrimsonplanks"),
			new BlockItem(Verticalcrimsonplanks_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block Verticalwarpedplanks_BLOCK = Registry.register(Registry.BLOCK, id("verticalwarpedplanks"),
			new VerticalwarpedplanksBlock());
	public static final BlockItem Verticalwarpedplanks_ITEM = Registry.register(Registry.ITEM, id("verticalwarpedplanks"),
			new BlockItem(Verticalwarpedplanks_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing ElementablockMod");
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("elementablock", s);
	}
}
