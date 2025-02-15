import java.io.*;
import java.util.Scanner;
import java.io.Console;


public class FlowControl {

    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
           
    // input using console
    Console ch=System.console();
     System.out.println("Enter input");
    String l=ch.readLine();
    System.out.println("The input you have entered is:"+l);
 
    //input using command line arguement
    for(int u=0;u<=args.length;u++){
        System.out.println(args[u]);         //javac FlowControl.java    //java FlowControl hello hi   //hello hi

    }
    


        
        //condition statement


        //switch using scanner class

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an input");

       String week= sc.nextLine();
        switch (week) {
            case "monday":System.out.println("Its first day in a week");                
                break;
            case "tuesday":System.out.println("Its second day in a week");                
                break;
            case "wednesday":System.out.println("Its third day in a week");                
                break;
            case "thursday":System.out.println("Its fourth day in a week");                
                break;
            case "friday":System.out.println("Its fifth day in a week");                
                break;
                case "saturday":System.out.println("its finally weekened");                
                break;


            default:System.out.println("Wrong input");
                break;
        }
        if(a/2==0)
        System.out.println("Even");
        else
        System.out.println("no");
        
        //#2 finding largest number among three digits
        if(a>b&&a>c)
        {
            System.out.println("Largest number"+a);
        }
        
        else if(b>a&&b>c){
            System.out.println("Largest number"+b);

        }
        else
        {
            System.out.println("Largest number"+c);
        }


        

             
        
        
        
        //flow controls

        for(int i=1; i<=25;i++)
        {
            if(i%2==0)
            continue;
            System.out.println(i);
        }


        int k=0;
        while(k<=5)
        {
        
                System.out.println(k);
            k++;            
            
        }

        int d=10;

        do{
            System.out.println("Hello, How are you?");

            
        }while (d>10);
         {       
            System.out.println(d/5);
            
        }






    }
}