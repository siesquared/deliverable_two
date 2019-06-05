package unical;


import java.util.Scanner;  
public class Cal {
	
static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		System.out.println("Enter first string: ");
		String  s1 = input.next();
		
		System.out.println("Enter second string: ");
		String  s2 = input.next();
		
		for (int i = 0; i < s1.length(); i++) {
			System.out.println( s1.charAt(i) +" "+ (int) s1.codePointAt(i));
			
		}
		for (int i = 0; i < s2.length(); i++) {
			System.out.println(  s2.charAt(i) + " " + (int) s2.codePointAt(i));
			
		}
        int i = 0; 
        
       // int s3 = (int) s1.codePointAt(i) + (int) s2.codePointAt(i);
        
        
       
        
		System.out.println("Difference (as absolute value):" +  Math.abs((int) s1.codePointAt(i) + (int) s2.codePointAt(i)) );
		
		
		


	}


	
	}


