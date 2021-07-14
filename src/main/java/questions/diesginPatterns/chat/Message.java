package questions.diesginPatterns.chat;

public class Message {
    private String content;
    private User source;

    public Message(String content, User source) {
        this.content = content;
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getSource() {
        return source;
    }

    public void setSource(User source) {
        this.source = source;
    }
}
