package me.levansj01.storm.api.event.registry;

import me.levansj01.storm.api.event.StormEvent;
import me.levansj01.storm.api.event.StormListener;

public interface EventListenerRegistry {

    boolean fireEvent(StormEvent event);

    void shutdown();

    void addListener(StormListener listener);

    void removeListener(StormListener listener);

}
