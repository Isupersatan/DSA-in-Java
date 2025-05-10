public class slctnSort {
    public static void sorting(int []arr){
        //selection sort
        for(int i = 0; i < arr.length-1; i++){
            int small = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            //swap
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        arrPrint(arr);
    }

     public static  void arrPrint(int []arr){
        System.out.print("The Sorted array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String [] args) {
        int []arr = {7,8,3,1,2};

        sorting(arr);
    }
}
