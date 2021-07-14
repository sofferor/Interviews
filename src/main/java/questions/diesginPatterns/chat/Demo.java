package questions.diesginPatterns.chat;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        User avi = new User("Avi");
        User shlomi = new User("Shlomi");
        String chatName = "Avi + Shlomi";
        Chat chat = new Chat(chatName);
        chat.add(avi);
        chat.add(shlomi);
        avi.put(chatName, chat);
        shlomi.put(chatName, chat.clone());

        Server server = Server.getInstance();
        server.put(avi.getName(), avi);
        server.put(shlomi.getName(), shlomi);
        server.put(chat.getName(), chat.clone());

        Message message = new Message("Hi", avi);
        avi.addMessageToChat(chatName, message);
        for (Message m : shlomi.get(chatName).getMessages()) {
            System.out.println(m.getSource().getName() + ": " + m.getContent());
        }
    }
}
