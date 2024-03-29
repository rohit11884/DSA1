import java.util.HashSet;

public class remoneDuplicate_array {

    // Brute force approch
    public static int Duplicate(int arr[],int n){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int k=set.size();
        int j=0;
        for(int x:set){
            arr[j++]=x;
        }
        return k;

    }

    // Optimal approch
    public static int duplicate(int arr[],int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3};  //Sorted array
        int n=arr.length;
        // System.out.println(Duplicate(arr, n));
        System.out.println(duplicate(arr, n));
        
    }
}
