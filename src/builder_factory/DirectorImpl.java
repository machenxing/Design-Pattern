package builder_factory;

import java.util.List;

public class DirectorImpl extends Director {
    public DirectorImpl(Builder builder){
        super(builder);
    }

    @Override
    public List construct() {
        getBuilder().init();
        getBuilder().createFoodA();
        getBuilder().createFoodB();
        getBuilder().createDrink();
        getBuilder().createAddition();
        return getBuilder().getProductList();
    }
}
