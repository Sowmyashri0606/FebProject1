package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void test1() {
		String s  ="Aiite";
		Assert.assertEquals(s, "Aiite");
		System.out.println("Condtion is true");
	
	}
	@Test
	public void test2() {
		String s = "Sowmya";
		Assert.assertTrue(s.contains("f"));
		System.out.println("condition is false");
	}
	
}