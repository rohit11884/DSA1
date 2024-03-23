import java.util.*;
class hashing_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int hash[]=new int[100000000];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }

        System.out.println("Enter the number of element You want to find its repetation");
        int q=sc.nextInt();
        System.out.println("Enter the number");
        while(q--!=0){
            int num=sc.nextInt();
            System.out.println(num+" is repeating "+hash[num]+" times");
        }
    }
}