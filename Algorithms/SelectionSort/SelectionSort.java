import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {

    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array Before Sorting: " + Arrays.toString(arr));
        selectionSort(arr, n);
        System.out.println("Array After Sorting: " + Arrays.toString(arr));
    }
}