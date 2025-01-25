//1.  Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class Q1_avg_Function {

    //create avg fuction which doesnt return any value
    public static void avg(double sum) {
        double avg = sum / 3;
        System.out.println("Average of three numbers is: " + avg);
    }

    public static void main(String[] args) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);

        //user input using for loop and calculate the sum
        System.out.println("Enter Three numbers:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Numbers " + i + ": ");
            double num = sc.nextDouble();
            sum += num;
        }
        // call avg funtion and pass sum as argument
        avg(sum);

        sc.close();
    }
}
