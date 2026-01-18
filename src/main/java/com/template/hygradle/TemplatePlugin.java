package com.template.hygradle;

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.template.hygradle.commands.TemplateCommand;
import com.template.hygradle.events.TemplateEventHandler;

public class TemplatePlugin extends JavaPlugin {
    public TemplatePlugin(JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        getCommandRegistry().registerCommand(new TemplateCommand("template", "Template Command"));
        getEventRegistry().registerGlobal(PlayerReadyEvent.class, TemplateEventHandler::onPlayerReady);
    }
}
