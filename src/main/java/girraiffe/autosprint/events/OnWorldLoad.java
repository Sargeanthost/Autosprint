package girraiffe.autosprint.events;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnWorldLoad {

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {
        OnKeyPress.isInWorld = true;
    }
}
