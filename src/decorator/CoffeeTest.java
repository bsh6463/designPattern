package decorator;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee kenyaCoffee = new KenyaCoffee();
        kenyaCoffee.brewing();
        System.out.println("=================");
        Latte kenyaLatte = new Latte(kenyaCoffee);
        kenyaLatte.brewing();
        System.out.println("=================");
        Mocha kenyaMochaLatte = new Mocha(kenyaLatte);
        kenyaMochaLatte.brewing();
        System.out.println("=================");
    }
}
