package dizzillian.xyz.plugin1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import dizzillian.xyz.plugin1.Files.customConfig;

public class testCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("test"))
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(customConfig.get().getString("Message"));
        }

        return false;
    }

    public boolean someCommand(CommandSender sender, Command command, String label, String[] args){
        if (command.getName().equalsIgnoreCase("death"))
        if (sender instanceof Player){
            Player p = (Player) sender;
            p.sendMessage(customConfig.get().getString("True/False", "true"));
            p.setHealth(0);
        }
        return false;
    }
}
