package org.example.strategy;

import org.example.storage.ReplyEntry;

public class FriendlyReplyStrategy implements ReplyStrategy {

    @Override
    public String reply(ReplyEntry entry) {
        return  entry.friendly() ;
    }
}
