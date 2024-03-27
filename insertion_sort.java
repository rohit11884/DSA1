public class insertion_sort {
    public static void sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
                System.out.println("run");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 34, 23, 1, 66, 4, 6, 33, 7 };
        int n = arr.length;
        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
