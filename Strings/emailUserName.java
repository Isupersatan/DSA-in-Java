/*Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”*/

import java.util.Scanner;

public class emailUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your mail id:");
        String email = sc.nextLine();

        //convert mail to username
        String username = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                username += email.charAt(i);
            }
        }
        System.out.println("Your username is: "+username);
        sc.close();
    }
}
