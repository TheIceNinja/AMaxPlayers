package net.theiceninja.amaxplayers;

import net.theiceninja.amaxplayers.commands.SetMaxCommand;
import net.theiceninja.amaxplayers.listeners.MaxListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MaxPlayersPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("amaxplayers").setExecutor(new SetMaxCommand(this));
        getServer().getPluginManager().registerEvents(new MaxListener(), this);
        Bukkit.setMaxPlayers(getConfig().getInt("num"));
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {}
}
