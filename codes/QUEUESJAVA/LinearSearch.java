LinearSearch


public class LinearSearch {

    public static int Search(int numbers[],int key){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==key){
                return i;
            } 
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,34,54,56,6,8};
        int key = 34;
        int index = Search(numbers, key);
        if(index==-1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found At Index " + index);
        }
        
    }
    
}


Linear Search Using Recurrsion

public class LinearSearch{

    public static int search(int  arr[], int firstIndex , int lastIndex , int key){
        if(lastIndex<firstIndex)
            return -1;
        
        if(arr[firstIndex] ==  key)
            return firstIndex;
        return search(arr, firstIndex+1, lastIndex, key);

    }
     
    public static void main(String[] args) {
        int arr[]= {3,5,6,727,88,9};
        int key = 88;
        int index = search(arr,0,arr.length-1,key);
        if(index !=-1){
            System.out.println("The Element "+ key+"is Present at Index " + index);
        }

        
    }
}





// // Binary Search?


// public class LinearSearch{
    

//     public static int BinarySearch(int arr[], int key){
//        int start=0;
//        int end= arr.length-1;
//         while(start!=end){
//         int mid = (start+end)/2;
        

//         if(arr[mid]==key){
//             return mid;
//         }


//         // comparisions
//         if(arr[mid]<key){

//             // rightSide?
//             start= mid+1;
//         }
//         else{
//              end= mid-1;

//         } 

//     }
//     return -1;

// }





//     public static void main(String[] args) {
//         int arr[]= {3,5,6,727,88,9};
//         int key = 88;
//         int result= BinarySearch(arr,key);
//         System.out.println("The Index of the given Key is"+result);
        
//     }
// }




// Binary Search Using Recurrsion

// public class  BinarySearch{

//     public static int Search(int numbers[] ,int left, int right , int key ){
//         if(right>=left && left<=numbers.length-1){
//             int mid = left + (right-left)/2;
//             if(numbers[mid]==key){
//                 return  mid;
//             }
//             if(numbers[mid]<key){
//                 return Search(numbers,  mid+1, right, key);
//             }else{
//                 return Search(numbers,   left,mid-1, key);
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int numbers[]={1,2,3,4,5,25,6,667,7};
//         int key = 4;
//         int result = Search(numbers,0,   numbers.length-1 , key);
//         if(result!=-1){
//             System.out.println("Element Found At Index "+  result);
//         }else{
//             System.out.println("Element Not Found");

//         }
//     }
// }