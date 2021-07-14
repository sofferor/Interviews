package questions.diesginPatterns.chat;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private Map<String, Chat> chats;
    private Server server;

    public User(String name) {
        this.name = name;
        chats = new HashMap<>();
        server = Server.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMessageToChat(String chatName, Message message) {
        if (chats.containsKey(chatName)) {
            Chat chat = chats.get(chatName);
            chat.add(message);
            server.addMessageToChat(chatName, message);
        }
    }

    public void recieve(String chatName, Message message) {
        if (chats.containsKey(chatName)) {
            Chat chat = chats.get(chatName);
            chat.add(message);
        }
    }

    public Chat put(String key, Chat value) {
        return chats.put(key, value);
    }

    public Chat get(Object key) {
        return chats.get(key);
    }
}
