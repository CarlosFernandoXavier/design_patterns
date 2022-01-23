package strategy;

public class PrintCsvStrategy implements PrintStrategy {
    @Override
    public boolean isTypePrint(TypePrintEnum typePrintEnum) {
        return TypePrintEnum.CSV.equals(typePrintEnum);
    }

    @Override
    public void print() {
        System.out.println("Print CSV");
    }
}
