package observer;

public class GoodsPublisher extends Subject{
    private String news;
    public void setNews(String news){
        /*
        ��Ϣ�ı�ʱ֪ͨ
        */
        if(news!=null&&!news.equals(this.news)){
            this.news=news;
            this.notify(news);
        }
    }
}
