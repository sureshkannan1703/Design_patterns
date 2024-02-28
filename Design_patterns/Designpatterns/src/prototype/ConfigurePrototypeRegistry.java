package prototype;

public interface ConfigurePrototypeRegistry {

    void addPrototype(Configure user);

    Configure getPrototype(String type);

    Configure clone(String type);
}
