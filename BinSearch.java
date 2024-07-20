public class BinSearch {

    public static int BinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length-1;
        while(start<=end) {
            int mid = (start + end) /2 ;

            // Comaparisons
            if (numbers[mid] == key){
                return mid;

            }
            if (numbers[mid]< key){ // right Side
                start = mid+1;

            }else{ //left side
                end = mid-1;

            }   
        }
        return -1;
        
    }
    
    public static void main(String[] args) {
        int numbers[] = {6,56,34,45,456,65,4,34,324};
        int key= 5446 ;
        System.out.println("The Index for key is "+ BinarySearch(numbers, key));
        
    }
    
}








// output:-----------------
// The Index for key is 1



// The Time Complexity is log(n) 
// BinarySearch is Better than LinearSearch 