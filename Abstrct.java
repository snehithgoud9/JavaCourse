 abstract class Add{
   public abstract void rev();

}

class Demo extends Add{
   public void rev(){
        String n="ABSTRACT";
        StringBuffer sb=new StringBuffer(n);
        sb.reverse();
        System.out.println(sb);
    }

}

public class Abstrct {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.rev();
        
    }
    
}
