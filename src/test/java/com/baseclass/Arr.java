package com.baseclass;

import java.util.Scanner;
//Given a sorted array of distinct integers and a target value, return the index if the target is found. 
//If not, return the index where it would be if it were inserted in order.
		 
public class Arr { 
public static int a[] = {1,3,5,6};
public static int target =5 ;//2,7
public static int findIndex(int [] a, int target) {
		int minIndex = 0;
		for(int i =0;i<a.length;i++) {
			if (a[i]==target)
				return i;
			else if(a[i] < target)
				minIndex = i;
			else
				break;
		}
	return minIndex+1;
	}
public static void main(String[] args) {	
	Arr code = new Arr();
	System.out.println(code.findIndex(a, target));
}

}

