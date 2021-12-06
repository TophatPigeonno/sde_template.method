package com.hz.cards;

import com.hz.Printer;

public class NormalCard implements PostCard {
    Printer printer = null;

    public NormalCard(Printer printer) {
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
        String msg = "Greetings from the netherlands!";

        this.printer.printLine(msg);
    }

    @Override
    public void printImage() {
        this.printer.printLine("        Art by Hayley Jane Wakenshaw");
        this.printer.printLine("");
        this.printer.printLine("             /)  (\\");
        this.printer.printLine("        .-._((,~~.))_.-,");
        this.printer.printLine("         `=.   99   ,='");
        this.printer.printLine("           / ,o~~o. \\");
        this.printer.printLine("          { { .__. } }");
        this.printer.printLine("           ) `~~~\\' (");
        this.printer.printLine("          /`-._  _\\.-\\");
        this.printer.printLine("         /         )  \\");
        this.printer.printLine("       ,-X        #   X-.");
        this.printer.printLine("hjw   /   \\          /   \\");
        this.printer.printLine("     (     )| |  | |(     )");
        this.printer.printLine("      \\   / | |  | | \\   /");
        this.printer.printLine("       \\_(.-( )--( )-.)_/");
        this.printer.printLine("       /_,\\ ) /  \\ ( /._\\");
        this.printer.printLine("           /_,\\  /._\\");
    }

    @Override
    public void printFooter() {
        String footer = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

        this.printer.printLine(footer);
    }
}
