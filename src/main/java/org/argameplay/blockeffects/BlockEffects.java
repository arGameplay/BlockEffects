package org.argameplay.blockeffects;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockEffects extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        Bukkit.getLogger().log(java.util.logging.Level.INFO, "BlockEffects by arGameplay");
        // Instantiates the Applier and EffectCompositor classes
        new EffectCompositor();
        new Applier();
    }

    @Override
    public void onDisable() {}


}
