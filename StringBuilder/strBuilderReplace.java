/*Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ 
in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”*/
import java.util.Scanner;

public class strBuilderReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String original = sc.nextLine();
        StringBuilder replce = new  StringBuilder(original);
        
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)=='e'){
                replce.setCharAt(i,'i');
            }
        }
        System.out.println("Original String: "+original);
        System.out.println("Replaced String: "+replce.toString());
    }
}
