public class QArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr= new int[n];
            size = n;
            rear =-1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add (int data){
            if (rear==size-1){
                System.out.println("Queue is Empty");
                return;
            }
            rear= rear+1;
            arr[rear]=data;
        }


        public static int remove(){
           if(isEmpty()){
             System.out.println("Queue is Empty");
             return -1;
           }
           
           int front=arr[0];


           for (int i = 0; i < arr.rear ; i++) {
               arr[i]++;
            
           }
           rear--;
            

        }
       
    }
    public static void main(String[] args) {
        Queue q = new Queue(6);

    }
    
}
