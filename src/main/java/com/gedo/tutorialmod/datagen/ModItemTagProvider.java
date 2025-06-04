package com.gedo.tutorialmod.datagen;

import com.gedo.tutorialmod.TutorialMod;
import com.gedo.tutorialmod.item.Moditems;
import com.gedo.tutorialmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(Moditems.BISMUTH.get())
                .add(Moditems.RAW_BISMUTH.get())
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.COMPASS);

        tag(ItemTags.SWORDS)
                .add(Moditems.BISMUTH_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(Moditems.BISMUTH_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(Moditems.BISMUTH_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(Moditems.BISMUTH_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(Moditems.BISMUTH_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(Moditems.BISMUTH_HELMET.get())
                .add(Moditems.BISMUTH_CHESTPLATE.get())
                .add(Moditems.BISMUTH_LEGGINGS.get())
                .add(Moditems.BISMUTH_BOOTS.get());

    }
}
