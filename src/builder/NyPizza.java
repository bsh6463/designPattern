package builder;

import java.util.Objects;

public class NyPizza extends Pizza{

    private final Size size;


    public static class Builder extends Pizza.Builder{

        private final Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        public NyPizza build(){
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

    //생성자 못쓰게 막음.
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
