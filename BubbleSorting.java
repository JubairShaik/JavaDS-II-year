 
public class BubbleSorting {


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


    public static void printArr(int arr[]) {
        for(int i=0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }


    public static void main(String args[]) {
 
        int arr[]= {1,3,4};
               
        bubbleSort(arr);
        printArr(arr);        
    }
    
}
