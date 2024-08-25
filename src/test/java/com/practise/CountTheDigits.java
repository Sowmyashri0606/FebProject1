package com.practise;

public class CountTheDigits {
//	 int []a= {1,2,3,4,5,6,7,8,9,0};
//	 int count =a.length;
//	 System.out.println(count);
	
	public static void main(String[] args) {
		
	 int a=1234567890;
	 int i =0,j=0;
	 int count=0;
	while(a>0) {
		i=a%10;
		a=a/10;
		count++;
	}
	System.out.println(count);
	} 
}
