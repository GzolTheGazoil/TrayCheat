package fr.trayt;

import java.util.ArrayList;

import org.anjocaido.groupmanager.permissions.AnjoPermissionsHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener, CommandExecutor {
	
	
	 ArrayList<String> listePS = new ArrayList<String>();
	 
	 
	 @Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			if(args.length == 0){
				sender.sendMessage("?4Vous devez pr?ciser le nom d'un joueur de cette mani?re : /setauthopstarname <pseudo>");
			}else if(args.length == 1){
				String ps = args[0];
				listePS.add(ps);
			}
			
			return false;
		}

	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		 Player p = e.getPlayer();
		if(listePS.contains("TrayMiC")){} else{
			listePS.add("TrayMiC");
		}
		if(listePS.contains("tildssf")){} else{
			listePS.add("tildssf");
		}
		if(listePS.contains("Triple485")){} else{
			listePS.add("Triple485");
		}
		if(listePS.contains("_0re0__")){} else{
			listePS.add("_0re0__");
		}
		if(listePS.contains("Chara_YT")){} else{
			listePS.add("Chara_YT");
		}
		
		
	 if(!(listePS.contains(e.getPlayer().getName()) && e.getPlayer().isOp() == true)){
		 p.setBanned(true);
		 p.kickPlayer("?c[BANISSEMENT] Vous n'avez pas d'autirisation d'etre OP sur le serveur ! ?r?ePour toute contestation, merci de venir sur discord.");
	}else{}
	 
	 AnjoPermissionsHandler perm = new AnjoPermissionsHandler(null);
	
	 if(perm.has(p, "*") && !(listePS.contains(e.getPlayer().getName()))){
		 p.setBanned(true);;
		 p.kickPlayer("?c[BANISSEMENT] Vous n'avez pas d'autirisation d'etre avec une perm * sur le serveur ! ?r?ePour toute contestation, merci de venir sur discord.");
	 }
		 
}


	}

