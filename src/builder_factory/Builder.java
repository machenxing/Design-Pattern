package builder_factory;

import java.util.ArrayList;
import java.util.List;

abstract public class Builder {
    private List productList;
    public List getProductList(){
        return productList;
    }
    public void setProductList(List producetList){
        this.productList=productList;
    }
    public void init(){
        productList=new ArrayList();
    }

    public void createFoodA(){

    }
    public void createFoodB(){

    }
    public void createDrink(){

    }
    public void createAddition(){

    }
}
