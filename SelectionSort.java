public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 6, 8, 2, 4, 5, 9, 15, 11, 14, 12 };

        int size = arr.length;
        int min = -1;
        for (int i = 0; i < size; i++) {
            min = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[min] > arr[j]) {
                    min = j;

                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < size; i++)
            System.out.println(arr[i]);

        System.out.println("completed");

    }

}
