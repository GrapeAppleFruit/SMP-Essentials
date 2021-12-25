package dizzillian.xyz.plugin1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;

public class kickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("smkick")){

            if (sender instanceof Player){

                Player p = (Player) sender;
                p.getPlayer().kickPlayer("You've been kicked out of the smp.");

            }
        }

        return false;
    }
}
