//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.Scanner;

public class strLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array of string");
        int n = sc.nextInt();

        String arr[] = new String[n];
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next();
        }

        StringBuilder combined = new StringBuilder();
         for(String str:arr){
            combined.append(str);
        }

        int total_length = combined.length();
        System.out.println("Cumulative length of all strings is: "+total_length);

        sc.close();
    }
}
