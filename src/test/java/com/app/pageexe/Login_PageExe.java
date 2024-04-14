package com.app.pageexe;

import com.app.locator.BookingConfirmation_Locator;
import com.app.locator.LoginPage_Locator;
import com.base.BaseClass;

public class Login_PageExe extends BookingConfirmation_Locator {
	
	public void username(String user) {
		BaseClass.input_Text(LoginPage_Locator.getUser(), user);
	}

	public void password(String pass) {
		BaseClass.input_Text(LoginPage_Locator.getPass(), pass);
	}
	
	public void loginButton() {
		BaseClass.click_value(LoginPage_Locator.getLogin());
	}
	
	
}
