public class quick_sort {
    public static void qs(int arr[],int low,int high){
        if(low<high){
            int PIndex=partition(arr,low,high);
            qs(arr,low,PIndex-1);
            qs(arr,PIndex+1,high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=arr[pivot]&&i<=high-1){
                i++;
            }

            while(arr[j]>arr[pivot]&&i>=low-1){
                j--;
            }

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;

    }
    public static void main(String[] args) {
        int arr[] = { 34, 2, 44, 1, 6, 3, 66, 11, 7, 6 };
        qs(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

