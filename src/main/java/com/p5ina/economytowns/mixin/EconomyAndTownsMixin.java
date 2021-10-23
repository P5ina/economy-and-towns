package com.p5ina.economytowns.mixin;

import com.p5ina.economytowns.EconomyAndTownsMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class EconomyAndTownsMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		EconomyAndTownsMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
