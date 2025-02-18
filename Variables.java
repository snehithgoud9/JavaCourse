public class Variables {
    int a=10; // instance variable
    int c=30;
    static int b=20; //static variable
    public void method(){
        System.out.println(c);
    }
    public static void main(String[] args) {

        int n=300;//local variable
    
        Variables v=new Variables();
        System.out.println(v.a);//printing the instance variable using the object reference since it is in the static area
        v.method();// printing the instance variable value directly using the method calling as the mthod is in non static area
        

        System.out.println(v.b);// printing static variable using object ref
        System.out.println(Variables.b);//printing stativ variable using the class name
        System.out.println(b);//printing the static variable directly within the class



        System.out.println(n);//priting local variable
    }
}
