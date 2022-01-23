package strategy;

public class PrintPdfStrategy implements PrintStrategy {
    @Override
    public boolean isTypePrint(TypePrintEnum typePrintEnum) {
        return TypePrintEnum.PDF.equals(typePrintEnum);
    }

    @Override
    public void print() {
        System.out.println("Print PDF");
    }
}
