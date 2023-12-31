package xyz.templecheats.templeclient.impl.modules.render;

import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;
import xyz.templecheats.templeclient.TempleClient;
import xyz.templecheats.templeclient.impl.modules.Module;
import xyz.templecheats.templeclient.impl.gui.clickgui.setting.Setting;

public class Fov extends Module {

    private float originalFOV = 0;

    public Fov() {
        super("Fov", Keyboard.KEY_NONE, Category.RENDER);
        TempleClient.settingsManager.rSetting(new Setting("FOV", this, 70, 5, 150, true));
    }

    @Override
    public void onEnable() {
        originalFOV = Minecraft.getMinecraft().gameSettings.fovSetting;
    }

    @Override
    public void onDisable() {
        Minecraft.getMinecraft().gameSettings.fovSetting = originalFOV;
    }

    @Override
    public void onUpdate() {
        if(this.isEnabled()) {
            double newFOV = TempleClient.settingsManager.getSettingByName(this.name, "FOV").getValDouble();
            Minecraft.getMinecraft().gameSettings.fovSetting = (float)newFOV;
        }
    }
}
