package com.ap.Selenium_projects;

public class CpreJavaPractice3 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
      //STRNGS
		
		String s ="Purushottam is a bad boy";
		//String Array
		String[] splittedString=s.split(" ");
		
		for (int i=0;i<splittedString.length;i++)
		{
		 System.out.println(splittedString[i]);
		}
//Print String in reverse order
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
