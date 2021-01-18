package girraiffe.autosprint.events;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnWorldUnload {

    @SubscribeEvent
    public void onWorldUnload(WorldEvent.Unload event){
        OnKeyPress.isInWorld = false;
    }
}
