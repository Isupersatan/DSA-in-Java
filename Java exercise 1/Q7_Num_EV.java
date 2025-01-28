//7.  Write a program to enter the numbers till the user wants and at the end it 
//should display the count of positive, negative and zeros entered. 
import java.util.Scanner;

public class Q7_Num_EV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posCount = 0;
        int negCount = 0;
        int zero = 0;

        System.out.println("Enter Numbers (Enter -999 to stop):");

        while (true) { 
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num == -999) {
                break;
            }

            if (num>0) {
                posCount++;
            } else if(num<0) {
                negCount++;
            }else{
                zero++;
            }
        }
        System.out.println("\nResult:- ");
        System.out.println("Positive numbers: " + posCount);
        System.out.println("Negative numbers: " + negCount);
        System.out.println("Zero: " + zero);

        sc.close();
    }    
}
