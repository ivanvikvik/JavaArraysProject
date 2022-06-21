package by.itstep.vikvik.javalessons.lesson18_19.model.logic;

public class ArraySorter {
    public static void bubbleSortAcs(int[] array) {

        for (int j = 0; j < array.length - 1; j++) {
            boolean flag = true;

            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
            }

            if (flag == true) {
                break;
            }
        }
    }

    public static void selectedSortAcs(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int index = j;
            for (int i = index + 1; i < array.length; i++) {
                if (array[i] < array[index]) {
                    index = i;
                }
            }

            int temp = array[j];
            array[j] = array[index];
            array[index] = temp;
        }

    }
}
