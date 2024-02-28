package behavioral.observer;

public class Subscriber_2 implements ArticleSubscriber{
    @Override
    public void notification_reflection_work() {
        System.out.println(this.getClass()+" get notified successfully!");
    }
}
