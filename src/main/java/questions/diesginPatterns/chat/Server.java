package questions.diesginPatterns.chat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Server {
    private static Server server = new Server();

    private Map<String, User> users;
    private Map<String, Chat> chats;

    public Server() {
        users = new HashMap<>();
        chats = new HashMap<>();
    }

    public static Server getInstance() {
        return server;
    }

    public void addMessageToChat(String name, Message message) {
        if (chats.containsKey(name)) {
            Chat chat = chats.get(name);
            chat.add(message);
            for (User user : chat.getUsers()) {
                if (!user.getName().equals(message.getSource().getName())) {
                    user.recieve(name, message);
                }
            }
        }
    }

    public Chat put(String key, Chat value) {
        return chats.put(key, value);
    }

    public User put(String key, User value) {
        return users.put(key, value);
    }
}
