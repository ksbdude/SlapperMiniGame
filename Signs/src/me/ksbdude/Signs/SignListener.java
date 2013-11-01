package me.ksbdude.Signs;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignListener implements Listener {
 
	@EventHandler
	public void Sign(SignChangeEvent event) {
		String line1 = event.getLine(0);
		String line2 = event.getLine(1);
		if(line1.equalsIgnoreCase("Slapper")) {
			if(line2.equalsIgnoreCase("Join")) {
				Player player = event.getPlayer();
				event.setLine(0,ChatColor.AQUA + "Slapper");
				event.setLine(0,ChatColor.BLUE + "Join");
				player.sendMessage(ChatColor.BLUE + "Slapper Join Sign has been Made!");
			}return;
		}return;
	}
}
