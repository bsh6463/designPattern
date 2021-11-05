package builder;

public class Test {

    public static void main(String[] args) {

        Pizza nyPizza = new NyPizza.Builder(Size.LARGE).addTopping(Topping.HAM).addTopping(Topping.SAUSAGE).build();

        Pizza calzone = new CalzonePizza.Builder().addTopping(Topping.SAUSAGE).sauceInside().build();

        System.out.println(nyPizza);
        System.out.println(calzone);

    }
}
