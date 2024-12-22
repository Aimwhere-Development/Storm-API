package me.levansj01.storm.api.exception;

import me.levansj01.storm.api.event.StormEvent;

public final class EventNotCancellableException extends RuntimeException {

    public EventNotCancellableException(StormEvent event) {
        super(event.getClass().getSimpleName() + " cannot be force-cancelled (is it cancellable?)");
    }

}
