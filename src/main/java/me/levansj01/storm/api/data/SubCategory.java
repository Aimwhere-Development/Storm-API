package me.levansj01.storm.api.data;

import lombok.Getter;
import org.bukkit.Material;

public enum SubCategory { //outdated
    //Combat
    REACH(Category.COMBAT, 20), KILLAURA(Category.COMBAT, 21), AIM(Category.COMBAT, 22),
    ANALYSIS(Category.COMBAT, 4), IMPROBABLEAIM(Category.COMBAT, 5), ROTATIONS2(Category.COMBAT, 6),
    AUTOCLICKER(Category.COMBAT, 23), VELOCITY(Category.COMBAT, 24), WTAP(Category.COMBAT, 2),
    CRITICALS(Category.COMBAT, 1),

    //Movement
    FLY(Category.MOVEMENT, 11), SPEED(Category.MOVEMENT, 12), MOTION(Category.MOVEMENT,13),
    INVENTORY(Category.MOVEMENT, 14), JESUS(Category.MOVEMENT, 15),

    //WORLD
    SCAFFOLD(Category.WORLD, 33),
    NOFALL(Category.WORLD, 32), BLOCK(Category.WORLD,29), BARITONE(Category.WORLD, 3),

    //PACKET
    BADPACKETS(Category.PACKET, 30), TIMER(Category.PACKET, 31),

    //CATEGORY
    CATEGORY(Category.CATEGORY, 0);

    @Getter private final Category category;
    @Getter private final int slot;

    SubCategory(final Category category, int slot) {
        this.category = category;
        this.slot = slot;
    }

}
