package com.stepdefinition;

import com.app.pageexe.Login_PageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_Exe extends  Login_PageExe{
	
	@Given("Login to the application")
	public void login_to_the_application() {
		 browser("https://adactinhotelapp.com/");   
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		username(user);
		   System.out.println(user);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		password(pass);
	    System.out.println(pass);
	}
	@When("Enter the login button")
	public void enter_the_login_button() {
		loginButton();
		System.out.println("Login button");
	}
	@Then("Validate the Homepage")
	public void validate_the_homepage() {
		System.out.println("Homepage");
	}
}
