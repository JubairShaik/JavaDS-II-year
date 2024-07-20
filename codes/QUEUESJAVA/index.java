//Binary Search Implementation? 
public class index{
    public static void main(String[] args) {
        
    }


}

while (low <= high) {
      mid = (low + high) / 2;
      if (mid > key) {
          high = mid - 1;
      } else if (mid < key) {
          low = mid + 1;
      } else {
          return mid;
      }
}


    while (low <= high) {
        mid = (low + high) / 2;
        if (a[mid] > key) {
            high = mid - 1;
        } else if (a[mid] < key) {
            low = mid + 1;
        } else {
            return mid;
        }
    }


System.out.println("Found " + key + " at " + binarySearch(a, key));



//Source: https://stackoverflow.com/questions/12517764




//Source: https://stackoverflow.com/questions/34452878


