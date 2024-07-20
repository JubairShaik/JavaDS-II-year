public void add (int index ,int data){

    if (index==0){
        addFirst( data);
        return;

    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0 ;
    
   while (i< index-1){
    temp = temp.next;
    i++;
   }
   newNode .next = temp.next;
   temp.next = newNode ;
 }



 public void add (int index ,int data){

    if (index==0){
        addFirst( data);
        return;

    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0 ;
    
   while (i< index-1){
    temp = temp.next;
    i++;
   }
   newNode .next = temp.next;
   temp.next = newNode ;
 }





 public void add (int index ,int data){

    if (index==0){
        addFirst( data);
        return;

    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0 ;
    
   while (i< index-1){
    temp = temp.next;
    i++;
   }
   newNode .next = temp.next;
   temp.next = newNode ;
 }