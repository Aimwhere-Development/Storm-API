package me.levansj01.storm.api.event.registry;

import lombok.Setter;
import me.levansj01.storm.api.StormLogger;
import me.levansj01.storm.api.event.StormEvent;
import me.levansj01.storm.api.event.StormListener;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * TODO, long todo lol - instead of using the packet thread to call these events so
 *  frequently later this could be subject to change where we use our own event threads and utilize
 *  callbacks in event calling
 *  (we cant assure the event will be called right away/on demand when we pass the task to another thread)
 */
public final class EventRegistry implements EventListenerRegistry {

    private final List<StormListener> listeners = new CopyOnWriteArrayList<>();
    private int errors;

    @Setter
    private boolean forceShutdown;

    @Override
    public boolean fireEvent(StormEvent event) {
        if (!forceShutdown) {
            try {
                this.listeners.forEach(l -> l.onEvent(event));
                return !event.isCancelled();
            } catch (Throwable t) {
                t.printStackTrace();
                if (++errors >= 5) {
                    StormLogger.critical("The event service has been set to idle due to numerous unknown errors" + '\n' +
                            "If you still want to utilize the event system, please restart your server");
                    forceShutdown = true;
                }
                return true;
            }
        } else {
            return true;
        }
    }

    @Override
    public void addListener(StormListener listener) {
        if (!forceShutdown) {
            if(!this.listeners.contains(listener)) {
                this.listeners.add(listener);
            }
        } else {
            throw new RuntimeException("event registry is halted");
        }
    }

    @Override
    public void removeListener(StormListener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void shutdown() {
        listeners.clear();
    }

}
