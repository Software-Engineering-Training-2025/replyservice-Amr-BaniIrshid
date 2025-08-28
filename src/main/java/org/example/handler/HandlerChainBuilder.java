package org.example.handler;

public class HandlerChainBuilder {

    public static MessageHandler buildDefaultChain() {
        return new NullOrBlankHandler(
                new NormalizeHandler(
                        new LookupHandler(
                                new DefaultReplyHandler()
                        )
                )
        );
    }

}
