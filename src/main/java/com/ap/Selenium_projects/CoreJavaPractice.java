package com.ap.Selenium_projects;

public class CoreJavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum=5;
		String Name="Abhilasha Pattaik";
		char letter='r';
		double decimal = 6.1;
		boolean myCard = true;
		
		System.out.println(myNum+ " is the value stored in myNum variable");
		System.out.println(Name);
		
		//ARRAYS
		//1st way
		int[] arr = new int[5];
		arr[0]=1;//Initialize array with value assignment
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//2nd way
		int[] arr1 = {1,2,3,4,5,6,7};
		System.out.println(arr1 [4]);
		
		//LOOP to print values from an array
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		//STRING ARRAY
	String[] name1=	{"Purushotam","Vinodrao","Deshmukh"};
	
	for(int i=0;i<name1.length;i++) 
	{
		
		System.out.println(name1 [i]);
	}
       //Enhanced For Loop
	for(int j:arr1)
	{
		System.out.println(j);
	}
	}

}
