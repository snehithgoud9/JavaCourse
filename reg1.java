

import java.util.regex.*; 

class reg1 { 

	public  boolean isValidUsername(String name) 
	{ 
    		
		String regex = "^[A-Za-z]\\w{5,29}$"; 

	
		Pattern p = Pattern.compile(regex); 
		if (name == null) { 
			return false; 
		} 

		
		Matcher m = p.matcher(name); 

		return m.matches(); 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 

        reg1 r=new reg1();
       System.out.println(r.isValidUsername("Snehith22222"));// true ,alphabets and numbers are allowed as per the condition "^[A-Za-z]\\w{5,29}$"; 
      

       // System.out.println(r.isValidUsername("Snehith@#22222"));// false alphabets and numbers are only allowed as per the condition "^[A-Za-z]\\w{5,29}$"; 

		 
	} 
} 
