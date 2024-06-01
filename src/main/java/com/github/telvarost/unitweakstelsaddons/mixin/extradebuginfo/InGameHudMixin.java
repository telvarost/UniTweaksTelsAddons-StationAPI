package com.github.telvarost.unitweakstelsaddons.mixin.extradebuginfo;

import com.github.telvarost.unitweakstelsaddons.Config;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.stat.Stats;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.time.Duration;

@Environment(EnvType.CLIENT)
@Mixin(InGameHud.class)
public class InGameHudMixin extends DrawContext {

	@Shadow
	private Minecraft minecraft;

	@Inject(
		method = "render",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/client/font/TextRenderer;drawWithShadow(Ljava/lang/String;III)V"
		)
	)
	public void clientsideEssentials_render(float bl, boolean i, int j, int par4, CallbackInfo ci)  {
		if (Config.config.addDayCounterToDebugOverlay) {
			TextRenderer var8 = this.minecraft.textRenderer;
			long realDaysPlayed = Duration.ofSeconds(minecraft.field_2773.method_1989(Stats.PLAY_ONE_MINUTE) / 20).toDays();
			long gameDaysPlayed = Duration.ofSeconds(minecraft.field_2773.method_1989(Stats.PLAY_ONE_MINUTE) / 20).toMinutes() / 20;
			var8.drawWithShadow("Days Played: " + gameDaysPlayed + " (" + realDaysPlayed + ")", 2, 96, 14737632);
		}
	}
}
