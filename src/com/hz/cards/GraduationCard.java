package com.hz.cards;

import com.hz.Printer;

public class GraduationCard implements PostCard {
    Printer printer = null;

    public GraduationCard(Printer printer) {
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
        String header = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(header);
    }

    @Override
    public void printMessage() {
        String msg = "This calls for celebrating! Congratulations!";

        this.printer.printLine(msg);
    }

    @Override
    public void printImage() {
        this.printer.printLine("     ,_");
        this.printer.printLine("| `\"\"---..._____");
        this.printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
        this.printer.printLine("       \\   ```` ``\"---...__  |");
        this.printer.printLine("       |`              |   ``!");
        this.printer.printLine("       |               |     A");
        this.printer.printLine("       |               /\\   /#\\");
        this.printer.printLine("       /`--..______..-'  |  ###");
        this.printer.printLine("      |   /  `\\    /`--. |  ###");
        this.printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
        this.printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
        this.printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
        this.printer.printLine("   \\_,                 /_/");
        this.printer.printLine("       `\\              /");
        this.printer.printLine("         '.  '.__.'  .'");
        this.printer.printLine(" jgs      `-,____,-'");
        this.printer.printLine("           /\"\"\"I\"\"\\");
        this.printer.printLine("           /`---'--'\\");
    }

    @Override
    public void printFooter() {
        String footer = "--@--#--&----------------------&--#--@--";

        this.printer.printLine(footer);
    }
}