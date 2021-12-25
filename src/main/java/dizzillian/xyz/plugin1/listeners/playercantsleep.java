package dizzillian.xyz.plugin1.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class playercantsleep implements Listener {

    @EventHandler
    public void onPlayerSleep (PlayerBedEnterEvent e){
        e.getPlayer().sendMessage("Do /sleep please.");
        e.getBed().breakNaturally();
    }
}
