package girraiffe.autosprint.keybinds;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class Keybindings {

    public static KeyBinding toggleSprint;

    public static void register(){
        //TODO Fix localization for "description" param.
        toggleSprint = new KeyBinding("key.toggleSprint.desc", Keyboard.KEY_C, "key.categories.movement");
        ClientRegistry.registerKeyBinding(toggleSprint);
    }
}
