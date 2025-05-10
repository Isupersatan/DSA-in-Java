public class bblSort {

    public static void sorting(int [] arr) {
        //bubble sort
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
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
