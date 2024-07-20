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
