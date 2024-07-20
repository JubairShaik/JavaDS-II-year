package DataStructure.jaavaaa;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size;

    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode ;
            return;
        }
        
        newNode.next = head ;
        head = newNode ;
    }




    public void addLast (int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }


    public void removeFirst(){
        if(head==null){
            System.out.println("LL IS Empty");
            return ;
        }
        head= head.next;
        size--;

    }


    public void removeLast(){
        if(head==null){
            System.out.println("LL IS Empty");
            return ;
        }

        Node First = head;
        Node Second = head.next;
        while(Second.next != null){
            First=First.next;
            Second=Second.next;
        }
        First.next=null;
        size--;
    }

    public void addAfter(int data, int key){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;

        if( head==null){
            System.out.println("Element Not Found");
        }
        while(temp.data!=key){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next= newNode;
    }




    public void print (){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp= temp.next;
    }
    System.out.println("null");
}

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(20);
        ll.addFirst(21);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(20);
        ll.print();
        ll.addAfter(31, 3);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
         
        System.out.println("The Size of The Linked List is "+ (LinkedList.size));
    }   
}

