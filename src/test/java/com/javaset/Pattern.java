package com.javaset;

import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {
int a =5;
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	print();
}
public static void print() {
	int b= 6;
	for (int i=1;i<=b;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("$ ");
		}
		System.out.println();
	}
}
}
