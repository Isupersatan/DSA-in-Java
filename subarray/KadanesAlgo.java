//Kadane’s Algorithm is an efficient algorithm to find the maximum sum of a contiguous subarray in a 1D array of integers.
//Kadane’s Algorithm: O(n) (linear time)

public class KadanesAlgo {
    public static void main(String []args){
        int []arr = {1,2,3,4,5};
        int maxSum = 0;
        int currSum = 0;
        
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            if(currSum>maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println("Maximum sum of subarray is: "+maxSum);
    }
}
