public class InsertionSort {
    public static void main(String... args) {
        int arr[] = { 5, 6, 2, 3, 1 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
