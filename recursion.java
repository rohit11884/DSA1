// import java.util.*;
class recursion{
    public static int sum(int n){
        if(n==0)
        return 0;
        return n+sum(n-1);
        
    }
    public static int fact(int n){
        if(n==0||n==1)
        return 1;

        return n*fact(n-1);
    }
    public static void reverse(int arr[],int i,int n){

        // USIGN LOOP

        // for(int i=0;i<n/2;i++){
        //         int temp=0;
        //         temp=arr[i];
        //         arr[i]=arr[n-i-1];
        //         arr[n-i-1]=temp;
            
        // }

        // USING RECURSION
            
            if(i>=n/2)
            return ;

            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

            reverse(arr, i+1, n);


    }
    public static boolean palindrome(String s,int i,int n){
        if(i>=n/2)
        return true;

        if(s.charAt(i)!=s.charAt(n-i-1))
        return false;

        return palindrome(s, i+1, n);
        

    }
    public static void main(String[] args) {
        // int n=5;
        // System.out.println(sum(n));
        // int a=fact(n);
        // System.out.println(a);
        
        // int arr[]={2,3,4,5,6};
        // int n=arr.length;
        // reverse(arr, 0,n);
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        String s="madam";
        int n=s.length();
        if(palindrome(s, 0, n)){

            System.out.println("yes");
        }
        else
        System.out.println("not");
    }

}