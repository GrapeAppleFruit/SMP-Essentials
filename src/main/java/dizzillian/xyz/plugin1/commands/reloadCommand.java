package dizzillian.xyz.plugin1.commands;

import dizzillian.xyz.plugin1.Files.customConfig;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class reloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        customConfig.reload();
        player.sendMessage("Reload complete.");


        return false;
    }
}
