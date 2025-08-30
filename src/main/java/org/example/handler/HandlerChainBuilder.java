package org.example.handler;

public class HandlerChainBuilder {
    private static final MessageHandler DEFAULT_CHAIN =
            new NullOrBlankHandler(
                    new NormalizeHandler(
                            new LookupHandler(
                                    new DefaultReplyHandler()
                            )
                    )
            );

    public static MessageHandler getDefaultChain() {
        return DEFAULT_CHAIN;
    }
}

