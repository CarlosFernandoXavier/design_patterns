package strategy;

import java.util.EnumSet;

public enum TypePrintEnum {
    CSV,
    PDF,
    MATRICIAL;

    private static String ERROR_TYPE_PRINT = "The print %s was not recognized";
    private String typePrint;


    public static TypePrintEnum getTypePrint(String tipoImpressao) throws Exception {
        return EnumSet.allOf(TypePrintEnum.class)
                .stream()
                .filter(typePrintEnum ->
                        typePrintEnum.name().equalsIgnoreCase(tipoImpressao))
                .findFirst()
                .orElseThrow(() -> new Exception(String.format(ERROR_TYPE_PRINT, tipoImpressao)));
    }
}
