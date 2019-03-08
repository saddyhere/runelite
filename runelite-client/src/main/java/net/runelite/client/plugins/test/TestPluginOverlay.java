package net.runelite.client.plugins.test;

import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.tooltip.Tooltip;
import net.runelite.client.ui.overlay.tooltip.TooltipManager;

class TestPluginOverlay extends Overlay {

    private final Client client;
    private final TestPlugin plugin;
    private final TooltipManager tooltipManager;

    @Inject
    private TestPluginOverlay(Client client, TestPlugin plugin, TooltipManager tooltipManager)
    {
        this.client = client;
        this.plugin = plugin;
        this.tooltipManager = tooltipManager;
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        final String content = "Hello WOrld!";
        tooltipManager.add(new Tooltip(content));


        return null;
    }
}

