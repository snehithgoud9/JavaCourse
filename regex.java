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
    }
}
