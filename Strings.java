public class Strings {
    public static void main(String[] args) {

        String str="snehithgoud";
        String str1="snehith";
        String str2="";
        String  str3="                         rudra";
            System.out.println(str.charAt(3)); //h
            System.out.println(str.compareTo(str1)); //4
            System.out.println(str.concat(str1));//snehithgoudsnehith
            System.out.println(str.contains(str1));//true
            System.out.println(str.contentEquals(str1));//false
            System.out.println(str.endsWith("ud"));//true
            System.out.println(str.equals(str1));//false
            System.out.println(str.indexOf("t")); //5
            System.out.println(str2.isEmpty());  //true
            System.out.println(str1.replace("e", "f")); //snfhith
            System.out.println(str1.toUpperCase()); //SNEHITH
            System.out.println(str.substring(2, 06)); //ehit
            System.out.println(str3);     //before trim with space//                 rudra
            System.out.println(str3.trim());// after trim with out space //rudra

            //StringBuilder

            StringBuilder sbld=new StringBuilder("welcoometotheworld");
            System.out.println(sbld.append("champ"));// welcoometotheworldchamp
            System.out.println(sbld.insert(8, "again")); //welcoomeagaintotheworldchamp
            System.out.println(sbld.replace(2, 4, "hi")); //wehioomeagaintotheworldchamp
            System.out.println(sbld.delete(2, 04));//weoomeagaintotheworldchamp
            System.out.println(sbld.reverse()); //pmahcdlrowehtotniagaemooew
            System.out.println(sbld.capacity()); //34
            System.out.println(sbld.reverse());//weoomeagaintotheworldchamp
            System.out.println(sbld.deleteCharAt(2));//weomeagaintotheworldchamp
           












    }
    
}
