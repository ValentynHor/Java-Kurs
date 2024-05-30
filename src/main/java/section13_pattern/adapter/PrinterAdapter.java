package section13_pattern.adapter;

import java.util.List;

public class PrinterAdapter implements PageListPrinter {

    private final Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String text : list){
            printer.print(text);
        }
    }
}
