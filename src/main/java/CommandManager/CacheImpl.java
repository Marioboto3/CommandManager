package CommandManager;

import java.util.HashMap;

import java.util.HashMap;

public class CacheImpl implements Cache {

    private HashMap<String,Command> commands;

    private static CacheImpl ourInstance = new CacheImpl();

    public static CacheImpl getInstance() {
        return ourInstance;
    }

    private CacheImpl() {
        commands = new HashMap<String, Command>();
    }
    public Command get(String key) {
        return this.commands.get(key);
    }

    public void put(String key, Command c) {
        this.commands.put(key,c);
    }
}