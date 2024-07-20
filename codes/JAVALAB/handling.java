
// 10. Exeption Handling

public class handling {
    public static void main(String[] args) {
        try{
            int a = 5/0;
            System.out.println("a value = " + a);
        }
        catch(ArithmeticException e){
            System.out.println("The Exeption is " +e );
        } 
    }
}


// OUTPUT:
// The Exeption is java.lang.ArithmeticException: / by zero
