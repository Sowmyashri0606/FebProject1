package com.javaset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetPrac {
public static void main(String[] args) {
		
List<Integer> li = new ArrayList<Integer>();
li.add(20);
li.add(30);
li.add(20);
li.add(50);
Set<Integer> s = new TreeSet<Integer>(li);
System.out.println(s);


}
}
// 
//
//Input = a1b2c3
//aabbbcccc
//int a = [1,2,3,4]
//int b =[1,2,5,6]