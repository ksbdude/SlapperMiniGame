package me.ksbdude.slapper;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

 
public class Main extends JavaPlugin  {
	public final Logger logger = Logger.getLogger("minecraft");
	
	public void onEnable(){
		logger.info("Slapper Plugin has been Enabled!"); //In Console
	}
	
	public void onDisable(){
		logger.info("Slapper Plugin has been Disabled!"); //In Console
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){ //commands
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("slapper create"))
				player.sendMessage(ChatColor.BLUE + "Hey!!");
		else if (cmd.getName().equalsIgnoreCase("world")){
			player.sendMessage(ChatColor.BLUE + "You Typed /world");
		}
		else if (cmd.getName().equalsIgnoreCase("slapper join 1")){
			player.sendMessage(ChatColor.BLUE + "You have joined Arena 1");
			
		}
	return false;
	}
	
	ScoreboardManager manager = Bukkit.getScoreboardManager(); //Gets the ScoreboardManager
	Scoreboard board = manager.getNewScoreboard(); //Creates a new Scoreboard
	Objective Gems = board.registerNewObjective("Gems", "dummy"); //registers Gems objective
	Objective Kills = board.registerNewObjective("Kills", "dummy"); //registers Kills objective
	
	//Do when joins Game
	
	Score kills = Kills.getScore(Bukkit.getPlayer(ChatColor.GREEN + "Kills:"));
	//score.setScore(1);
	Score gems = Gems.getScore(Bukkit.getPlayer(ChatColor.GREEN + "Kills:"));
	//score.setScore(1);
	
	
	//Run when they leave the game
	//board.resetScores(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Kills:"))
	
	
}





