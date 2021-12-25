package dizzillian.xyz.plugin1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import dizzillian.xyz.plugin1.Files.customConfig;

public class testCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(customConfig.get().getString("Message"));
        }

        return false;
    }
}
