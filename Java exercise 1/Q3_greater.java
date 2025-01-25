import java.util.*;

public class Q3_greater {

    public static int greater(int num1, int num2) {
        if (num1 > num2) {
            System.out.print("Greater number is: " + num1);
            return num1;
        }else if(num1<num2){
            System.out.print("Greater number is: " + num2);
            return num2; 
        }else{
            System.out.println("Both numbers are equal");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        greater(num1, num2);

        sc.close();
    }
}
