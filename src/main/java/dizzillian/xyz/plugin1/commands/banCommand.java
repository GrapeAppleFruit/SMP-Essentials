package dizzillian.xyz.plugin1.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class banCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("smban")){

            if(Bukkit.getPlayer(args[1]) != null) {
                Bukkit.banIP(Bukkit.getPlayer(args[1]).getAddress().toString());
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aBanned Player Succesfully"));
            }else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPlayer Does Not Exist"));
            }



        }

        return false;
    }
}
