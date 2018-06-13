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

        newsPublisher.setNews("���ţ��µ꿪�ţ�");
        goodsPublisher.setNews("��Ʒ���»��ϼܣ�");
        /*newspublisher.addObserver(new Customer());
        newspublisher.addObserver(new TV());
        newspublisher.setNews("�յ��󽵼�");*/
    }
}
