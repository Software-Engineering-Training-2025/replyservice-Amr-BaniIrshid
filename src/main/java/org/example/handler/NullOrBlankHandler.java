package org.example.handler;

import org.example.enums.ReplyType;

public class NullOrBlankHandler implements MessageHandler{
    private  final MessageHandler next;

    public NullOrBlankHandler(MessageHandler next) {
        this.next = next;
    }

    @Override
    public String handle(String input, ReplyType type) {
        if(input == null || input.trim().isEmpty())
            return "Please say something." ;
        return  next.handle(input, type);
    }
}
