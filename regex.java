import java.util.Scanner;
import java.util.regex.*;




public class regex {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter keyword");
      String sn= sc.nextLine();
   


        Pattern p=Pattern.compile(sn);
        Matcher m=p.matcher("snehithgoud@gmail.com");
        //boolean mf=m.find();
        if(m.find()){
            System.out.println("MAtched");
        }
        else{
            System.out.println("not matched");
        }



        System.out.println(Pattern.matches("\\d", "2"));  
        System.out.println(Pattern.matches("\\w", "5"));
  
        
        System.out.println(Pattern.matches("\\d", "a")); //false 
  
        
        System.out.println(Pattern.matches("\\D", "a")); //true 
  
            
        System.out.println(Pattern.matches("\\D", "2")); //false 



       
    }
}
