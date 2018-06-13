package observer;

public class Client_observer {
    public static void main(String[] args) {
        NewsPublisher newsPublisher=new NewsPublisher();
        GoodsPublisher goodsPublisher=new GoodsPublisher();
        IObserver observerA=new Customer();
        IObserver observerB=new TV();

        newsPublisher.addObserver(observerA);
        newsPublisher.addObserver(observerB);

        goodsPublisher.addObserver(observerA);
        goodsPublisher.addObserver(observerB);

        newsPublisher.setNews("新闻：新店开张！");
        goodsPublisher.setNews("商品：新货上架！");
        /*newspublisher.addObserver(new Customer());
        newspublisher.addObserver(new TV());
        newspublisher.setNews("空调大降价");*/
    }
}
