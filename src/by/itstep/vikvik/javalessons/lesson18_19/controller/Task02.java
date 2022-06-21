package by.itstep.vikvik.javalessons.lesson18_19.controller;

import by.itstep.vikvik.javalessons.lesson18_19.model.logic.ArraySearcher;
import by.itstep.vikvik.javalessons.lesson18_19.util.ArrayInitializer;
import by.itstep.vikvik.javalessons.lesson18_19.util.Convertor;
import by.itstep.vikvik.javalessons.lesson18_19.view.Printer;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            Printer.print("Input size of array: ");
            size = scanner.nextInt();
        } while(size <= 0);

        int[] array = new int[size];

        ArrayInitializer.randomInit(array);

        Printer.print("Array: " + Convertor.toString(array));

        // logic
        int value = 7;
        boolean result = ArraySearcher.check(array, value);

        String msg = result ? "Element exists." : "Element was not found.";

        //output result
        Printer.print("\n" + msg);
    }
}
