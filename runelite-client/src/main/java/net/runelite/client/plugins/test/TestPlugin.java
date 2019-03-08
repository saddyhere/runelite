package net.runelite.client.plugins.test;

import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.OverlayManager;
import javax.inject.Inject;

@PluginDescriptor(
        name = "Test Plugin",
        description = "Tests my plugin"
)
public class TestPlugin extends Plugin {

    @Inject
    private Client client;

    @Inject
    private TestPluginOverlay overlay;

    @Inject
    private OverlayManager overlayManager;


    @Override
    protected void startUp() throws Exception
    {
        overlayManager.add(overlay);
    }

    @Override
    protected void shutDown() throws Exception
    {
        overlayManager.remove(overlay);
    }

    /*private String getMessage() {
        return "Test HelloWorld!";
    }*/
}
