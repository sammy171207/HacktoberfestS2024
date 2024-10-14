import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 10, 1, 2, 1};
        quicksort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array)); // Output: [1, 1, 2, 3, 6, 8, 10]
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);  // Recursively sort the left part
            quicksort(arr, pivotIndex + 1, high); // Recursively sort the right part
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = (low - 1);     // Index of the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (the pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }
}
