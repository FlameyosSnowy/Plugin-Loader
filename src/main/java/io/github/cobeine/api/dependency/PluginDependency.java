package io.github.cobeine.api.dependency;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @Author <a href="https://github.com/Cobeine">Cobeine</a>
 */

public interface PluginDependency<T> {

    @Nullable T get();

    void registerDependency() throws DependencyRegisterException;


   @NotNull String name();
}
