public class insrtSort{
    //insertion sort
    public static void sorting(int []arr){
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        arrPrint(arr);
    }

    public static  void arrPrint(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.err.println(" ");
    }

    public static void main(String [] args) {
        int []arr = {7,8,3,1,2};

        sorting(arr);
    }
}