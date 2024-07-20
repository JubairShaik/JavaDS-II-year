






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
