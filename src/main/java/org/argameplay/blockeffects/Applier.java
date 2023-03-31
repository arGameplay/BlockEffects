package org.argameplay.blockeffects;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;

public class Applier {

    Applier() {
        new BukkitRunnable() {
            /*
             * Runs every second
             */
            @Override
            public void run() throws NullPointerException {
                /*
                 * Applies the effects to all players
                 */
                for (Player player : Bukkit.getOnlinePlayers()) {
                    for (int x = 0; x <= Arrays.stream(player.getInventory().getContents()).count(); x++) {
                        if (!(player.getInventory().getItem(x) == null)) {
                            try {
                                player.addPotionEffect(EffectCompositor.getEffect(player.getInventory().getItem(x).getType()).createEffect(30, 0));
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        }.runTaskTimer(BlockEffects.getPlugin(BlockEffects.class), 0, 20);
    }
}

