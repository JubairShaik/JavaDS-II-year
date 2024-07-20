// Question 01

public class factorial{

    public static int fact(int n){

        if(n<1){
            return 1;
        }
        if (n==0){
            return 1;
        }
        else{
           return n*fact(n-1);
        }
     }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Factorial is "+ fact( i));
    }

}






// 3.constructor
// Constructor in java is used to create the instance of the class

public class Constructor {
    public static class hello{
        String data;
        hello(String data){
            this.data= data;
            System.out.println("Hello "+ data);
        }
    }
    public static void main(String[] args) {
        new hello("Tony Stark");
    }
    
}


// 3.simpleInheritance


class parent{
    void parentMethod(){
     System.out.println("This Is Parent Method");
    }
}
class child  extends parent {
 void childMethod(){
     System.out.println("This Is Child Method");
    }

}

public class simpleInheritance {
   public static void main(String[] args) {
    child c = new child();
    c.parentMethod();
    c.childMethod();

   }
}



// 7.superKeyword
// What is Super keywords in Java?
// The super keyword refers to superclass (parent) objects.
//  It is used to call superclass methods, and to access the superclass constructor. 
// program To Implement superkeyword

class A{
    int x =100;
    public void display(){
        System.out.println("I am From Class A");
    }
}
class B extends A{
    int x = 200;
    public void display(){
        System.out.println("X from class A "+ super.x);
        super.display();
        System.out.println("I Am From Class B");
    }
     
}


public class superkeyword {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    } 
}



// X from class A 100
// I am From Class A
// I Am From Class B



// 9.ExceptionHandling

// exceptionalHandling Program
// An exception is an error event that can happen during the execution of a program

public class exceptionalHandling {
    public static void main(String[] args) {
        int a=5 ,b=0;
        try{
            int c= a/b;
            System.out.println(c);
        }
        catch ( ArithmeticException ae){
            System.out.println("can't divide by Zero");

        }
        finally{
            System.out.println("Bye");
        }
    }
}

// can't divide by Zero
// bye





// 11.RunTime?

// Runtime Polymorphism = Method OverRiding
// In Java, method overriding occurs
//  when a subclass (child class) has the same method as the parent class.

class bikeSpeed{
    public void run(){
        System.out.println("The Bike Is Running");
    }
}

class carSpeed extends bikeSpeed{
    public void run(){
        System.out.println("The Car Is Running");
    }

}

public class runntimePoly {
    public static void main(String[] args) {
        bikeSpeed s1 = new bikeSpeed();
        s1.run();
    }
}







// 13.Thread

// A thread in Java is the direction or path that is taken while a program 
// is being executed. Generally, all the programs 
// have at least one thread, known as the main thread, that is provided by the JVM or Java

// Thread?

class Thread1 extends Thread{
    public void run(){
        for(int i=0 ; i<=5 ; i++){
            System.out.println("InsideRun");
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        obj.start();
        for(int j= 0; j<=5;j++){
            System.out.println("InsideMain");
        }
    }
    
    
}



// // o/p
// InsideMain
// InsideMain
// InsideMain
// InsideMain
// InsideMain
// InsideMain
// InsideRun
// InsideRun
// InsideRun
// InsideRun
// InsideRun
// InsideRun