//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;

public class Q2_Sum_Odd_Function {

    public static void sumOfOdd(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input the range
        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        //call sumOfOdd
        sumOfOdd(n);

        sc.close();
    }
}
