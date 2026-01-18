package com.template.hygradle.commands;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;

import java.util.concurrent.CompletableFuture;

public class TemplateCommand extends AbstractCommand {
    public TemplateCommand(String name, String description) {
        super(name, description);
    }

    @Override
    protected CompletableFuture<Void> execute(CommandContext commandContext) {
        commandContext.sendMessage(Message.raw("Hello from TemplateCommand!"));
        return CompletableFuture.completedFuture(null);
    }
}
