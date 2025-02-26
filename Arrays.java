public class Arrays {
    public static void main(String[] args) {
        String[] s={"nimmy", "kinnu","chinnu","nani"};
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    
     char[] c;
     c=new char[5];
     c[0]='a';
     c[1]='b';
     c[2]='c';
     c[3]='d';
     System.out.println(c[2]);

     int[] n=new int[5];
     n[0]=1;
     n[1]=2;
     n[2]=3;
        for(int j=0;j<n.length;j++){
            System.out.println(n[j]);
        }
    



        int[][] m=new int[2][2];
        m[0][0]=11;
        m[0][1]=21;
        m[1][0]=31;
        m[1][1]=41;
        
        for(int p=0;p<m.length;p++){
            for(int q=0;q<=p;q++){
                System.out.println(m[p][q]);
            }
           
        }

    }
    
}
