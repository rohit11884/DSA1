
public class secondLargest_inarray {
    public static int second_larget(int arr[],int n){

        int largest=arr[0];
        int slargest=-1;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }

            else if(arr[i]<largest&&arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;

    }

    public static int second_smallest(int arr[],int n){
        // int smallest=Integer.MAX_VALUE;
        int smallest=arr[0];
        // int ssmallest=Integer.MAX_VALUE;
        int ssmallest=-1;

        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }

            else if(arr[i]>smallest&&arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {

        int arr[]={3,24,1,7,5,8,-1,-2,4,8};
        int n=arr.length;
        int a=second_larget(arr,n);
        System.out.println(a);
        int b=second_smallest(arr, n);
        System.out.println(b);
        
    }
}
