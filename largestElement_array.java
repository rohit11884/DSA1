public class largestElement_array {
    public static void main(String[] args) {
        int arr[]={3,5,3,6,2,6,9};
        int n=arr.length;

        int largest=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest element in an array is : "+largest);
    }
}
