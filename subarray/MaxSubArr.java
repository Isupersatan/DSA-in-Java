//subarrays are the countinuos part of and array
//if arr length = n, total number of sub array = n*(n+1)/2.
public class MaxSubArr{
    public static void main(String []args){
        int []arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.println("All possible sub arrays are:");
        //initialize the starting point of subarr
        for(int st=0; st<n; st++){
            //initialize the ending point of subarr
            for(int end=st; end<n; end++){
                //print the all posiible subarrays
                for(int i=st; i<=end; i++){
                    System.out.print(arr[i]);
                    if(i<end){
                        System.out.print(",");
                    }
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}