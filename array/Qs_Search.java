/*Take an array as input from the user . Search for a given number X and print the index at which it occures */
import java.util.Scanner;

public class Qs_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        //intialize an array
        int[] num = new int[n];

        //input
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" :");
            num[i]=sc.nextInt();
        }

        //Given number X
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        //output
        for (int i = 0; i < n; i++) {
            if(num[i]==x){
            System.out.println(x+" occurs in index no:"+i);
            }
        }

        sc.close();
    }
}
