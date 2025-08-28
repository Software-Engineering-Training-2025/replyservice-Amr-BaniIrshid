package org.example.handler;

import org.example.enums.ReplyType;

public class NormalizeHandler  implements  MessageHandler{

    private  final MessageHandler next;
    public NormalizeHandler(MessageHandler next) {
        this.next = next;
    }


    @Override
    public String handle(String input, ReplyType type) {
         String NormalizedInput =  input.trim().toLowerCase().replaceAll("\\s+", " ");
         return next.handle(NormalizedInput, type);
    }
}
