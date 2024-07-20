// 2.A)


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



//Q.4)  Run Time Polymorphism

class addition{
    void sum(int a, int b){
        System.out.println("sum is "+ (a+b));
    }
    void sum(float a, float b , float c){
        System.out.println("Sum is "+(a+b+c));
    }
    void sum(int a, float b){
        System.out.println("Sum is "+(a+b));
    }
}


public class methodoverloading {
    public static void main(String[] args) {
        addition a1= new addition();
        a1.sum(2,4);
        a1.sum(2.2f,4.4f,6.7f);
        a1.sum(2,4.4f);

    }
    
}




// 6th Question

abstract class shape{
    abstract void area();
}

class circle extends shape{
    void area(){
        System.out.println("Area of Circle");
    }
}
class rectangle extends shape{
    void area()
    {
        System.out.println("Area of Rectangle");
    }
}

public class abstraction {
    public static void main(String[] args) {
        circle c = new circle();
        c.area();
        rectangle r = new rectangle();
        r.area();       
    }
    
}




 
// 8Q. interface

interface interface01{
    int a = 10;
    public void show();
}

interface interface02{
    int a = 10;
    public void show();
}
class demo implements interface01{
    public void show(){
        System.out.println("A Class can Implements more than one Interface");
    }
}

public class interfacedemo {
    public static void main(String[] args) {
        demo d = new demo();
        d.show();
        System.out.println(interface01.a);
    }
    
}


// A Class can Implements more than one Interface
// 10





// // 10. What is Mentby Exceptional Handling


// The Exception Handling in Java is one of the powerful mechanism to 
// handle the runtime errors
// so that normal flow of the application can be maintained. 



// Exceptional Handling


public class catchclasses {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
        }
        catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }  
        catch (Exception e){
            System.out.println("Its Exeption");
        }
    }
    
}











// Q.12. userDefinedExeption

class myownException extends Exception{

}

public class userDefinedExeption {
    public static void main(String[] args) {

        try{
            throw new myownException();
        }
        catch(myownException e){
            System.out.println("caught the Exeption");
        }
        
    }
    
}

// java userDefinedExeption
// caught the Exeption








// Q 14.RunnableThreadClass

class MyThread implements Runnable{
    public void run (){
        for (int i = 1; i <  6; i++) {
            System.out.println("InsideRun");
            
        }
    }
}
public class RunnableThreadClass {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread obj1 = new Thread(obj);
        obj1.start();
        for (int j = 0; j < 6 ; j++) {
            System.out.println("Inside Main");
        }
        
    }
    
}
