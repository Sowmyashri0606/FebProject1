package com.app.pageexe;

import com.app.locator.SelectHotel_Locator;
import com.base.BaseClass;

public class SelectHotel_PageExe extends SearchHotel_PageExe {
	public void radioBtn() {
		BaseClass.click_value(SelectHotel_Locator.clickRadiobtn());		
	}
	public void continueBtn() {
		BaseClass.click_value(SelectHotel_Locator.clickContinue());		
	}
	
}
