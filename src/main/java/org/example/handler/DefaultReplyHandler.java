package org.example.handler;

import org.example.enums.ReplyType;
import org.example.storage.ReplyStorage;
import org.example.strategy.ReplyStrategyFactory;

public class DefaultReplyHandler implements  MessageHandler{

    @Override
    public String handle(String input, ReplyType type) {
        return ReplyStrategyFactory.getReplyStrategy(type).reply(ReplyStorage.DEFAULT_REPLY);
    }
}
