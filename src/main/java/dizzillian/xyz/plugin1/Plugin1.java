package dizzillian.xyz.plugin1;

import dizzillian.xyz.plugin1.Files.customConfig;
import dizzillian.xyz.plugin1.commands.*;
import dizzillian.xyz.plugin1.listeners.playerJoin;
import dizzillian.xyz.plugin1.listeners.playercantsleep;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Optional;

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
        getCommand("test").setExecutor(new testCommand());
        getCommand("smreload").setExecutor(new reloadCommand());
        getCommand("smkick").setExecutor(new kickCommand());
        getCommand("smban").setExecutor(new banCommand());

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        customConfig.setup();
        customConfig.get().addDefault("Message", "This is default message.");
        customConfig.get().options().copyDefaults(true);
        customConfig.save();



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Fine I'm turning off, rude.");
        System.out.println("Cya next server startup!");
    }


}
