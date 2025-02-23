/*Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”*/
import java.util.Scanner;
public class emailUsrNm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = sc.nextLine();
        StringBuilder sb = new StringBuilder(email);

        int atIndex = sb.indexOf("@");

        if(atIndex != -1) { 
            sb.delete(atIndex, sb.length());
        }
           
        System.out.println("Username:"+sb);

    }
}
