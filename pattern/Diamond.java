public class Diamond {

    public static void draw(int n){
    //upper half
        // for to iterate n times
        for (int i = 1; i <= n; i++) {

            //for spaces = n-1
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars = 2*i-1
            for(int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    //lower half
        // for reverse iterate n times
        for (int i = n; i >=1; i--) {

            //for spaces = n-1
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars = 2*i-1
            for(int k = 1;k<=2*i-1;k++){
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
