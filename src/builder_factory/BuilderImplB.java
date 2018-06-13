package builder_factory;

public class BuilderImplB extends Builder {
    public void createFoodA(){
        getProductList().add("巨无霸汉堡");
    }
    public void createFoodB(){
        getProductList().add("大薯条");
    }
    public void createDrink(){
        getProductList().add("大杯可乐");
    }
    /*
        没有附加物，所以没有定义createAddition方法
    */
}
