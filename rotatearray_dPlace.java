public class rotatearray_dPlace {

    public static void left_rotate(int arr[],int n,int d){
        d=d%n;
        int temp[]=new int[d];

        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }

        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
    }

    public static void right_rotate(int arr[],int n,int d){
        d=d%n;
        int temp[]=new int[d];
        int j=0;
        for(int i=n-d;i<n;i++){
            temp[j]=arr[i];
            j++;
        }
        for(int i=n-1;i>=d;i--){
            arr[i]=arr[i-d];
        }
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int d=3;
        // left_rotate(arr, n, d);
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        right_rotate(arr, n, d);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
