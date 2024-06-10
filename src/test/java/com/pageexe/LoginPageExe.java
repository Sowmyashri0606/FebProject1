package com.pageexe;

import com.base.BaseClass;
import com.locator.LoginPage_Locator;

public class LoginPageExe extends LoginPage_Locator {
public static void login() {
	BaseClass.click_value(LoginPage_Locator.clickLogin());
}
public static void username() {
	BaseClass.input_text(LoginPage_Locator.getUserName(),prop_reuse("Email"));
}
public static void password() {
	BaseClass.input_text(LoginPage_Locator.getPassWord(), prop_reuse("Password"));
}
public static void loginClick() {
	BaseClass.click_value(LoginPage_Locator.getLogin());
}

}
