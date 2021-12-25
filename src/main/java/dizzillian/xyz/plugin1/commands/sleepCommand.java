package dizzillian.xyz.plugin1.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sleepCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("sleep")){

            if (sender instanceof Player){

                Player p = (Player) sender;
                p.getWorld().setTime(0);
                Bukkit.getServer().broadcastMessage("A player has done /sleep.");
            }



        }


        return false;
    }
}
