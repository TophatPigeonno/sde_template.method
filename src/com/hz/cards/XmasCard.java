package com.hz.cards;

import com.hz.Printer;

public class XmasCard implements PostCard {
    Printer printer = null;

    public XmasCard(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    @Override
    public void printHeader() {
        String header = "%%%%%%******%%%%%%******%%%%%%******%%%%%%";
        this.printer.printLine(header);
    }

    @Override
    public void printMessage() {
        String msg = "Merry Christmas!";

        this.printer.printLine(msg);
    }

    @Override
    public void printImage() {
        this.printer.printLine("");
        this.printer.printLine(" Art by Melvin Scheele ;)");
        this.printer.printLine("");
        this.printer.printLine("             *");
        this.printer.printLine("             |");
        this.printer.printLine("            / \\");
        this.printer.printLine("           /   \\");
        this.printer.printLine("          /     \\");
        this.printer.printLine("         /    *  \\");
        this.printer.printLine("        /         \\");
        this.printer.printLine("       /   *       \\");
        this.printer.printLine("xmas  /             \\");
        this.printer.printLine("     /          *    \\");
        this.printer.printLine("    /                 \\");
        this.printer.printLine("   /      *            \\");
        this.printer.printLine("  /                     \\");
        this.printer.printLine(" /               *       \\");
        this.printer.printLine("|_________________________|");
        this.printer.printLine("             ||");
        this.printer.printLine("             ||");
    }

    @Override
    public void printFooter() {
        String footer = "%%%%%%%%%%%%%%%%%%%%%%%%%%%";

        this.printer.printLine(footer);
    }
}
