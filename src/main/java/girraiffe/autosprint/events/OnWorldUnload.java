package girraiffe.autosprint.events;

import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnWorldUnload {
    @SubscribeEvent
    public void onWorldUnload(WorldEvent.Unload event){
        OnClientTickHoldSprint.isInWorld = false;
    }
}
