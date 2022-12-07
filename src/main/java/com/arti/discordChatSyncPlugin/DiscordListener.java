package com.arti.discordChatSyncPlugin;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import com.arti.discordChatSyncPlugin.DiscordChatSyncPlugin;

public class DiscordListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String author = event.getAuthor().toString();
        String message = event.getMessage().toString();
        // DiscordChatSyncPlugin.discordToMinecraft(event, "<" + author + "> " + message);
    }
}
