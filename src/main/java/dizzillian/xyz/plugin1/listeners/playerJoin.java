package dizzillian.xyz.plugin1.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.lang.annotation.Annotation;

public class playerJoin implements Listener {

    @EventHandler
    public void playerJoin(PlayerJoinEvent e) {
        e.setJoinMessage("Welcome" + e.getPlayer().getDisplayName() + "To the Server!");
    }

    public void playerLeave(PlayerQuitEvent e) {
        e.setQuitMessage("GoodBye" + " " + e.getPlayer().getDisplayName() + " " + "Have a good day. :(");
    }
}
