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
