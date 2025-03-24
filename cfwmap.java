import java.util.*;


class MappingMethods{
    public void map(){

        try {
            Map<String, Integer> m=new HashMap<String , Integer>();

            
        m.put("snehith",100);
        m.put("goud", 102);
        m.put("nyalapatla", 103);
        m.put("karen", 104);
        m.put("billy", 100);
            System.out.println(m);//{{karen=104, billy=100, nyalapatla=103, goud=102, snehith=100}
            System.out.println(m.get("snehith"));//100
            System.out.println(m.remove("nyalapatla"));//103
            System.out.println(m);//{karen=104, billy=100, goud=102, snehith=100}
            System.out.println(m.remove("karen", 104));//true
            System.out.println(m);//{billy=100, goud=102, snehith=100}

            m.keySet();

            System.out.println(m);

            m.values();
            System.out.println(m);

            m.entrySet();
            System.out.println(m);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}


public class cfwmap {
    public static void main(String[] args) {

        MappingMethods mm=new MappingMethods();
        mm.map();


        LinkedHashMap<Integer , String> lm=new LinkedHashMap<Integer , String>();
        lm.put(1, "fox");
        lm.put(2, "girafffe");
        lm.put(3, "cow");
        System.out.println(lm);// insertion order is preserved

        
    }
    
}
