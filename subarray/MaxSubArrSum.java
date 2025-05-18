//this is the brute force method to calculate the maximum subarray sum. Time Complexity :O(n to the power 3)

public class MaxSubArrSum {
    public static void main(String []args){
        int []arr = {1,2,3,4,5};
        int n = arr.length;
        int maxSum = 0;
    

        //initialize the starting of the subarr
        for(int st=0; st<n; st++){
           int currSum = 0;
            //initialize the ending of the subarr
            for(int end=st; end<n; end++){
                currSum += arr[end];
                if(currSum > maxSum){
                     maxSum = currSum;
                }
            }
        }
        System.out.print("Maximum Sub array Sum is: "+maxSum);
    }
}
