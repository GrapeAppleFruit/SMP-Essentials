package dizzillian.xyz.plugin1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class feedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("feedme")){
            if (sender instanceof Player){

                Player p = (Player) sender;
                p.setFoodLevel(20);
                p.sendMessage("You've been fed.");
            }
        }

        return false;
    }
}
