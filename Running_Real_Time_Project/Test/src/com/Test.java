package com;

import java.util.stream.Collectors;
public class Test {
	public static void main(String[] args) {
		int numArray[]={2,4,6,8,5,4}; 
		findMultification(numArray,40);
       
	}
	
	static void findMultification(int []array,int no){
		int mulNo[]=new int[array.length];
		for(int i=0;i<array.length;i++) 
		{
			if(array[i]<=no) {
			   for(int j=1;j<array.length;j++) 
			   {
				   if(array[i]*array[j]==no) {
					  System.out.println("multification of "+array[i]+"*"+array[j]+" = "+no);
				   }
			   }	
			}
		}
		
	}

}










