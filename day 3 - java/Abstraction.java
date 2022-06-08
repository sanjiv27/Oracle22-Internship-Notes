/*
 * 
 */
abstract class Abs1{
    
    int a= 100;
    int b;
    
    Abs1(int b){
        this.b= b;
    }
    
    abstract void method1();
    
    abstract void method2();
    
    void simpleMethod1(){
        System.out.println("Abs1 Sum: "+ (a+b));
    }
    void simpleMethod2(){
        System.out.println("Abs1 Multiplication: "+ (a*b));
    }
}

abstract class Abs2 extends Abs1{
    int a= 50;
    int b;
    
    Abs2(int b){
        super(b);
        this.b= b;
    }
    
    abstract void method1();
    
    abstract void method3();
    
    void simpleMethod1(){
        System.out.println("Abs2 Sum: "+ (a+b));
    }
    void simpleMethod3(){
        System.out.println("Abs2 Multiplication: "+ (a*b));
    }
}

public class Abstraction extends Abs2{
    
    Abstraction(int b){
        super(b);
    }
    
    void method1(){
        System.out.println("This is method1");
    }
    
    void method2(){
        System.out.println("This is method2");
    }
    
    void method3(){
        System.out.println("This is method3");
    }
    
    public static void main(String args[]){
        Abstraction obj1= new Abstraction(10);
        Abstraction obj2= new Abstraction(20);
        
        obj1.method1();
        obj1.method2();
        obj1.method3();
        
        obj1.simpleMethod1();
        obj1.simpleMethod2();
        obj1.simpleMethod3();
        
        System.out.println("Object1 var a: "+obj1.a);
        System.out.println("Object1 var b: "+obj1.b);
        System.out.println("Object2 var a: "+obj2.a);
        System.out.println("Object2 var b: "+obj2.b);
    }
}

/*
    3 classes -> 2 abstract class and 1 simple class
    establish multilevel inheritance
    2 mthods in each abst class
    2 of them will be asbt method in which one method name will common in two of the abst classes
    another 2 method in each classes will be simple methods in which one will be same name in each of 
    the classes
    2 variables in each classes, 1 will be defined(having value), 2nd remaining variable will be
    declared and we need to provide value via constructor
    we need atleast two objects, value of remaining var will be different for two objects
 */