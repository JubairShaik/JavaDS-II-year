public class DoubleLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data= data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;


    public void addFirst(int data){
        Node newNode = new Node(data);
            size++;

            if(head==null){
                head= tail= newNode;
                return;
            }
            
            newNode.next= head;
            head.prev= newNode;
            head = newNode;
    }



    public void addLast(int data){
        Node newNode = new Node(data);
            size++;

            if(head==null){
                head= tail= newNode;
                return;
            }

            tail.next= newNode;
            newNode.prev=tail;
            tail=newNode;
    }


    // AddAfter the Element :
    public void addAfter(int data , int key){
        
        Node newNode = new Node (data);

        size++;
        
        Node temp= head;
        

       while(temp!=null && temp.data != key ){
        temp = temp.next;
       }

       if(head==null){
        System.out.println("List is Empty");
        return;
       }


       if (temp==null){
        System.out.println("Element Not Found In the List");
        return;
       }

       newNode.next= temp.next;
       temp.next=newNode;
       newNode.prev=temp;
       temp.prev=newNode;  //newnode.next.prev

    }




    // addBefore the Element



    public void addBefore(int data , int key){
        
        Node newNode = new Node (data);

        size++;

        
        
       if(head==null){
         System.out.println("list is empty");
        return;
       }


       Node temp = head;


       while(temp!=null && temp.data != key ){
        temp = temp.next;
       }



       if (temp==null){
        System.out.println("Element Not Found In the List");
        return;
       }

       newNode.next= temp;
       newNode.prev= temp.prev;
       temp.prev=newNode;
       if(newNode.prev !=null){
          newNode.prev.next=newNode;
          return;
       }
       head = newNode;

    }

    
     void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " <-> ");
            temp = temp.next;
        }
        System.out.println("null");

    }


    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        dll.addFirst(5);
        dll.print();
        dll.addFirst(3);
        dll.print();
        dll.addLast(6);
        dll.print();
        
        dll.addLast(2);
        dll.print();
        
        dll.addAfter(50, 5);
        dll.print();


        dll.addBefore(43,6);
        dll.print();
 
        
        System.out.println("The Size of the DoubleLinkedList is " + (dll.size));
    
        
    }
      
}




// output:-

// null
// 5 <-> null
// 3 <-> 5 <-> null
// 3 <-> 5 <-> 6 <-> null
// 3 <-> 5 <-> 6 <-> 2 <-> null
// 3 <-> 5 <-> 50 <-> 6 <-> 2 <-> null
// 3 <-> 5 <-> 43 <-> 6 <-> 2 <-> null
// The Size of the DoubleLinkedList is 6