package girraiffe.autosprint.events;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class OnClientTickHoldSprint {

    public static boolean isInWorld = false;
    private final int SPRINT_KEY = Minecraft.getMinecraft().gameSettings.keyBindSprint.getKeyCode();

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event) {
        if(isInWorld){
            KeyBinding.setKeyBindState(SPRINT_KEY, true);
        }
    }
}