package dev.norska.rc.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import dev.norska.rc.data.Code;

public class CodeRedeemEvent extends Event implements Cancellable{

    private final Player player;
    private final Code code;
    private boolean isCancelled;

    public CodeRedeemEvent(Player player, Code code) {
        this.player = player;
        this.code = code;
        this.isCancelled = false;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return this.player;
    }
    
    public Code getCode() {
    	return this.code;
    }
}
