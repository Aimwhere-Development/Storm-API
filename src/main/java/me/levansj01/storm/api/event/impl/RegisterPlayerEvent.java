package me.levansj01.storm.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.levansj01.storm.api.event.StormEvent;
import org.bukkit.entity.Player;

@Getter
@RequiredArgsConstructor
public final class RegisterPlayerEvent extends StormEvent {

    private final Player player;

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
