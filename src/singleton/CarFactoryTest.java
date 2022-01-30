package singleton;

public class CarFactoryTest {

    public static void main(String[] args) {
        createCar();
        CarFactory carFactory = CarFactory.getInstance();
        carFactory.generateReport();
    }

    public static void createCar() {
        CarFactory carFactory = CarFactory.getInstance();
        carFactory.createFiat();
        carFactory.createFord();
        carFactory.createVolks();
        carFactory.createVolks();
    }
}
