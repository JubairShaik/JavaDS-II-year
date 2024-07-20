public class ReverseAnArray {


    public static void reverse(int numbers[]) {
        int first = 0 , last = numbers.length-1;

        while (first<last){

            //swapping
            int temp = numbers[last] ;
            numbers[last] = numbers[first];
            numbers[first] = temp ;
            first++;
            last--;
            

        }

        }
        
    

    public static void main(String[] args) {

        int numbers[] = {2,3,4,56,4,2,15,7,3};

        reverse(numbers);
        
        // printing the Reverse ARRAY ! ? 

        for (int i = 0 ; i<numbers.length ; i++){
            System.out.print(numbers[i]+ " ");

        }

         
    }
    
}

// output: 3 7 15 2 4 56 4 3 2 

// by Swapping The First and Last Elements in An Array we can Reverse an Arrray
// space complexity O(1)
// Time Complexity O(n)