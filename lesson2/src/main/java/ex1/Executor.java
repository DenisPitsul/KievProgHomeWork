package ex1;

public class Executor {
    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.print("Array: ");
        outputArray(array);

        int evenNumbersCount = getEvenNumbersCount(array);
        System.out.println("Even numbers count: " + evenNumbersCount);
    }

    private static int[] generateArray() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9 + 0);
        }
        return array;
    }

    private static void outputArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int getEvenNumbersCount(int[] array) {
        int evenNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                evenNumbersCount++;
        }
        return evenNumbersCount;
    }
}
