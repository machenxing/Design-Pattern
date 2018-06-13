package prototype;

import java.util.ArrayList;
import java.util.List;

public class Client_prototype {
    public static void main(String[] args) {
        SampleClass sc=new SampleClass(99);
        Prototype scc= sc.clone();
        System.out.println("ss=scc ?"+(sc==scc));
        System.out.println("sc:"+sc.toString());
        System.out.println("scc:"+scc.toString());

        ComplexClass cc=new ComplexClass();
        cc.setStr("Ò»¸ö×Ö·û´®");
        List list=new ArrayList();
        list.add("×Ö´®");
        list.add(25);
        cc.setList(list);

        Prototype ccc=cc.clone();
        System.out.println("cc===ccc ? "+(cc==ccc));
        System.out.println("cc: "+cc.toString());
        System.out.println("ccc: "+cc.toString());
    }
}
