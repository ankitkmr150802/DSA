public class insertionSort {
    public static void main(String[] args) {
        int [] arr = {2,5,1,9,4,0,1};
        int n = arr.length;
        for(int i = 1 ; i < n; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){  //unsorted part
                //swap j and j-1
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        //output
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
