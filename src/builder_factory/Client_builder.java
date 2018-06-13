package builder_factory;

import java.util.List;

public class Client_builder {
    public static void main(String[] args) {
        Director director;
        director=new DirectorImpl(new BuilderImplA() );
        List aList=director.construct();
        Client_builder.viewList(aList);

        director=new DirectorImpl(new BuilderImplB() );
        List bList=director.construct();
        Client_builder.viewList(bList);
    }
    public static void viewList(List list){
        for(Object object:list){
            System.out.print(object+" ");
        }
        System.out.println();
    }
}
