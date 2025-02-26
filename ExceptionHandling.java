class Excep{
    void method() throws NullPointerException{
        String s=null;
        System.out.println(s.length());
    }

}


public class ExceptionHandling {
    
    public static void main(String[] args) {

        Excep e=new Excep();

        try {
            e.method();
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException caught: " + npe.getMessage());
        }
        
       

        int m=10;
        int n=0;
    
        int[] a=new int[3];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        try {
            System.out.println(a[5]);
           

        } 
        
        catch (ArrayIndexOutOfBoundsException array) {
            // TODO: handle exception

            System.out.println("Hi");

        }

        catch(ArithmeticException arithmetic)
        {
            System.out.println("Exception handled");
        }

        catch(Exception exception)

        {
        System.out.println("nothing has been caught till here");
        }

        finally{
            System.out.println("Program terminated");
        }






    


    }
}
