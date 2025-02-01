//Take an array of names as input from the user and print them on the screen.
import java.util.Scanner;

public class arrNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n=sc.nextInt();

        String[] name = new String[n];// initialize array of names

        //take names as input in array
        for(int i=0;i<n;i++){
            System.out.print("Enter name "+(i+1)+": ");
            name[i]=sc.next();
        }

        //print names as output of array
        System.out.println("\nNames you entered:");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+". "+name[i]);
        }

        sc.close();
    }
}
