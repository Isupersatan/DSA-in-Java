//8.  Two numbers are entered by the user, x and n. Write a function to find 
//the value of one number raised to the power of another i.e. x to the power n.
import java.util.Scanner; 
public class Q8_Power {

    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
       return result; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Base: ");
        int x=sc.nextInt();

        System.out.print("Enter the value of Power: ");
        int n=sc.nextInt();

        System.out.println(x+" raised to the power of "+n+" is: "+power(x,n));
        
        sc.close();
    }
}
