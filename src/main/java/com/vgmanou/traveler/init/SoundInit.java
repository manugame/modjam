package com.vgmanou.traveler.init;

import com.vgmanou.traveler.TravelerMain;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TravelerMain.MODID);

    public static final RegistryObject<SoundEvent> DELTA_SOUND = SOUNDS.register("item.delta_sound", () -> new SoundEvent(new ResourceLocation(TravelerMain.MODID, "item.delta_sound")));
    public static final RegistryObject<SoundEvent> HENRY_SOUND = SOUNDS.register("item.henry_sound", () -> new SoundEvent(new ResourceLocation(TravelerMain.MODID, "item.henry_sound")));

}
