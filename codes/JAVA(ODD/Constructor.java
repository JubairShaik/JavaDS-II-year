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
