package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {

		@Test
		public void test1() {
			String s  ="Aiite";
			Assert.assertEquals(s, "Aiite");
			System.out.println("Condtion is true");		
		}		
		@Test
		public void test2() {
			String s ="sowmya";
			Assert.assertFalse(s.contains("p"));
		    System.out.println("condition passes");
		}
}
