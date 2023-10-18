package de.flo.magica2.core.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_MAGICAL = "key.category.magica2.magical";
    public static final String KEY_ACTIVATE_SLOW_GRAV = "key.magica2.activate_slow_grav";

    public static final KeyMapping ACTIVATE_SLOW_GRAV = new KeyMapping(KEY_ACTIVATE_SLOW_GRAV, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY_MAGICAL);

}
