
public class butterfly {

    public static void draw(int n) {
        //upper half
        for (int i = 0; i <= n; i++) {
            //for 1st part star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for space
            int space = 2 * (n - i);
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            //for 2nd part star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = n; i >= 1; i--) {
            //for 1st part star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for space
            int space = 2 * (n - i);
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            //for 2nd part star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;

        draw(n);
    }
}
