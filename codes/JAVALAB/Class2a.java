class student{
    int rollno;
    String Name;
   void insert ( String N ,int R){
       Name = N;
       rollno = R ;
   }
   
void display(){
    System.out.println("My Name is "+ Name + " My Roll No is "+  rollno );
}

}

public class Class2a {  
    public static void main(String[] args) {
         student s1 = new student();
         student s2 = new student();
         s1.insert ("Tony",6155);
         s2.insert ("Mony",6195);
         s1.display();
         s2.display();

    }
    
}
