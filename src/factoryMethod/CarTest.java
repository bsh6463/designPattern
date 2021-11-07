package factoryMethod;

public class CarTest {

    public static void main(String[] args) {
        CarFactory factory = new HMCCarFactory();
        Car newCar = factory.createCar("Santafe");

        System.out.println(newCar);

        Car myCar1 = factory.returnCar("Tomas");
        Car myCar2 = factory.returnCar("Tomas");
        System.out.println(myCar1 == myCar2);
    }
}
