package girraiffe.autosprint.events;

import girraiffe.autosprint.keybinds.Keybindings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class OnKeyPress {

    public static boolean isInWorld = false;
    private static final int SPRINT_KEY = Minecraft.getMinecraft().gameSettings.keyBindSprint.getKeyCode();
    private  static boolean toggled = false;
    KeyBinding sprintBind = Keybindings.toggleSprint;

    @SubscribeEvent(receiveCanceled = true)
    public void onKeyPress(InputEvent.KeyInputEvent event){
        if(sprintBind.isPressed() && isInWorld){
            toggled = !toggled;
            KeyBinding.setKeyBindState(SPRINT_KEY, toggled);
        }
    }
}
