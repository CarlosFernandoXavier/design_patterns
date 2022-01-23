package strategy;

public class PrintMatricialStrategy implements PrintStrategy {
    @Override
    public boolean isTypePrint(TypePrintEnum typePrintEnum) {
        return TypePrintEnum.MATRICIAL.equals(typePrintEnum);
    }

    @Override
    public void print() {
        System.out.println("Print MATRICIAL");
    }
}
