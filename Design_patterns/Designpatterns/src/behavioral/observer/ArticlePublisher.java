package behavioral.observer;

import java.util.HashSet;
import java.util.concurrent.Flow;

public class ArticlePublisher implements Publisher{

    private HashSet<ArticleSubscriber> subscribers = new HashSet<>();

    private String article_content = "";

    public void updateArticle(String newArticleContent){
        System.out.println("Existing content :"+this.article_content);
        this.article_content = newArticleContent;
        System.out.println("Updated content :"+this.article_content);
        notifyAllSubscribers();
    }
    @Override
    public void addSubscriber(ArticleSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(ArticleSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllSubscribers() {
        subscribers.forEach(ArticleSubscriber::notification_reflection_work);
    }
}
