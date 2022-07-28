package javredstone.redstone.transformers;

import javredstone.redstone.transformers.block.RedstoneTransformerBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.AbstractBlock.ContextPredicate;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RedstoneTransformers implements ModInitializer {
	public static final RedstoneTransformerBlock REDSTONE_TRANFORMER = new RedstoneTransformerBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).breakInstantly().nonOpaque());
	
	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("redstonetransformers", "redstone_transformer"), REDSTONE_TRANFORMER);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), REDSTONE_TRANFORMER);
		
		Registry.register(Registry.ITEM, new Identifier("redstonetransformers", "redstone_transformer"), new BlockItem(REDSTONE_TRANFORMER, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
