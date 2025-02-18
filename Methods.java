public class Methods {

    public int demo(int a, int b)
    { 
        // instance method
        
        return a+b;
    }


    static String method1(String str){
        //static method
        return str;

    }


   public Methods(){
    //Constructor
        System.out.println("Hi");
    }


    public Methods(float d){
        System.out.println(d);
    }
    public static void main(String[] args) {
        Methods m=new Methods();
        Methods m4=new Methods(11);
        System.out.println(m.demo(10, 20));//calling an instance method
       
        System.out.println( Methods.method1("snehith"));//calling static method using class name
        System.out.println( m.method1("snehith"));//calling static method using the object ref


        
    }
    
}
