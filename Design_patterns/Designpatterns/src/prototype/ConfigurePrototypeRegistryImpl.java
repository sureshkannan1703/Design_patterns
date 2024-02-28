package prototype;

import java.util.HashMap;

public class ConfigurePrototypeRegistryImpl implements  ConfigurePrototypeRegistry{

    HashMap<String,Configure> repository = new HashMap<>();

    @Override
    public void addPrototype(Configure user) {
        repository.put(user.getType(),user);
    }

    @Override
    public Configure getPrototype(String type) {
        return repository.get(type);
    }

    @Override
    public Configure clone(String type) {
        Configure config = repository.get(type);
        if(config==null)
            return null;
        return config.clone();
    }
}
