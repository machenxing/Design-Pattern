package builder_factory;

public class BuilderImplA extends Builder{
    public void createFoodA(){
        getProductList().add("�����㺺��");
    }
    public void createFoodB(){
        getProductList().add("С����");
    }
    public void createDrink(){
        getProductList().add("����");
    }
    public void createAddition(){
        getProductList().add("ϲ�������");
    }
}
