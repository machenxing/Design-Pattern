package builder_factory;

public class BuilderImplB extends Builder {
    public void createFoodA(){
        getProductList().add("���ްԺ���");
    }
    public void createFoodB(){
        getProductList().add("������");
    }
    public void createDrink(){
        getProductList().add("�󱭿���");
    }
    /*
        û�и��������û�ж���createAddition����
    */
}
