package com.app.pageexe;

import com.app.locator.BookingConfirmation_Locator;
import com.base.BaseClass;

public class BookingConfirmaation_PageExe extends BookHotel_PageExe{
	public void orderNo() {
		wait1();
		BaseClass.get_values(BookingConfirmation_Locator.getOrderNo(),"value");		
	}
}
