package me.levansj01.storm.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.levansj01.storm.api.event.StormEvent;

@Getter
@RequiredArgsConstructor
public final class InitializeEvent extends StormEvent {

    private final long loadTime;

    /**
     * Checks if the event is cancellable
     *
     * @return cancellable
     */
    @Override
    public boolean isCancellable() {
        return false;
    }

}
