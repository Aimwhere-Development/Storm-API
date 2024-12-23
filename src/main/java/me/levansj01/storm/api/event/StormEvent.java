package me.levansj01.storm.api.event;

import me.levansj01.storm.api.exception.EventNotCancellableException;

public abstract class StormEvent {

    private boolean cancelled = false;

    /**
     * Attempts to cancel the current fired event
     * throws {@link EventNotCancellableException} if the event cannot be cancelled
     */
    public final void cancel() {
        if (!this.isCancellable())
            throw new EventNotCancellableException(this);
        else {
            this.cancelled = true;
        }
    }

    /**
     * Checks if the event is cancellable
     *
     * @return cancellable
     */
    public boolean isCancellable() {
        return true;
    }

    /**
     * Returns if the current event is cancelled
     *
     * @return cancelled
     */
    public final boolean isCancelled() {
        return isCancellable() && this.cancelled;
    }

}
