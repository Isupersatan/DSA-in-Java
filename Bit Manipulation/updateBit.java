
import java.util.Scanner;
// Update Bit:
// Update the second bit (pos=1) of a number n to 1.(n=0101)
// for 1 clear function
// for 0 set function
public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("choose 1 for update to 1 and Choose 0 for update to 0 ");
        int func = sc.nextInt();

        int n = 5; // 0101 in binary

        System.out.println("Enter the postion: ");
        int pos = sc.nextInt();

        int bitMask = 1<<pos;

        if(func == 1){
           int result = n & ~bitMask ;
           System.out.println("After updating to 1: " + result);
        }else{
            int result = n | bitMask ;
            System.out.println("After updating to 0: " + result);
        }
    }
}
