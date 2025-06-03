package com.gedo.tutorialmod.datagen;

import com.gedo.tutorialmod.TutorialMod;
import com.gedo.tutorialmod.item.Moditems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(Moditems.BISMUTH.get());
        basicItem(Moditems.RAW_BISMUTH.get());

        basicItem(Moditems.RADISH.get());
        basicItem(Moditems.STARLIGHT_ASHES.get());
        basicItem(Moditems.FROSTFIRE_ICE.get());
        basicItem(Moditems.CHISEL.get());
    }
}