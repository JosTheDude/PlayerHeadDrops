package xyz.joscodes.playerheadsdrop;

import xyz.joscodes.playerheadsdrop.listeners.DeathListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerHeadDrops extends JavaPlugin {
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
		getLogger().info("Player Heads Drop Enabled!");
	}
}
