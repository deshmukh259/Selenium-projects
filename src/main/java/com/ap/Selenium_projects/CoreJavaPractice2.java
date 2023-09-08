package com.ap.Selenium_projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr2= {1,2,3,4,5,6,7,8,9,11,122};
 //print all even number
 /*for(int i=0;i<arr2.length;i++)
 {
	 if(arr2[i]%2==0)
	 {
		 System.out.println(arr2[i]+ " is a even number");
	 }
	 /*else
	 {
		 System.out.println(arr2[i]+ " is an odd number");
	 }
 }*/
 
 //check if array has a multiple of 2-break keyword
 
  for(int i=0;i<arr2.length;i++)
  {
	
		  
	 if(arr2[i]%2==0)
	  {
		 
	  System.out.println("multiple of 2 exists at "+i);
	  break;
	  }
	  
	  
	  
  }
  //ARRAYLISTS
        ArrayList<String> a= new ArrayList<String>();
        a.add("Purushottam");
        a.add("Deshmukh");
        
        System.out.println(a.get(0));
        a.remove(0);
        System.out.println(a.get(0));
        
           ArrayList<Integer> b=new ArrayList<Integer>();
           b.add(1);
           b.add(2);
           b.add(3);
           b.add(5);
           b.add(7);
           for (int j:b)
           {
        	   System.out.println(j);
        	  
           }
          //item present in arraylist
          System.out.println( a.contains("Deshmukh"));

          //convert array to arraylist 
        List<int[]>  ArrayListarr2= Arrays.asList(arr2);
;	}

}
