// Implementation of Queues() using Arrays 
//  Queues = F I F O 


public class Qarray {

    static class Queue{
        static int arr[] ;
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 ;

        }

        public static void add ( int data){
            if (rear== size-1){
                System.out.println("Queue is Full !");
                return;
            }
            
            rear = rear+1;
            arr[rear]= data;
            
        }
        
        public static int remove(){
            if(isEmpty()){

                System.out.println("Queue is Full");
                return -1;
            }

                int front = arr[0];
                for (int i =0 ;i<rear;i++){
                    arr[i]=arr[i+1];
                }
                rear = rear-1;

                return front; 

            // peek?

        }
        public static int  peek(){
            if(isEmpty()){

                System.out.println("Queue is Full");
                return -1;
            }
            return arr[0];
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(9);
        q.add(7);
        q.remove();

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
 
    }
}

/**
output:
    5
    6
    9
    7    
**/



// Implementation of Queues() using  LinkedList

// public class QueueB{
//     static class Node{
//         int data;
//         Node next ;
//         Node(int data){
//             this.data= data;
//             this.next =null;
//         }
//     }

//     static class Queue{

//         static Node head= null;
//         static Node tail= null;

//         public static boolean isEmpty() {
//             return head == null & tail == null ;
            
//         }

//       // add 
//       public static void add(int data){
//           Node newNode = new Node(data);
//            if(head==null){
//               head= tail= newNode;
//               return ;
//            }
//            tail.next= newNode;
//            tail = newNode;
//       }



//       public static int remove(){
//         if(isEmpty()){
//             System.out.println("its a Empty Queue .........");
//             return -1;
//         }
//         int front = head.data;

//         //single Element case
//         if(tail == head){
//             tail=head=null;

//         }else{
//             head= head.next;
//         }
//         return front;
//       }


//       //peek

//       public static int peek(){
//         if(isEmpty()){
//             System.out.println("its a Empty Queue  ");
//             return -1;
//         }
//         return head.data;
        
//       }
      
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.remove();
//         q.remove();
//         q.remove();
//         q.remove();
//         q.remove();

//         while (!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }

// }


// o/p
// its a Empty Queue .........