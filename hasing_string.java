import java.util.*;
public class hasing_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="fsdfsdfdfSSAADaaa";

        // int hash[]=new int[26];
        int hash[]=new int[256]; // For both upper and lower case
        for(int i=0;i<s.length();i++){
            // hash[s.charAt(i-'a')]++;  // for lower case
            // hash[s.charAt(i-'A')]++;  // for upper case
            hash[s.charAt(i)]++;  // for both
        }
        System.out.println("Enter the number of characters you want to find its repetation ");
        int q=sc.nextInt();
        System.out.println("Enter the character");
        while (q--!=0) {
            char c=sc.next().charAt(0);

            // System.out.println(c+" is repeating "+hash[c-'a']+" times"); // for lower case
            // System.out.println(c+" is repeating "+hash[c-'A']+" times"); // for upper case
            System.out.println(c+" is repeating "+hash[c]+" times");    // for both
        }
    }
}
