package abstract_factory;

public abstract class Button {
    private String type="��ť";
    private String lookAndFeel;
    public String getLookAndFeel(){
        return lookAndFeel;
    }
    public void setLookAndFeel(String lookAndFeel){
        this.lookAndFeel=lookAndFeel;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public void show(){
        System.out.println("��ʾ:"+lookAndFeel+"����"+type);
    }
}
