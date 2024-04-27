package org.example.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        System.out.println("Initial pages printed: " + printer.getPagesPrinted());

        printer.printPages(10);
        System.out.println("Pages printed after first print: " + printer.getPagesPrinted());

        printer.addToner(30);
        printer.printPages(20);
        System.out.println("Total pages printed: " + printer.getPagesPrinted());
    }
}

