package behavioral.observer;

public interface Publisher {

    void addSubscriber(ArticleSubscriber subscriber);
    void removeSubscriber(ArticleSubscriber subscriber);

    void notifyAllSubscribers();
}
