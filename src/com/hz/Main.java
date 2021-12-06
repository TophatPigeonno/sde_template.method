package com.hz;

import com.hz.cards.GraduationCard;
import com.hz.cards.NormalCard;
import com.hz.cards.PostCard;
import com.hz.cards.XmasCard;

public class Main {

    public static void main(String[] args) {

        // Creation of instances
        Printer printer = new Console();

        PostCard normal = new NormalCard(printer);
        PostCard graduation = new GraduationCard(printer);
        PostCard xmas = new XmasCard(printer);

        // Printing
        printer.printLine("Normal card");
        normal.print();

        printer.printLine("");
        printer.printLine("Graduation card");
        graduation.print();

        printer.printLine("");
        printer.printLine("Xmas card");
        xmas.print();
    }
}
