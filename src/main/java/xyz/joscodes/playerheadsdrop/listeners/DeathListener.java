package xyz.joscodes.playerheadsdrop.listeners;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class DeathListener implements Listener {
	@EventHandler
	public void onDeath(PlayerDeathEvent event) {

		Player p = event.getEntity();
		if (p.getKiller() != null) {
			Player killer = p.getKiller();
			ItemStack playerskull = new ItemStack(Material.PLAYER_HEAD, 1, (short)SkullType.PLAYER.ordinal());
			SkullMeta meta = (SkullMeta)playerskull.getItemMeta();
			meta.setOwner(p.getName());
			playerskull.setItemMeta((ItemMeta)meta);
			killer.getWorld().dropItem(p.getLocation(), playerskull);
		}
	}
}

