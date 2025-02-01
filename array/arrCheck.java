/* Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.
 */
import java.util.Scanner;

public class arrCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        //input
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        
        // check sorted or not.
        boolean isAscending = true;
        for (int i = 0; i < n - 1; i++) {
            if (num[i] > num[i + 1]) {
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
        sc.close();
    }    
}
