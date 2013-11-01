package me.ksbdude.Signs;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.block.Sign;

public class PlayerListener implements Listener {

	@EventHandler
	public void  interact(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action action = event.getAction();
		Material block = event.getClickedBlock().getType();
		if(action == Action.RIGHT_CLICK_BLOCK) { //right clicks sign
			if(block == Material.SIGN_POST || block == Material.WALL_SIGN) {
				Sign sign = (Sign)event.getClickedBlock().getState();
				String line1 = sign.getLine(0);
				String line2 = sign.getLine(1);
				if(line1.contains("Slapper")) {
					if(line2.contains("Join")) {
						player.sendMessage(ChatColor.DARK_RED + player.getName() + " Joined Slapper");
					}
				}
			}return;
		}return;
	}
}//end
