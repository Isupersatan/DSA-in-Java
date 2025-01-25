public class palidromic_num_pattern {

    public static void draw(int n){
        for(int i=1;i<=n;i++){
            //for spaces=n-i
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for 1st half number print i to 1
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //for 2nd half number print 2 to i if i = 1 print nothing
            for (int  j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;

        draw(n);
    }
}
