package prototype;

import java.util.List;

public class ComplexClass implements Prototype{
    private String str;
    private List list;
    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str=str;
    }
    public List getList(){
        return list;
    }
    public void setList(List list){
        this.list=list;
    }

    @Override
    public Prototype clone() {
        ComplexClass cc=new ComplexClass();
        cc.setList(this.getList());
        cc.setStr(this.getStr());
        return cc;
    }

    @Override
    public String toString() {
        return this.getStr()+" "+this.getList();
    }
}
