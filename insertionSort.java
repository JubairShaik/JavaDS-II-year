public class insertionSort {

    public static void printArr(int arr[]) {
        for(int i=0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void insertion(int arr[]){
        for (int i=1; i<arr.length; i++){
            int temp = arr[i];
            for ( int j = i+1 ; j>=0; j--){
                if (arr[j]>temp){
                    arr[j+1]= arr[j];
                }else{
                    break;
                }
                
                arr[j+1]= temp;
            }
        }

    }

    public static void main(String[] args) {
 
        int arr[]= {1,3,4,6,2};
        insertion(arr);
        printArr(arr);        
    }
    
}
