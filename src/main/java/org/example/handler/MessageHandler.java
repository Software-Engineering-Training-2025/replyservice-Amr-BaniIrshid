package org.example.handler;

import org.example.enums.ReplyType;

public interface MessageHandler {
     String handle(String input, ReplyType type);

}
