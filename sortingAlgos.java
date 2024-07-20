public class sortingAlgos {
    
    public static void printArr(int arr[]) {
        for(int i=0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

    public static void bubbleSort(int arr[]) {

        for(int i =0 ; i< arr.length-1 ;i++){
            for (int j=0 ; j<arr.length-i ;j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr [j]= arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
            
        }
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


    

    public static void SelectionSort(int arr[]) {
        for(int i =0; i<arr.length-1 ;i++){
            int minPos = i; 

            for(int j =i+1 ; j<arr.length; j++){
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
        
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        
        }     
    }


    public static void main(String[] args) {
 
        int arr[]= {1,3,4,5,6,2};
        insertion(arr);
        printArr(arr);        
        SelectionSort(arr);
        printArr(arr);        
        // bubbleSort(arr);
        // printArr(arr);        
    }
    
}
