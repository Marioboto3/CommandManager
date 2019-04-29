package CommandManager;

import java.util.HashMap;

public class Factory {
    public static Command newInstance(String commandType) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        Cache cache = CacheImpl.getInstance();
        Command c = cache.get(commandType);
        if(c==null){
            c = (Command) Class.forName("upc.edu.dsa."+commandType).newInstance();
            cache.put(commandType,c);
        }
        return c;
    }
}
