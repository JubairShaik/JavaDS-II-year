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
