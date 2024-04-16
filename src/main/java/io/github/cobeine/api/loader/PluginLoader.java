package io.github.cobeine.api.loader;

/**
 * @Author <a href="https://github.com/Cobeine">Cobeine</a>
 */

public interface PluginLoader {
    /**
     * Plugin Initialization logic.
     *
     */
    void init() throws PluginLaunchException;


    /**
     * Plugin Shutdown & Finalizing logic.
     */
    void fini();
}
