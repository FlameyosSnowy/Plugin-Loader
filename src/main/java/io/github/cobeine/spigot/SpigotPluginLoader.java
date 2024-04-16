package io.github.cobeine.spigot;

import io.github.cobeine.api.loader.PluginLoader;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @Author <a href="https://github.com/Cobeine">Cobeine</a>
 */

public abstract class SpigotPluginLoader extends JavaPlugin implements PluginLoader {

    @Override
    public void onEnable() {
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void registerListener(Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getPluginManager().registerEvents(listener, this);
        }
    }

    @Override
    public void onDisable() {
        fini();
    }

}
