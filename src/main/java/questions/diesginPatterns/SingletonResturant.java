package questions.diesginPatterns;

public class SingletonResturant {
    private static final SingletonResturant instance = new SingletonResturant();
    private String name;

    private SingletonResturant() {
    }

    public static SingletonResturant getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
