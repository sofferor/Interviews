package questions.diesginPatterns.chat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Chat {
    String name;
    List<Message> messages;
    List<User> users;

    public Chat(String name) {
        messages = new ArrayList<>();
        users = new ArrayList<>();
        this.name = name;
    }

    public boolean add(Message message) {
        return messages.add(message);
    }

    public boolean add(User user) {
        return users.add(user);
    }

    public boolean addAll(Collection<? extends User> c) {
        return users.addAll(c);
    }

    public boolean addAllMessages(Collection<? extends Message> c) {
        return messages.addAll(c);
    }

    public List<User> getUsers() {
        return users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Message> getMessages() {
        return messages;
    }

    @Override
    protected Chat clone() throws CloneNotSupportedException {
        Chat chat = new Chat(name);
        chat.addAll(users);
        chat.addAllMessages(messages);
        return chat;
    }
}
