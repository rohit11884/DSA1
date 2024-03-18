import java.util.*;
class hashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int hash[]=new int[13];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }

        System.out.println("Enter the number of element You want to find its repetation");
        int q;
        q=sc.nextInt();
        System.out.println("Enter the number");
        while(q--!=0){
            int num;
            num=sc.nextInt();
            System.out.println(num+" is repeating "+hash[num]+" times");
        }
    }
}