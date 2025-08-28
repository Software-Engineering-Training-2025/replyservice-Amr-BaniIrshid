package org.example.service;

import org.example.handler.*;
import org.example.enums.ReplyType;


public class ReplyService {
    private final MessageHandler chain ;

    public ReplyService() {
        this.chain = HandlerChainBuilder.buildDefaultChain();
    }

    public String reply(String message, ReplyType type) {
        return  chain.handle(message, type);
    }
}
