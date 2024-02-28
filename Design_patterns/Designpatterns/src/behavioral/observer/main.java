package behavioral.observer;

public class main {

    public static void main(String[] args) {

        Subscriber_1 maleSubscriber = new Subscriber_1();
        Subscriber_2 femaleSubscriber = new Subscriber_2();
        ArticlePublisher articlePublisher = new ArticlePublisher();
        articlePublisher.addSubscriber(maleSubscriber);
        articlePublisher.addSubscriber(femaleSubscriber);
        articlePublisher.updateArticle("Article Content Changed on introduction part!");
    }
}
