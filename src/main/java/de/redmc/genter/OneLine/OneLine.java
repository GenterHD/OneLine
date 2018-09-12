package de.redmc.genter.OneLine;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class OneLine extends JavaPlugin {

    public static OneLine getInstance() {
        return getPlugin(OneLine.class);
    }

    public String prefix = "§8";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("");
    }

    @Override
    public void onDisable() {

    }
}
