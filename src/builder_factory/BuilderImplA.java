package builder_factory;

public class BuilderImplA extends Builder{
    public void createFoodA(){
        getProductList().add("ÂóÏãÓãºº±¤");
    }
    public void createFoodB(){
        getProductList().add("Ğ¡ÊíÌõ");
    }
    public void createDrink(){
        getProductList().add("ÄÌÎô");
    }
    public void createAddition(){
        getProductList().add("Ï²ÑòÑòÍæ¾ß");
    }
}
