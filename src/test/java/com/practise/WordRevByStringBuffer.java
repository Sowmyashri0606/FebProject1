package com.practise;

public class WordRevByStringBuffer {
	public static void main(String[] args) {	
	StringBuffer s1 = new StringBuffer("Hai Everyone welcome");
	String s2 = new String(s1);
	String[] words = s2.split(" ");

	s1.delete(0, s1.length());

	for (int i = words.length - 1; i >= 0; i--) {
		s1.append(words[i] + " ");
	}
	System.out.println(s1);

}
}
