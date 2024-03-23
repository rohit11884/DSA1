import java.util.*;
public class hash_map {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elemnt in the array");
            int n=sc.nextInt();
            System.out.println("Enter the elements in the array");
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            //Precompute
            HashMap<Integer,Integer> mpp=new HashMap<>();

            for(int i=0;i<n;i++){
                int key=arr[i];
                int freq=0;
                if(mpp.containsKey(key)) 
                freq=mpp.get(key); //fetching from the map
                freq++;
                mpp.put(key, freq);  // inseting into map
            }

            System.out.println("Enter the number elements you want to finds its repetation");
            int q=sc.nextInt();
            System.out.println("Enter the element");
            while(q--!=0){
                int number=sc.nextInt();
                
                //fetch
                if(mpp.containsKey(number))
                System.out.println(number+" repeating "+mpp.get(number)+" times");
                else
                System.out.println(number+" repeating "+0+" times");
            }
        }

    }
    
}
