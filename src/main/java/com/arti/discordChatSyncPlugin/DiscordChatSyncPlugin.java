package com.arti.discordChatSyncPlugin;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.bukkit.plugin.java.JavaPlugin;

public class DiscordChatSyncPlugin extends JavaPlugin {
    public JDABuilder builder;
    @Override
    public void onEnable() {
        getLogger().info("Discord Chat Sync Plugin enabled.");
        builder = JDABuilder.createDefault("");
        // Disable parts of the cache
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        // Enable the bulk delete event
        builder.setBulkDeleteSplittingEnabled(false);
        builder.build();
    }

    @Override
    public void onDisable() {
        getLogger().info("Discord Chat Sync Plugin enabled.");
    }

    public void discordToMinecraft(MessageReceivedEvent event, String data) {
        getServer().broadcastMessage(data);
    }
}
