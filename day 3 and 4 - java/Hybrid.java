interface GrParent{
    int a = 100;
    void gpmethod();
}

interface Parent1 extends GrParent{
    int b = 200;
    void ponemethod();
}

interface Parent2 extends GrParent{
    int c = 300;
    void ptwomethod();
} 

public class Hybrid implements Parent1, Parent2 {
    
    public void gpmethod(){
        System.out.println("This is grand parent method");
    }
    public void ponemethod(){
        System.out.println("This is parent one method");
    }
    public void ptwomethod(){
        System.out.println("This is parent two method");
    }
    public static void main(String[] args) {
        Hybrid obj = new Hybrid();
        obj.gpmethod();
        obj.ponemethod();
        obj.ptwomethod();
        System.out.println("Grand parent prop: "+ GrParent.a);
        System.out.println("parent one prop: "+ Parent1.b);
        System.out.println("parent two prop: "+ Parent2.c);
    }
}
