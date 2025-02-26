 class Property{


    public void Gold(int num){
        {
            System.out.println("the whole gold is "+num);
        }
    }
 }
 class Assets {
    //method with same name and same parameter
    public void Gold(int num){
        System.out.println("No the whole gold value is"+num);

    }
}




public class MethodOverRiding {
    public static void main(String[] args) {
        Property p=new Property();
        Assets a=new Assets();

        p.Gold(55);
        a.Gold(95);
        
    }
    
}
