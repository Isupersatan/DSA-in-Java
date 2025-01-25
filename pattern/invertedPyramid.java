public class invertedPyramid {

public static void draw(int n){
    /*for(int i = n; i >= 1; i--){
        for(int j = 1; j <= i; j++){
            System.err.print("* ");
            }
            System.out.println("");
        }*/

    for(int i = 1;i <= n;i++){
        for(int j = 1;j < n-i+1;j++){
            System.out.print("* ");
        }
        System.err.println("");
    }    
}

    public static void main(String[] args) {
        int n = 32;

        draw(n);
    }
}
