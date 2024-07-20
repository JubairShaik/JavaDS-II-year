public class CountSort {
    public static void printArr(int arr[]) {
        for(int i=0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

     //Finding The Largest Element in the Given Array
    public static void CountingSort (int arr[]){

        int largest = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ;i++){
            largest = Math.max(largest, arr[i]);
        }
        
        //Maiking of countArray 
        int count [] = new int[largest+1];

        for (int i= 0 ; i<arr.length;i++){
            count[arr[i]]=count[arr[i]]+1;
    
        }

          //CountSorting
          int j= 0;
          for (int i=0; i<count.length ; i++){

            while (count[i]>0){
                arr[j]=i;
                j=j+1;
                count[i]=count[i]-1;
            }

          }
    }
    

    public static void main(String[] args) {
        int arr []= {1,2,34,54,56,7,8,78,8};
        CountingSort(arr);
        printArr(arr);
    }
    
}
