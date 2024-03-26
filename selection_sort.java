public class selection_sort {

    public static void sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={34,23,1,66,4,6,33,7};
        int n=arr.length;
        sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
