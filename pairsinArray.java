public class pairsinArray {
    public static void printPairs(int numbers[]) {
         int totalpairs = 0 ;
        for (int i = 0 ; i<numbers.length ; i++) {
            int current = numbers[i]; // 1
            for (int j = i+1 ; j<numbers.length ; j++){
                System.out.print("("+ current + ","+numbers[j]+") ");
                totalpairs++;
            }
            System.out.println(  );

        }
        System.out.println("Total Pairs = "+ totalpairs);
        
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,4,6,8,9};
        printPairs(numbers);
    }
     
    
}



// nestedLoops

// pairsinArray : OUTPUT:: 

// (1,2) (1,4) (1,6) (1,8) (1,9) 
// (2,4) (2,6) (2,8) (2,9) 
// (4,6) (4,8) (4,9) 
// (6,8) (6,9) 
// (8,9) 

// Total Pairs = 15