/*Find the maximum & minimum number in an array of integers. 
[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]*/
import java.util.Scanner;

public class arrMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();//n=size of array

        int[] arr = new int[n];//intialize the arr as array

        //input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }

        //find the maximum and minimum
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        //output
        System.out.println("Maximum element in array is " + max);
        System.out.println("Minimum element in array is " + min);

        sc.close();
    }
}
