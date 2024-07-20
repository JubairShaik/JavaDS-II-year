public class Subarrrays {
    public static void printSubarrays(int numbers []) {
        int total = 0;
        for (int i=0 ; i<numbers.length ; i++){
            int start = i ;
            for (int j=i ; j<numbers.length ; j++){
                int end = j;
                for(int k = start ; k<= end ; k++){
                    System.out.print((numbers[k]+" "));
                }
                total++;
                System.out.println( );
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays are " + total );
        
    }
    public static void main(String[] args) {
        int numbers [] = {2,5,6,7,8,9,3};
        printSubarrays(numbers);
    }
    
}



// nested Loops 

// output

Subarrrays
2 
2 5 
2 5 6 
2 5 6 7 
2 5 6 7 8 
2 5 6 7 8 9 
2 5 6 7 8 9 3 

5 
5 6 
5 6 7 
5 6 7 8 
5 6 7 8 9 
5 6 7 8 9 3 

6 
6 7 
6 7 8 
6 7 8 9 
6 7 8 9 3 

7 
7 8 
7 8 9 
7 8 9 3 

8 
8 9 
8 9 3 

9 
9 3 

3 

// Total Sub Arrays are 28
