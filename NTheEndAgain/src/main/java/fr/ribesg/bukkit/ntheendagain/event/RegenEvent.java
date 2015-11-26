package fr.ribesg.bukkit.ntheendagain.event;

import fr.ribesg.bukkit.ncore.lang.MessageId;
import fr.ribesg.bukkit.ntheendagain.NTheEndAgain;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 *
 * @author Chris Naude
 */
public class RegenEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final String type;
    private final String messages[];

    /**
     *
     * @param plugin
     * @param type
     * @param messageId
     * @param args
     */
    public RegenEvent(final NTheEndAgain plugin, final String type, final MessageId messageId, String... args) {
        this.messages = plugin.getMessages().get(messageId, args);
        this.type = type;
    }
    
    /**
     *
     * @param plugin
     * @param type
     * @param message
     */
    public RegenEvent(final NTheEndAgain plugin, final String type, final String message) {
        this.messages = new String[1];
        messages[0] = message;
        this.type = type;
    }
       
    /**
     *
     * @return
     */
    public String[] getMessages() {
        return this.messages;
    }

    /**
     *
     * @return
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     *
     * @return
     */
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
    
    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }
}