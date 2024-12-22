package me.levansj01.storm.api.event.example;

import me.levansj01.storm.api.data.CheckData;
import me.levansj01.storm.api.event.StormEvent;
import me.levansj01.storm.api.event.StormListener;
import me.levansj01.storm.api.event.impl.AlertEvent;
import org.bukkit.entity.Player;

public final class ExampleListener implements StormListener {

    public ExampleListener() {
        //StormAPI.getEventRegistry().addListener(this);
    }

    @Override
    public void onEvent(StormEvent event) {

        if(event instanceof AlertEvent){
           final CheckData check = ((AlertEvent) event).getCheck();
           final Player player = ((AlertEvent) event).getPlayer();
        }

    }

}
