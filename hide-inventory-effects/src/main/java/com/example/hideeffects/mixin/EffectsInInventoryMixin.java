package com.example.hideeffects.mixin;

import net.minecraft.client.gui.screens.inventory.EffectsInInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EffectsInInventory.class)
public class EffectsInInventoryMixin {

    // ไม่ระบุ parameter ของ render เพื่อให้ทนต่อการเปลี่ยนลายเซ็นระหว่างเวอร์ชัน
    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void hideeffects$cancelRender(CallbackInfo ci) {
        ci.cancel();
    }
}
