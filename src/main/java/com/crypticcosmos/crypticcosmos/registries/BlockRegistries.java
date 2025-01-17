package com.crypticcosmos.crypticcosmos.registries;

import com.crypticcosmos.crypticcosmos.CrypticCosmos;
import com.crypticcosmos.crypticcosmos.blocks.*;
import com.crypticcosmos.crypticcosmos.world.feature.MondroveTree;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;

public class BlockRegistries {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CrypticCosmos.MOD_ID);

    // Overgrown Lunon
    public static final RegistryObject<Block> OVERGROWN_LUNON = BLOCKS.register("overgrown_lunon", OvergrownLunonBlock::new);
    public static final RegistryObject<Block> FUNGAL_LUNON = BLOCKS.register("fungal_lunon", OvergrownLunonBlock::new);

    // Lunon
    public static final RegistryObject<Block> LUNON = BLOCKS.register("lunon", () ->
            new Block(Properties.of(Material.STONE)
                    .strength(2.0f, 10)
                    .sound(SoundType.STONE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops())
    );

    public static final RegistryObject<Block> LUNON_BRICKS = BLOCKS.register("lunon_bricks", () ->
            new Block(Properties.of(Material.STONE)
                    .strength(4.0f, 15)
                    .sound(SoundType.STONE)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops())
    );

    public static final RegistryObject<Block> LUNON_BRICK_SLAB = BLOCKS.register("lunon_brick_slab", () ->
            new SlabBlock(Properties.copy(LUNON_BRICKS.get()))
    );

    public static final RegistryObject<Block> LUNON_BRICK_STAIRS = BLOCKS.register("lunon_brick_stairs", () ->
            new StairsBlock(() -> LUNON_BRICKS.get().defaultBlockState(), Properties.copy(LUNON_BRICKS.get()))
    );

    public static final RegistryObject<Block> POLISHED_LUNON = BLOCKS.register("polished_lunon", () ->
            new Block(Properties.copy(LUNON_BRICKS.get()))
    );

    public static final RegistryObject<Block> POLISHED_LUNON_SLAB = BLOCKS.register("polished_lunon_slab", () ->
            new SlabBlock(Properties.copy(POLISHED_LUNON.get()))
    );

    public static final RegistryObject<Block> CHISELED_POLISHED_LUNON = BLOCKS.register("chiseled_polished_lunon", () ->
            new Block(Properties.copy(POLISHED_LUNON.get()))
    );

    public static final RegistryObject<Block> MOSSY_LUNON = BLOCKS.register("mossy_lunon", () ->
            new Block(Properties.copy(OVERGROWN_LUNON.get()))
    );

    public static final RegistryObject<Block> LUNON_DUST = BLOCKS.register("lunon_dust", () ->
            new SandBlock(22, Properties.of(Material.SAND)
                    .strength(0.5F)
                    .sound(SoundType.SAND))
    );

    //Moon Wood
    public static final RegistryObject<Block> MONDROVE_LOG = BLOCKS.register("mondrove_log", MondroveLog::new);

    public static final RegistryObject<Block> MONDROVE_WOOD = BLOCKS.register("mondrove_wood", MondroveLog::new);

    public static final RegistryObject<Block> STRIPPED_MONDROVE_LOG = BLOCKS.register("stripped_mondrove_log", MondroveLog::new);

    public static final RegistryObject<Block> STRIPPED_MONDROVE_WOOD = BLOCKS.register("stripped_mondrove_wood", MondroveLog::new);

    public static final RegistryObject<Block> MONDROVE_PLANKS = BLOCKS.register("mondrove_planks", () ->
            new InfectableBlock(Properties.copy(Blocks.BIRCH_PLANKS))
    );

    public static final RegistryObject<Block> MONDROVE_PLANKS_SLAB = BLOCKS.register("mondrove_planks_slab", () ->
            new SlabBlock(Properties.copy(MONDROVE_PLANKS.get())));

    public static final RegistryObject<Block> MONDROVE_PLANKS_STAIRS = BLOCKS.register("mondrove_planks_stairs", () ->
            new StairsBlock(() -> MONDROVE_PLANKS.get().defaultBlockState(), Properties.copy(MONDROVE_PLANKS.get()))
    );

    public static final RegistryObject<Block> MONDROVE_SAPLING = BLOCKS.register("mondrove_sapling", () ->
            new SaplingBlock(new MondroveTree(), Properties.copy(Blocks.BIRCH_SAPLING)) {
                @Override
                public boolean mayPlaceOn(@Nonnull BlockState state, @Nonnull IBlockReader worldIn, @Nonnull BlockPos pos) {
                    return state.is(TagRegistries.LUNARA_PLANTABLE_BLOCKS);
                }
            });

    public static final RegistryObject<Block> MONDROVE_LEAVES = BLOCKS.register("mondrove_leaves", () ->
            new LeavesBlock(Properties.copy(Blocks.OAK_LEAVES))
    );

    public static final RegistryObject<Block> OSMINSTEM_CAP = BLOCKS.register("osminstem_cap", () ->
            new LeavesBlock(Properties.copy(Blocks.OAK_LEAVES))
    );

    public static final RegistryObject<Block> OSMINSTEM_HIVE = BLOCKS.register("osminstem_hive", () ->
            new Block(Properties.copy(Blocks.STONE))
    );

    public static final RegistryObject<Block> OSMINSTEM_LOG = BLOCKS.register("osminstem_log", () ->
            new RotatedPillarBlock(Properties.copy(Blocks.CRIMSON_STEM))
    );

    public static final RegistryObject<Block> STRIPPED_OSMINSTEM_LOG = BLOCKS.register("stripped_osminstem_log", () ->
            new RotatedPillarBlock(Properties.copy(Blocks.CRIMSON_STEM))
    );

    public static final RegistryObject<Block> OSMINSTEM_WOOD = BLOCKS.register("osminstem_wood", () ->
            new RotatedPillarBlock(Properties.copy(Blocks.CRIMSON_STEM))
    );

    public static final RegistryObject<Block> STRIPPED_OSMINSTEM_WOOD = BLOCKS.register("stripped_osminstem_wood", () ->
            new RotatedPillarBlock(Properties.copy(Blocks.CRIMSON_STEM))
    );

    public static final RegistryObject<Block> OSMINSTEM_POROUS_LOG = BLOCKS.register("osminstem_porous_log", () ->
            new RotatedPillarBlock(Properties.copy(Blocks.CRIMSON_STEM))
    );

    public static final RegistryObject<Block> MONDROVE_FUNGUS = BLOCKS.register("mondrove_fungus", MondroveFungus::new);

    public static final RegistryObject<Block> MONDROVE_FUNGUS_BLOCK = BLOCKS.register("mondrove_fungus_block",
            () -> new Block(Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));

    public static final RegistryObject<Block> MONDROVE_FUNGUS_SPORE_BLOCK = BLOCKS.register("mondrove_fungus_spore_block",
            () -> new Block(Properties.copy(MONDROVE_FUNGUS_BLOCK.get())));

    public static final RegistryObject<Block> SMOOTH_MONDROVE_FUNGUS = BLOCKS.register("smooth_mondrove_fungus",
            () -> new Block(Properties.copy(MONDROVE_FUNGUS_BLOCK.get())));

    public static final RegistryObject<Block> SMOOTH_MONDROVE_BRICKS = BLOCKS.register("smooth_mondrove_bricks",
            () -> new Block(Properties.copy(MONDROVE_FUNGUS_BLOCK.get())));

    public static final RegistryObject<Block> RIFT_BLOCK = BLOCKS.register("rift_block", RiftBlock::new);

    // Umbral Plains
    public static final RegistryObject<Block> UMBRAL_DUNE = BLOCKS.register("umbral_dune", () ->
            new SandBlock(22, Properties.of(Material.SAND)
                    .strength(0.5F)
                    .sound(SoundType.SAND)));
}

