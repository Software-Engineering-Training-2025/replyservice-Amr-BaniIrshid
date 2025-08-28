package org.example.handler;

import org.example.enums.ReplyType;
import org.example.storage.ReplyEntry;
import org.example.storage.ReplyStorage;
import org.example.strategy.ReplyStrategyFactory;

public class LookupHandler implements MessageHandler {
    private  final MessageHandler next;
    public LookupHandler(MessageHandler next) {
        this.next = next;
    }

    @Override
    public String handle(String input, ReplyType type) {
        ReplyEntry entry = ReplyStorage.REPLIES.get(input);
        if (entry != null) {
            return ReplyStrategyFactory.getReplyStrategy(type).reply(entry);
        }
        return next.handle(input, type);
    }
}
