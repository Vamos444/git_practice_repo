public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 6, 8, 2, 4, 5, 9, 15, 11, 14, 12 };

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 9; i++)
            System.out.println(arr[i]);

        System.out.println("completed");

    }
}
