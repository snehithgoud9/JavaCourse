class School{
    public void method1(){
        System.out.println("Hi, Iam School");
    }
}

class Principal extends School{
    public void method2(){
        System.out.println("Hi,iam principal i work in school");
    }
}


class  Teacher extends School{
    public void method3(){
        System.out.println("Hi,iam teacher i work in school");
    }
}



public class HierarchicalInheritance {
    public static void main(String[] args) {

        School s=new School();
        Principal p=new Principal();
        Teacher t=new Teacher();

        s.method1();


        p.method1();
        p.method2();


        t.method1();
        t.method3();
        
    }
    
}
