import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Numbers {
    public static void main(String[] args) {
        int arraySize = initializeArraySize();
        int[] parsedArray = fillArray(arraySize);
        filterArray(parsedArray);
    }

    public static int initializeArraySize() {
        Scanner arraySizeScanner = new Scanner(System.in);
        System.out.println("Введите размер Вашего массива:");
        return arraySizeScanner.nextInt();
    }

    public static int[] fillArray(int arraySize) {
        int[] array = new int[arraySize];
        System.out.println("Заполните числовой массив, через запятую");
        Scanner in2 = new Scanner(System.in);
        String scannerArrayLine = in2.nextLine();
        String[] numbers = scannerArrayLine.split(",");
        if (numbers.length > arraySize || numbers.length < arraySize) {
            System.out.println("Введите правильную длину массива:");
            return fillArray(arraySize);
        } else {
            for (int i=0; i < numbers.length; i++) {
                int parsedNumber = parseInt(numbers[i]);
                array[i] = parsedNumber;
            }
            return array;
        }
    }

    public static void filterArray(int[] array) {
        for (int i : array) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("Элемент массива кратный трём - " + i);
            }
        }
    }
}

