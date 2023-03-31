package org.argameplay.blockeffects;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.Random;

public class EffectCompositor implements Listener {

    private static HashMap<Material, PotionEffectType> Collocation = new HashMap();
    Random rnd = new Random();

    private Material[] materials = Material.values();

    /*
     * Randomly maps a potion effect to any material in the enum
     */

    public EffectCompositor() {
        for (int i = 0; i < materials.length; i++) {
            PotionEffectType potionEffectType = PotionEffectType.values()[rnd.nextInt(PotionEffectType.values().length)];
            if (!potionEffectType.equals(PotionEffectType.HARM)) {
                Collocation.put(materials[i], potionEffectType);
            }
        }
    }

    /*
     * Returns the potion effect mapped to the material
     */

    public static PotionEffectType getEffect(Material material) throws Exception {
        return Collocation.get(material);
    }
}