package org.example.strategy;

import org.example.storage.ReplyEntry;

public class ConciseReplyStrategy  implements ReplyStrategy {
    @Override
    public String reply(ReplyEntry entry) {
        return entry.concise();
    }
}
