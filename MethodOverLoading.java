class c1{
    public void add(){
        int a=10;
        int b=20;
        System.out.println(a+b);

    }
}
 class C2 {
    //method with same name and different parameter
public void add(String s)
{

System.out.println(s.concat("Loading"));


}
    
}



public class MethodOverLoading {
    public static void main(String[] args) {

        c1 c=new c1();
        C2 b=new C2();


        c.add();
        b.add("Method");
        
    }
    
}
