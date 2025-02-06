//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class arrString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array of String: ");
        int size = sc.nextInt();

        int totLength = 0;

        String array[] = new String[size];
        System.out.println("Enetr the element of array:");
        for(int i=0;i<size;i++){
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.println("Cumulative length of all strings is "+totLength);

        sc.close();
    }
}