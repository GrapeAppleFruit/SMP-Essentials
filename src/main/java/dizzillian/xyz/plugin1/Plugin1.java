package dizzillian.xyz.plugin1;

import dizzillian.xyz.plugin1.commands.*;
import dizzillian.xyz.plugin1.listeners.playerJoin;
import dizzillian.xyz.plugin1.listeners.playercantsleep;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("I'm starting ugh, insert errors here.");

        getServer().getPluginManager().registerEvents(new playercantsleep(), this);
        getServer().getPluginManager().registerEvents(new playerJoin(), this);
        getCommand("sleep").setExecutor(new sleepCommand());
        getCommand("healme").setExecutor(new heallCommand());
        getCommand("feedme").setExecutor(new feedCommand());
        getCommand("smban").setExecutor(new banCommand());
        getCommand("freeze").setExecutor(new freezeCommand());
        getCommand("unfreeze").setExecutor(new unfreezeCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Fine I'm turning off, rude.");
        System.out.println("Cya next server startup!");
    }


}
