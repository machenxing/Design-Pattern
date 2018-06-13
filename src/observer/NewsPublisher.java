package observer;

public class NewsPublisher extends Subject{
    private String news;
    public void setNews(String news){
        /*
        消息改变时通知
        */
        if(news!=null&&!news.equals(this.news)){
            this.news=news;
            this.notify(news);
        }
    }
    /*private String news;
    public void setNews(String news){
        if(news!=null&&!news.equals(this.news)){
            this.news=news;
            this.notifyObservers(news);
        }
    }*/
}
