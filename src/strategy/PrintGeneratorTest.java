package strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintGeneratorTest {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type 1 - CSV:\nType 2 - PDF:\nType 3 - Matricial:");
            Integer option = scan.nextInt();
            TypePrintEnum typePrintEnum = getOption(option);

            List<PrintStrategy> printStrategies = initializeStrategies();
            printStrategies
                    .stream()
                    .filter(impressaoStrategy ->
                            impressaoStrategy.isTypePrint(typePrintEnum))
                    .peek(impressaoStrategy -> impressaoStrategy.print())
                    .collect(Collectors.toList());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<PrintStrategy> initializeStrategies() {
        List<PrintStrategy> impressaoStrategies = new ArrayList<>();
        impressaoStrategies.add(new PrintPdfStrategy());
        impressaoStrategies.add(new PrintCsvStrategy());
        impressaoStrategies.add(new PrintMatricialStrategy());
        return impressaoStrategies;
    }

    private static TypePrintEnum getOption(Integer option) throws Exception {
        if (1 == option) {
            return TypePrintEnum.getTypePrint("csv");
        } else if (2 == option) {
            return TypePrintEnum.getTypePrint("pdf");
        } else if (3 == option) {
            return TypePrintEnum.getTypePrint("matricial");
        }
        throw new Exception("Invalid option");
    }
}
