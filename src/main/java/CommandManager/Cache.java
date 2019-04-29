package CommandManager;

public interface Cache {
    Command get(String key);
    void put (String key, Command c);
}
