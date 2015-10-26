import java.util.Arrays;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] A = {1, 55, 12, 5, 26, 7, 14, 3, 7, 2, 44};
        quickSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }

    public static void quickSort(int[] A, int start, int end) {
        if (start < end) {
            int pIndex = partition(A, start, end);
            quickSort(A, start, pIndex - 1);
            quickSort(A, pIndex + 1, end);
        }
    }

    public static int partition(int[] A, int start, int end) {
        // This pivot can be anything that you want as long as its consistent
        int pivot = A[end];
        // Store the starting number
        int partitionIndex = start;

        // Loop from the start to the end of the array
        for (int i = start; i < end; i++) {
            // If the element in the array id greater than the pivot value
            if (A[i] <= pivot) {
                // Swap the value that is greater than the pivot and swap the value with
                // the current partition index.
                swapper(i, partitionIndex, A);
                //
                partitionIndex++;
            }
        }
        // After all
        swapper(partitionIndex, end, A);
        return partitionIndex;
    }

    /**
     *
     * @param a index to swap values with index b
     * @param b index to swap values with index b
     * @param mainArr The array of Integers to mutate
     */
    private static void swapper(int a, int b, int[] mainArr) {
        int t = mainArr[a];
        mainArr[a] = mainArr[b];
        mainArr[b] = t;
    }
}
