package team.creative.littleframes.common.util;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FrameUrlUtils {
    
    public static String getUrl(String url) {
        Minecraft mc = Minecraft.getMinecraft();
        String result = url.replace("$(name)", mc.player.getDisplayNameString()).replace("$(uuid)", mc.player.getCachedUniqueIdString());
        if (result.startsWith("minecraft://"))
            result = result.replace("minecraft://", "file:///" + mc.mcDataDir.getAbsolutePath().replace("\\", "/") + "/");
        return result;
    }
    
}
