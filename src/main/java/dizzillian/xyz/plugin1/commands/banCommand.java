package dizzillian.xyz.plugin1.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class banCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("smban")){

            if(sender instanceof Player){
                Player p = (Player) sender;
                if(args.length == 0) {
                    p.sendMessage("You can't use this on yourself, really?.");
                }else{
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if(target instanceof Player) {
                        target.sendMessage("You've been banned on the server.");
                        p.sendMessage(target.getDisplayName() + "has been banned.");
                    }else{
                        p.sendMessage("Please insert an existing player.");
                    }

                }


            }



        }

        return false;
    }
}
