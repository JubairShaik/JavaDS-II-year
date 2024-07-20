 
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
