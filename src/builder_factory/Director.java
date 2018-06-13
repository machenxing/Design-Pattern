package builder_factory;

import java.util.List;

public abstract class Director {
    private Builder builder;
    public Builder getBuilder(){
        return builder;
    }
    public void setBuilder(Builder builder){
        this.builder=builder;
    }
    public Director(Builder builder){
        super();
        this.builder=builder;
    }
    public abstract List construct();
}
