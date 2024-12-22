package me.levansj01.storm.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.levansj01.storm.api.data.CheckData;
import me.levansj01.storm.api.data.DebugData;
import me.levansj01.storm.api.event.StormEvent;
import org.bukkit.entity.Player;

@Getter
@RequiredArgsConstructor
public final class AlertEvent extends StormEvent {

    private final Player player;
    private final CheckData check;
    private final DebugData debug;
    private final int violations;

}
