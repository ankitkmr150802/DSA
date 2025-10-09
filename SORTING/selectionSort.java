public class selectionSort {
    public static void main(String[] args) {
        int [] arr = {2,5,1,9,4,0,1};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int min_index = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;  //j is the min element
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        //output
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
