// import java.util.*;


public class LargestNuminArray {

    public static  int  getLargest(int numbers[]) {

        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i =0 ; i<numbers.length ; i++){
            if (largest< numbers[i]){
                largest = numbers[i];
            }
            
            if (smallest> numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The Smallest Value is :"+ smallest);
        return largest ;     
    
    }


    public static void main(String[] args) {
        int numbers[]={1,2,3,34,4,556,6,7,8};
        System.out.println("The Largest Element in The Array is "+ getLargest(numbers));

    }

    
}

// IN java :
// -infinity == integer.MIN_VALUE == Assuming its a Least Value
// +infinity == integer.MAX_VALUE == Assuming its a Greatest Value