package com.example.examplemod;

import com.example.examplemod.Module.COMBAT.*;
import com.example.examplemod.Module.EXPLOITS.ClickTP;
import com.example.examplemod.Module.MISC.Panic;
import com.example.examplemod.Module.MISC.Particles;
import com.example.examplemod.Module.MOVEMENT.*;
import com.example.examplemod.Module.Module;
import clickgui.ClickGuiScreen;
import com.example.examplemod.Module.EXPLOITS.BlockReach;
import com.example.examplemod.Module.OTHER.HUD;
import com.example.examplemod.Module.RENDER.*;
import com.example.examplemod.Module.WORLD.Scaffold;
import org.lwjgl.opengl.Display;

import java.util.concurrent.CopyOnWriteArrayList;

public class Client {
    public static String name = "Temple Client 1.12.2";
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();

    public static ClickGuiScreen clickGui;
    public static String cName;

    public static void startup(){
        Display.setTitle(name);

        modules.add(new BlockReach());
        modules.add(new TriggerBot());
        modules.add(new Particles());
        modules.add(new Fly());
        modules.add(new Speed());
        modules.add(new Glide());
        modules.add(new Jesus());
        modules.add(new Sprint());
        modules.add(new BHOP());
        modules.add(new GlowESP());
        modules.add(new FullBright());
        modules.add(new TargetHUD());
        modules.add(new NameTags());
        modules.add(new ViewModel());
        modules.add(new Tracers());
        modules.add(new KillAura());
        modules.add(new AimBot());
        modules.add(new Panic());
        modules.add(new HitBox());
        modules.add(new ChestESP());
        modules.add(new ItemsESP());
        modules.add(new AttackTrace());
        modules.add(new BoatFly());
        modules.add(new HightJump());
        modules.add(new FastFall());
        modules.add(new Spider());
        modules.add(new AirJump());
        modules.add(new SpawnerESP());
        modules.add(new ClickTP());
        modules.add(new Scaffold());
        modules.add(new AntiBot());
        modules.add(new Yaw());
        modules.add(new HUD());




        clickGui = new ClickGuiScreen();
    }

    public static void keyPress(int key) {
        for (Module m : modules) {
            if (m.getKey() == key) {
                m.toggle();
            }
        }
    }
}