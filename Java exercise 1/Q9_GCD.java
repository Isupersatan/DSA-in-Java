// 9.  Write a function that calculates the Greatest Common Divisor of 2 numbers. 
// (BONUS) 
import java.util.Scanner;

public class Q9_GCD {

    public static int gCD(int a, int b){

        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("The GCD of two number is: "+gCD(num1,num2));
    }
}
