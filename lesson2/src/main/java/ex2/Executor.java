package ex2;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        int arrayLength = inputArrayLength();

        int[] array = generateArray(arrayLength);

        System.out.print("Array: ");
        outputArray(array);

        sortArray(array);

        System.out.print("Sorted array: ");
        outputArray(array);
    }

    private static int[] generateArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * arrayLength + 1);
        }
        return array;
    }

    private static void outputArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int inputArrayLength() {
        int length;
        while(true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Input array length: ");
                length = in.nextInt();
                if (length > 0) {
                    break;
                } else {
                    System.out.println("You have to input positive numbers.");
                }
            }
            catch(Exception e) {
                System.out.println("You have to input integer.");
            }
        }
        return length;
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
