package xyz.templecheats.templeclient.impl.modules.render;

import xyz.templecheats.templeclient.impl.modules.Module;
import xyz.templecheats.templeclient.api.util.render.RenderUtil;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class PlayerModel extends Module {
    public PlayerModel() {
        super("PlayerModel", Keyboard.KEY_NONE, Module.Category.RENDER);
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Post event) {
        switch (event.getType()) {
            case TEXT:
                RenderUtil.renderEntity(mc.player, 28, 30, 80);
                break;
            default:
                break;
        }
    }
}