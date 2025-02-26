class A{
    public void method1(){
        System.out.println("Hi, iam Parent class");
    }
}

class B extends A{
    public void method2(){
        System.out.println("Hi, iam childclass");
    }
    
}

class C extends B{
    public void method3(){
        System.out.println("Hi,iam child class2");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        a.method1();


        b.method1();
        b.method2();


        c.method1();
        c.method2();
        c.method3();
        
    }
    
}
