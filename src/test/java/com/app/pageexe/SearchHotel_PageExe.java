package com.app.pageexe;

import com.app.locator.SearchHotel_Locator;

import com.base.BaseClass;

public class SearchHotel_PageExe extends Login_PageExe{
	
	public void location(String location) {
		BaseClass.dropDown_Value(SearchHotel_Locator.getLocation(), location);
	}
	public void hotel(String hotel) {
		BaseClass.dropDown_Value(SearchHotel_Locator.getHotel(), hotel);
	}
	public void room(String room) {
		BaseClass.dropDown_Value(SearchHotel_Locator.getRoom(), room);
	}
	public void noOfRoom(String noOfRoom) {		
		BaseClass.dropDown_Value(SearchHotel_Locator.getNoOfRoom(), noOfRoom);
	}
	public void checkIn(String checkIn) {
		BaseClass.clear_value(SearchHotel_Locator.getCheckinDate());
		BaseClass.input_Text(SearchHotel_Locator.getCheckinDate(),checkIn);
	}
	public void checkOut(String checkOut) {
		BaseClass.clear_value(SearchHotel_Locator.getCheckoutDate());
		BaseClass.input_Text(SearchHotel_Locator.getCheckoutDate(), checkOut);
	}
	public void adults(String adults) {		
		BaseClass.dropDown_Value(SearchHotel_Locator.getAdults(), adults);
	}
	public void children(String children) {		
		BaseClass.dropDown_Value(SearchHotel_Locator.getChildren(), children);
	}
	public void search() {
		BaseClass.click_value(SearchHotel_Locator.clickSearch());		
	}
		
}
