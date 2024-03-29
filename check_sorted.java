public class check_sorted {
public static int check(int arr[],int n){
    for(int i=1;i<n;i++){
        if(arr[i]<arr[i-1]){
            return 0;
        }
    }
    return 1;
}
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        int n=arr.length;
        System.out.println(check(arr, n));
    }
}
