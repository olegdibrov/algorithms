package sorts;

public class BubbleSort {

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length ; i++) {
            for (int j = array.length - 1; j >= i ; j--) {
                if (array[j - 1] > array[j]) {
                    swap(array, j);
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int j) {
        int temp = array[j - 1];
        array[j - 1] = array[j];
        array[j] = temp;
    }
}
