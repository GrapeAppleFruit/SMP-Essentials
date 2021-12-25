package dizzillian.xyz.plugin1.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class freezeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("freeze")){

            if(sender instanceof Player){
                Player p = (Player) sender;
                if(args.length == 0) {
                    p.sendMessage("You can't use this on yourself, really?.");
                }else{
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if(target instanceof Player) {
                        target.setWalkSpeed(0);
                        target.sendMessage("You've been frozen.");
                        p.sendMessage(target.getDisplayName() + "has been frozen.");
                    }else{
                        p.sendMessage("Please insert an existing player.");
                    }

                }


            }



        }

        return false;
    }
}
