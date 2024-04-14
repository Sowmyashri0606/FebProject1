package com.app.pageexe;

import com.app.locator.BookHotel_Locator;
import com.base.BaseClass;

public class BookHotel_PageExe extends SelectHotel_PageExe {
	
	public void firstName() {
		BaseClass.input_Text(BookHotel_Locator.getName1(), excelRead(9,0));		
	}
	public void lastName() {
		BaseClass.input_Text(BookHotel_Locator.getName2(), excelRead(10,0));		
	}
	public void address() {
		BaseClass.input_Text(BookHotel_Locator.getAddress(), excelRead(11,0));		
	}
	public void ccNo() {
		BaseClass.input_Text(BookHotel_Locator.getCCNum(), excelRead(12,0));		
	}
	public void ccType() {		
		BaseClass.dropDown_Value(BookHotel_Locator.getCCType(), excelRead(13,0));
	}
	public void expMnt() {		
		BaseClass.dropDown_Value(BookHotel_Locator.getexpMnt(), excelRead(14,0));
	}
	public void expYr() {		
		BaseClass.dropDown_Value(BookHotel_Locator.getexpYr(), excelRead(15,0));
	}
	public void cvvNo() {
		BaseClass.input_Text(BookHotel_Locator.getCVV(), excelRead(16,0));		
	}
	public void bookNow() {
		BaseClass.click_value(BookHotel_Locator.clickBook());		
	}

}
