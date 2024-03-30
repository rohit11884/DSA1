public class rotatearray_onePlace {
    public static void main(String[] args) {

        //left rotate
        int arr[]={5,1,4,1,5,4};
        int n=arr.length;
        // int temp=arr[0];
        // for(int i=1;i<n;i++){
        //     arr[i-1]=arr[i];
        // }
        // arr[n-1]=temp;
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // right rotate
        int temp1=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp1;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
