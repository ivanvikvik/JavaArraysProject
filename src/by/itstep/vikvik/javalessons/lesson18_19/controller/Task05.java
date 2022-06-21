package by.itstep.vikvik.javalessons.lesson18_19.controller;

import by.itstep.vikvik.javalessons.lesson18_19.model.logic.ArraySorter;
import by.itstep.vikvik.javalessons.lesson18_19.model.logic.ArrayWorker;
import by.itstep.vikvik.javalessons.lesson18_19.util.ArrayInitializer;
import by.itstep.vikvik.javalessons.lesson18_19.util.Convertor;
import by.itstep.vikvik.javalessons.lesson18_19.view.Printer;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int size;
//
//        do {
//            Printer.print("Input size of array: ");
//            size = scanner.nextInt();
//        } while (size <= 0);

//        int[] array = new int[size];


        int[] array = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 1, 9, 8, 7, 6, 5, 4, 3, 2};

        //ArrayInitializer.randomInit(array);

        Printer.print("Array before sort: " + Convertor.toString(array));

        ArraySorter.bubbleSortAcs(array);

        Printer.print("\nArray after sort: " + Convertor.toString(array));

        ArrayWorker.reverse(array);

        Printer.print("\nArray after reverse: " + Convertor.toString(array));

    }
}
