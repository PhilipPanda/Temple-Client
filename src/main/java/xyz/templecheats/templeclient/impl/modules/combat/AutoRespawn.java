package xyz.templecheats.templeclient.impl.modules.combat;

import org.lwjgl.input.Keyboard;
import xyz.templecheats.templeclient.impl.modules.Module;
import net.minecraft.client.Minecraft;

public class AutoRespawn extends Module {

    private long deathTime = 0;

    public AutoRespawn() {
        super("AutoRespawn", Keyboard.KEY_NONE, Category.COMBAT);
    }

    @Override
    public void onUpdate() {
        if (this.isEnabled()) {
            if (Minecraft.getMinecraft().player.isDead) {
                if (deathTime == 0) deathTime = System.currentTimeMillis();

                if (System.currentTimeMillis() - deathTime > 100) {
                    Minecraft.getMinecraft().player.respawnPlayer();
                    deathTime = 0;
                }
            } else {
                deathTime = 0;
            }
        }
    }
}
