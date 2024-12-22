package me.levansj01.storm.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.levansj01.storm.api.data.CheckData;
import me.levansj01.storm.api.event.StormEvent;
import org.bukkit.entity.Player;

@RequiredArgsConstructor
@Getter
public final class PostCheckEvent extends StormEvent implements RawPacketInspectableEvent {

    private final boolean failed;
    private final CheckData check;
    private final Player player;
    private final Object packet;

    /**
     * Checks if the event is cancellable
     *
     * @return cancellable
     */
    @Override
    public boolean isCancellable() {
        return false;
    }

    @Override
    public Object getPacket() {
        return packet;
    }

}
