import sorts.BubbleSort;

public class Main {

    public static void main(String[] args) {
        //Initialize array
        int[] array = new int[]{5, 10, 15, 13, 8, 1, 6};

        //Not sorted array
        toString(array);

        //Sorting
        BubbleSort.sort(array);

        //Sorted array
        toString(array);
    }

    public static void toString(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " " );
        }
        System.out.println();
    }
}
