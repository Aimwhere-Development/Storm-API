package me.levansj01.storm.api.event.impl;

import lombok.Getter;
import me.levansj01.storm.api.data.CheckData;
import me.levansj01.storm.api.event.StormEvent;
import org.bukkit.Location;
import org.bukkit.entity.Player;

@Getter
public final class SetbackEvent extends StormEvent {

    private final Player player;
    private final CheckData check;
    private Location to;

    public SetbackEvent(Player player, CheckData check, Location to){
        this.player = player;
        this.check = check;
        this.to = to.clone();
    }

    public void setTo(Location to) {
        this.to = to;
    }

}
