package me.ksbdude.Signs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public String lprefix;
	
	
	@Override
	public void onEnable() { //enable
		PluginDescriptionFile pdffile = getDescription();
		PluginManager pm = getServer().getPluginManager();
		lprefix = "[" + pdffile.getName() + "] v" + pdffile.getVersion() + ": ";
		pm.registerEvents(new PlayerListener(), this);
		pm.registerEvents(new SignListener(), this);
		log("CustomSigns is now Enabled");
	}
	
	
	@Override
	public void onDisable() { //disable
		log("CustomSigns is now Disabled");
	}
	
	public void log(String log) {
		Bukkit.getLogger().info(lprefix + log);
	}
	
	
}
