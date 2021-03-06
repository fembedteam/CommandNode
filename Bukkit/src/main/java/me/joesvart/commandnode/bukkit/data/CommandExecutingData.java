package me.joesvart.commandnode.bukkit.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CommandExecutingData {

    private final String[] args;
    private final CommandData<?> commandData;

    private final String permission;

}
