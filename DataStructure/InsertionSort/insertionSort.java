public class insertionSort {

    
    public static void printArr(int arr[]) {
        for(int i=0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

    public static void insertion(int arr[]){
        for (int i=0; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr){
                
                {
                arr[prev+1]=arr[prev];
                prev --;
                    
                }
                arr[prev+1]=curr;
            }
        }

    }

    public static void main(String[] args) {
 
        int arr[]= {1,3,4,5,6,2};
        insertion(arr);
        printArr(arr);        
    }
    
}
