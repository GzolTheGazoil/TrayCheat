package fr.trayt;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {

		getServer().getPluginManager().registerEvents(new Events(), this);
		getCommand("setauthopstarname").setExecutor(new Events());
		super.onEnable();
	}

}
