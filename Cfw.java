import java.util.*;
import java.io.*;

public class Cfw {
    public static void main(String[] args) {

        List list=new LinkedList<>();
      

       System.out.println("---------List-----------");
        
        //add method

        list.add("snehith");
        list.add("goud");
        list.add("nyalapatla");
        list.add("nyalapatla");
        System.out.println(list); //[snehith, goud, nyalapatla,nyalapatla]

        list.toArray();
        System.out.println(list);
        
          //clear method
          list.clear();
          System.out.println(list); //[]
      

        //addAll method

        boolean b=Collections.addAll(list,"annie","ben","cherry");
        System.out.println(list); //[annie, ben, cherry]

        //remove
        list.remove("annie");
        System.out.println(list); //[ben, cherry]

        //remove all

        list.removeAll(list);
        System.out.println(list); //[]

        list.add("aaa");
        list.add("bbb");
      System.out.println(list);// [aaa, bbb]


      //size
       System.out.println(list.size());

      System.out.println(list.iterator()); //java.util.LinkedList$ListItr@5305068a

      System.out.println(list.isEmpty());//false
      System.out.println(list.hashCode()); //3084226
      System.out.println(list.contains("aaa"));//true
      System.out.println(list.equals("bbb"));//false

      System.out.println("---------------Linked List-------");
//----------------------------------------------------------------------------------------------------------------------------------------//
        LinkedList l1=new LinkedList<>();
        l1.add("bangladesh");
        l1.add("bihar");
        l1.add("bombay");
        l1.add("calcutta");
        l1.addFirst("ahmedabad");
        l1.addLast("dehradun");
        System.out.println(l1); //[ahmedabad, bangladesh, bihar, bombay, calcutta, dehradun]
        l1.add(1, "andaman");
        System.out.println(l1);//[ahmedabad, andaman, bangladesh, bihar, bombay, calcutta, dehradun]
        System.out.println(l1.remove("bangladesh")); //true
        System.out.println(l1.remove(2));// bihar
        System.out.println(l1); //[ahmedabad, andaman, bombay, calcutta, dehradun]
        System.out.println(l1.removeFirst()); //ahmedabad
        System.out.println(l1); //[andaman, bombay, calcutta, dehradun]

        System.out.println(l1.removeLast()); //dehradun
        System.out.println(l1);//[andaman, bombay, calcutta]

     
       
        System.out.println(l1.get(2));//calcutta
        System.out.println(l1.getFirst());//andaman
        System.out.println(l1.getLast());//calcutta
        System.out.println(l1.contains("bihar"));//false
      
       
      System.out.println(l1.size()); //3
        System.out.println(l1.isEmpty());//false
        System.out.println(l1.equals("bdb"));//false
        
        //---------------------------------------------------------------------------------------------------------------//

        System.out.println("----------------ArrayList----------------------------");
        ArrayList al=new ArrayList<>();

    al.add("cricket");
    al.add("hockey");
    al.add("soccer");
    al.add("baseball");
    al.add(0, "badminton");//[badminton, cricket, hockey, soccer, baseball]
    System.out.println(al);
    System.out.println(al.reversed()); //[baseball, soccer, hockey, cricket, badminton]
    System.out.println(al.set(1, "football"));//cricket
    System.out.println(al);//[badminton, football, hockey, soccer, baseball]
    System.out.println(al.indexOf("badminton"));//0
    al.sort(null);
        System.out.println(al);//[badminton, baseball, football, hockey, soccer]
    





        System.out.println("------------------VECTOR-----------------");
        Vector v=new Vector<>();
        
        v.add("ab");
        v.add("bc");
        v.add("cd");
        v.add("de");
                System.out.println(v); //[ab, bc, cd, de]
        System.out.println(v.capacity()); //10

        v.clone();
        System.out.println(v); //[ab, bc, cd, de]
        

    v.setSize(9);
System.out.println(v);  //[ab, bc, cd, de, null, null, null, null, null]

v.trimToSize();
System.out.println(v);



System.out.println("---------STACK------------------");

Stack st=new Stack<>();
st.push("first");
st.push("second");
st.push("third");
st.push("fourth");
st.push("fifth");
  System.out.println(st);//[first, second, third, fourth, fifth]
   System.out.println(st.pop());//fifth
   System.out.println(st.peek());//fourth
   System.out.println(st.empty());//false
   System.out.println(st.search("fourth")); //1
   System.out.println(st.search("sevemth")); //-1

}
       

        
    }
    

