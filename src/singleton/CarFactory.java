package singleton;

import java.util.Objects;

public class CarFactory {
    private static CarFactory instance;
    private Integer amountVolks;
    private Integer amountFord;
    private Integer amountFiat;

    private CarFactory() {
        amountVolks = 0;
        amountFord = 0;
        amountFiat = 0;
    }

    public static CarFactory getInstance() {
        if (Objects.isNull(instance)) {
            instance = new CarFactory();
        }
        return instance;
    }

    public void createVolks() {
        amountVolks++;
        System.out.println("Created Volks car");
    }

    public void createFord() {
        amountFord++;
        System.out.println("Created Ford car");
    }

    public void createFiat() {
        amountFiat++;
        System.out.println("Created Fiat car");
    }

    public void generateReport() {
        System.out.println("Total number of Volks cars sold: " + amountVolks + "\n" +
                "Total number of Ford cars sold: " + amountFord + "\n" +
                "Total number of Fiat cars sold: " + amountFiat);
    }

}
