package org.example.storage;

import java.util.Map;

public  class ReplyStorage {

    public static final Map<String, ReplyEntry> REPLIES = Map.ofEntries(
            Map.entry("hi", new ReplyEntry(
                    "Hello. How may I assist you today?",
                    "Hey there! 😊 How can I help?",
                    "Hello. How can I help?"
            )),
            Map.entry("hello", new ReplyEntry(
                    "Hello. How may I assist you today?",
                    "Hi! 👋 What’s up?",
                    "Hello. How can I help?"
            )),
            Map.entry("how are you", new ReplyEntry(
                    "I am functioning properly. How may I assist you?",
                    "Doing great! 😄 How can I help?",
                    "I’m good. How can I help?"
            )),
            Map.entry("i need help", new ReplyEntry(
                    "I can assist with that. Please provide more details.",
                    "I’ve got you! 🙂 Tell me a bit more.",
                    "Share details; I’ll help."
            )),
            Map.entry("can you help me with my account", new ReplyEntry(
                    "Certainly. Please describe the account issue.",
                    "Sure thing! 😊 What’s wrong with the account?",
                    "Describe the account issue…"
            )),
            Map.entry("thanks", new ReplyEntry(
                    "You are welcome.",
                    "Anytime! 🙌",
                    "You’re welcome."
            )),
            Map.entry("bye", new ReplyEntry(
                    "Goodbye.",
                    "See you later! 👋",
                    "Goodbye."
            )),
            Map.entry("what is your name", new ReplyEntry(
                    "I am your virtual assistant.",
                    "I’m your helper bot 🤖",
                    "I’m your assistant."
            ))
    );

    public static final ReplyEntry DEFAULT_REPLY = new ReplyEntry(
            "Could you clarify your request?",
            "Could you tell me more?",
            "Please clarify."
    );


}
