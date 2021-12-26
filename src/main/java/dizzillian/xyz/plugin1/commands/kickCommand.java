package dizzillian.xyz.plugin1.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class kickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("smkick")){
            if(sender instanceof Player){
                Player p = (Player) sender;
                if(args.length == 0|| args[0].equalsIgnoreCase(p.getName())) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPlayer Does Not Exist"));
                }else{
                    if(Bukkit.getPlayer(args[0]) != null) {
                        p.kickPlayer("");
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aBanned Player Succesfully"));
                    }
                }
            }
        }

        return false;
    }
}
