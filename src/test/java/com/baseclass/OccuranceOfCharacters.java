package com.baseclass;

import java.util.Arrays;

public class OccuranceOfCharacters {

	public static void main(String[] args) {

String j = "abc";
String s = "ac";
int count = 0;
char []c = s.toCharArray();
char []c1 = j.toCharArray();
for(int i=0;i<c.length;i++){
for(int k=0;k<c1.length;k++){
if(c[i]==c1[k]){
	count = count+1;

}
}
}
System.out.println(count);
}
}