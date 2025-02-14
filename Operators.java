public class Operators{
	
	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=200;
		int d=15;
		int e=12;
		boolean t=true;
		boolean f=false;

		int m1=6;
		int m2=8;
		
		System.out.println("ARITHEMATIC OPERATOR");
		System.out.println("a+b"+ " :"+ (a+b));
		System.out.println("a-b"+ " :"+ (a-b));
		System.out.println("a*b"+ " :"+ (a*b));
		System.out.println("a/b"+ " :"+ (a/b));


		//Relatinal operators

		System.out.println("RELATIONAL OPERATOR");

		System.out.println("a==b"+":"+(a==b));
		System.out.println("a!=b"+":"+(a!=b));
		System.out.println("a>b"+":"+(a>b));
		System.out.println("a<b"+":"+(a<b));
		System.out.println("a>=b"+":"+(a<=b));
		System.out.println("a<=b"+":"+(a<=b));
	

		//Logiacal operator
		System.out.println("LOGICAL OPERATOR");
		if(a>b&&a<=c)		
			System.out.println(true);
		else
		System.out.println(false);

		//.#2 
		if(a>b||a<=c)		
			System.out.println(true);
		else
		System.out.println(false);

		//.#3
		System.out.println("t&&f"+ ":" +(t&&f));
		System.out.println("t||f"+ ":" +(t||f));
		System.out.println("!t"+ ":" +(!t));
		System.out.println("!f"+ ":" +(!f));


		//Assignment Operator
		System.out.println("ASSIGNMENT OPERATOR");
		System.out.println("a+=21"+":"+(a+=21));
		System.out.println("a-=21"+":"+(a-=21));
		System.out.println("c*=21"+":"+(c*=21));
		System.out.println("b/=20"+":"+(b/=20));
		System.out.println("c%=2"+":"+(c%=2));


		//unary operator
		System.out.println("UNARY OPERATOR");
		System.out.println("a++"+":"+(a++));
		System.out.println("b--"+":"+(b--));
		System.out.println("++c"+":"+(++c));
		System.out.println("--a"+":"+(--a));

		//Ternary operator
		System.out.println("TERNARY OPERATOR");
		System.out.println(d<e?d:e);


		//Bitwise Operator
		System.out.println("BITWISE OPERATOR");
		System.out.println("m1 & m2: " + (m1 & m2)); 
        System.out.println("m1 | m2: " + (m1 | m2)); 
        System.out.println("~m: " + (~m1)); 
        System.out.println("m1 << 2 " + (m1 << 2)); 
        System.out.println("m2 >> 1: " + (m2 >> 1)); 


		//Instance of
		System.out.println("Instanceof Operators");
		Operators op=new Operators();
		System.out.println(op instanceof Operators);







	}

} 