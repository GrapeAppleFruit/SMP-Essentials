package dizzillian.xyz.plugin1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class banCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("smban")){

            if (sender instanceof Player){

                Player p = (Player) sender;
                p.getPlayer().setWalkSpeed(0);
                p.sendMessage("You've been frozen because you're not apart of the smp!");
            }

        }

        return false;
    }
}
