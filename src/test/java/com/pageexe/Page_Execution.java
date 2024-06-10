package com.pageexe;

import com.base.BaseClass;

import com.locator.Page_Locator;

public class Page_Execution extends Page_Locator{
	
	public static void oneWay() {
		BaseClass.click_value(Page_Locator.oneway());
	}
	
	public void enter_From(String user) {
		BaseClass.input_Text(Page_Locator.enter_from(), user);
	}
}
