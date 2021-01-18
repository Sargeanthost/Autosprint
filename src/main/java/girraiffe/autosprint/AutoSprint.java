package girraiffe.autosprint;

import girraiffe.autosprint.events.OnClientTickHoldSprint;
import girraiffe.autosprint.events.OnWorldLoad;
import girraiffe.autosprint.events.OnWorldUnload;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.AUTO_SPRINT, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AutoSprint {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
         MinecraftForge.EVENT_BUS.register(new OnClientTickHoldSprint());
         MinecraftForge.EVENT_BUS.register((new OnWorldLoad()));
         MinecraftForge.EVENT_BUS.register(new OnWorldUnload());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}