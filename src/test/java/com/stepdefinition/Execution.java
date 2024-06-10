package com.stepdefinition;

import com.pageexe.Page_Execution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Execution extends Page_Execution{

	@Given("Launch the url")
	public void launch_the_url() {
		driver.get("https://www.cheapair.com/");
	    System.out.println("url");
	}
	@And("Click one way")
	public void click_one_way() {
		oneWay();
		 System.out.println("url");
	}
	@When("Enter the from location")
	public void enter_the_from_location() {
		 System.out.println("url");
	}
	@And("Enter the to location")
	public void enter_the_to_location() {
		 System.out.println("url");
	}
	@Then("Click traveller economy")
	public void click_traveller_economy() {
		 System.out.println("url");
	}

}
