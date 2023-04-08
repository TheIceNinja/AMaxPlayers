package net.theiceninja.amaxplayers.listeners;

import net.theiceninja.amaxplayers.MaxPlayersPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public final class MaxListener implements Listener {

    private final MaxPlayersPlugin plugin;

    public MaxListener(MaxPlayersPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void onServerListPing(ServerListPingEvent event) {
        event.setMaxPlayers(plugin.getServer().getMaxPlayers());
    }
}
