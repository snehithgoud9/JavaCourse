import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



 class Sortset{ //heterogenous datatypes are not allowed
    public void sortset(){

        try {
     SortedSet st=new TreeSet();
     st.add(101);
     st.add(102);
     st.add(103);
     st.add(109);
     st.add(104);
     System.out.println(st);//[101, 102, 103, 104,109]
     System.out.println(st.first()); //101
     System.out.println(st.last());//104
     System.out.println(st.headSet(102)); //101
     System.out.println(st.tailSet(101));//[101, 102, 103, 104]
     System.out.println(st.subSet(101, 103)); //[101, 102]

        } catch (Exception e) {
            // TODO: handle exception
        }

   

    }

}
public class cfwset {
    public static void main(String[] args) {
        try {
            Sortset sst=new Sortset();
            sst.sortset();




            Set set=new HashSet<>(8);
            HashSet hs=new HashSet<>(4, 03);
            LinkedHashSet lhs=new LinkedHashSet<>();




            set.add("einstein");
            set.add("newton");
            set.add("graham");
            set.add("murphy");
            set.add(null);
            set.add(10);
            set.add(20);
            set.add(30);
            set.add(39);
            set.add(11);
            set.add(12);
            set.add(16);
            set.add(45);
            set.add(7);
            set.add(85);
            set.add(89);
            set.add(26);
            //set.add(null) atmost one  null can be added 
              
            System.out.println(set);//[null, murphy, 20, 39, graham, 10, einstein, 30, newton]
            
            hs.add("aaaa");
            hs.add("bbb");
            hs.add("mmmmm");
            hs.add("jjjj");
            hs.add("lllll");
            hs.add("oooo");
        System.out.println(hs);//[lllll, oooo, aaaa, jjjj, mmmmm, bbb] regardless of insertion order printng the elements
            System.out.println(hs.size());//6
      

            lhs.add("lop");
            lhs.add("hiu");
            lhs.add("oop");
            lhs.add("nhy");
            System.out.println(lhs);//[lop, hiu, oop, nhy] insertion order is taken into consideration


           
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
    }
}
