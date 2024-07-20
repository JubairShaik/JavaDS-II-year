public class LinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    

    public static void addFirst(int data){
        Node newNode = new Node(data) ;
        size++;
        if(head==null){
            head = tail = newNode;
        }
        newNode.next= head;
        head= newNode;
    }


    public static void addLast(int data){
        Node newNode = new Node(data) ;
        size++;

        if(head==null){
            head = tail = newNode;
        }

         tail.next= newNode;
         tail = newNode;
    }


    public void add(int data, int number){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }
        Node temp = head;

        if( head==null){
            System.out.println("Element Not Found");
        }
        while(temp!=null && temp.data!=number){
            temp=temp.next;
        }
        newNode.next=temp;
        temp.next= newNode;
    }


    public void print(){
        Node temp = head;
        while( temp!=null){
            System.out.print(temp.data+ "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(10);
        
        
        // ll.addFirst(20);
        // ll.print();
        // ll.addFirst(30);

        // ll.print();
        ll.addFirst(40);
        ll.print();
        // ll.add(10, 2);
        
    }
    
}
