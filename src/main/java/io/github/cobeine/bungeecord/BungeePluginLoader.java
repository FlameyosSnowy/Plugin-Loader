package io.github.cobeine.bungeecord;

import io.github.cobeine.api.loader.PluginLoader;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * @Author <a href="https://github.com/Cobeine">Cobeine</a>
 */

public abstract class BungeePluginLoader extends Plugin implements PluginLoader {

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
            this.getProxy().getPluginManager().registerListener(this,listener);
        }
    }

    @Override
    public void onDisable() {
        fini();
    }

}
