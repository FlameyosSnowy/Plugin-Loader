package io.github.cobeine.velocity;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.proxy.ProxyServer;
import io.github.cobeine.api.loader.PluginLaunchException;
import io.github.cobeine.api.loader.PluginLoader;

import java.util.logging.Logger;

/**
 * @Author <a href="https://github.com/Cobeine">Cobeine</a>
 */

public abstract class VelocityPluginLoader implements PluginLoader {
    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public VelocityPluginLoader(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        try {
            init();
        } catch (PluginLaunchException e) {
            e.printStackTrace();
        }
    }

}
