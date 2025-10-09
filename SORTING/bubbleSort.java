class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,5,1,9,4,0,1};
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            boolean flag = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                   int temp =  arr[j] ;
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   flag = true; //swapp happened
                }
            }

            if (!flag){ //no swapp means array sorted!
                break;
            }
        }

        //output
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}