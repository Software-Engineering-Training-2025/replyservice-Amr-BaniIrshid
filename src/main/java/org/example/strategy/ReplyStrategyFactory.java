package org.example.strategy;

import org.example.enums.ReplyType;

import java.util.Map;

public class ReplyStrategyFactory {
    private  static  final Map<ReplyType, ReplyStrategy> STRATEGY_MAP = Map.of(
            ReplyType.FORMAL , new FormalReplyStrategy() ,
            ReplyType.FRIENDLY , new FriendlyReplyStrategy() ,
            ReplyType.CONCISE , new ConciseReplyStrategy()
    );

    public static ReplyStrategy getReplyStrategy(ReplyType replyType) {
        return STRATEGY_MAP.get(replyType);
    }

}
