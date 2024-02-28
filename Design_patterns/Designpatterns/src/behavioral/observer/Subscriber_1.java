package behavioral.observer;

public class Subscriber_1 implements ArticleSubscriber{
    @Override
    public void notification_reflection_work() {
        System.out.println(this.getClass()+" is notified successfully!");
    }
}
