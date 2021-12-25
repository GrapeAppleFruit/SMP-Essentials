package dizzillian.xyz.plugin1.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class unfreezeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("unfreeze")) {

            if (sender instanceof Player) {
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    if (args.length == 0) {
                        p.sendMessage("You can't use this on yourself, really?.");
                    } else {
                        Player target = Bukkit.getPlayerExact(args[0]);
                        if (target instanceof Player) {
                            target.setWalkSpeed(02);
                            target.sendMessage("You've been unfrozen.");
                            p.sendMessage(target.getDisplayName() + " " + "has been unfrozen.");
                        } else {
                            p.sendMessage("Please insert an existing player.");
                        }
                    }
                }
            }
        }
        return false;
    }
}
