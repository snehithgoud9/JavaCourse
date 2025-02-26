interface FirstInterface {
    public void myMethod(); // interface method
  }
  
  interface SecondInterface {
    public void myOtherMethod(); // interface method
  }
  
  // DemoClass "implements" FirstInterface and SecondInterface
  class DemoClass implements FirstInterface, SecondInterface {



    public void myMethod() {
      System.out.println("Iam the first method");
    }
    public void myOtherMethod() {
      System.out.println("Iam the other method");
    }
  }



  

  


public class Interf {
    public static void main(String[] args) {
        DemoClass d=new DemoClass();
        d.myMethod();
        d.myOtherMethod();
        
    }
    
}
