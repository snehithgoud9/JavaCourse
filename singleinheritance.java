class Parent{
    public void method1(){
        System.out.println("Hi, iam Parent class");
    }
}

class Child extends Parent{
    public void method2(){
        System.out.println("Hi,iam child class");
    }
}




public class singleinheritance {
    public static void main(String[] args) {

        Parent p=new Parent();
        Child c=new Child();

        //p.method1();
        c.method1();
    }
    
}
