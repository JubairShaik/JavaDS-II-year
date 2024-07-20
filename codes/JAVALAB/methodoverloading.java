// Run Time Polymorphism

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
