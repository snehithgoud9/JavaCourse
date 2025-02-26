class A{
    public void method1(){
        System.out.println("Hi, iam Parent class");
    }
}

class B extends A{
    public void method2(){
        System.out.println("Hi,iam child class");
    }
}


class C extends A{
    public void method3(){
        System.out.println("Hi,iam child class2");
    }
}

class D extends B{

    public void method4(){
        System.out.println("Hi iam child class 3");
    }

}


public class Hybrid {
    public static void main(String[] args) {
        
        A a=new A();
        B b=new B();
        C c=new C();
        D d=new D();

        a.method1();

        b.method1();
        b.method2();

        c.method1();
        c.method3();

        d.method1();
        d.method2();
        d.method4();
        
    }
    
}
