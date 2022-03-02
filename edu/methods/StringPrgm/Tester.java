package edu.methods.StringPrgm;

import edu.methods.StringPrgm.Multimethods;

public class Tester {
	public static void main(String []args){
		
		String result = Multimethods.programName;
		System.out.println(result);
		
		char chr = result.charAt(14);
		System.out.println(chr);
		
		int index =result.indexOf('m');
		System.out.println(index);
		
		boolean bl = result.isEmpty();
		System.out.println(bl);
		
		int length = result.length();
		System.out.println(length);
		
		String st = result.replace('o' , 'm');
		System.out.println(st);

		
		String[] spit = result.split(" ");
		System.out.println(spit[0]);
		System.out.println(spit[1]);
		

		String[] slpt = result.split("o");
		System.out.println(slpt[0]);
		System.out.println(slpt[1]);
		System.out.println(slpt[2]);
		
		 
		
		char[] arr = result.toCharArray();
		System.out.println(arr[1]);
		
		String upr = result.toUpperCase();
		System.out.println(upr);
		
		String lwr = result.toLowerCase();
		System.out.println(lwr);
		
	}
	
	

}
