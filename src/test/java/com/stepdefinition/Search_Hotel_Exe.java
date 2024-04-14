package com.stepdefinition;

import com.app.pageexe.SearchHotel_PageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Hotel_Exe extends SearchHotel_PageExe {
	
	@Given("Load the search hotel page")
	public void load_the_search_hotel_page() {
		System.out.println("Entering the search hotel page");
	}
	@When("Enter the Location {string}")
	public void enter_the_location(String location) {
		location(location);
		System.out.println(location);
	}
	@When("Enter the Hotel {string}")
	public void enter_the_hotel(String hotel) {
	   hotel(hotel);
	   System.out.println(hotel);
	}
	@When("Enter the Room {string}")
	public void enter_the_room(String room) {
	   room(room);
	   System.out.println(room);
	}
	@When("Enter the No of room {string}")
	public void enter_the_no_of_room(String noOfRoom) {
	   noOfRoom(noOfRoom);
	   System.out.println(noOfRoom);
	}
	@When("Enter the CheckIn {string}")
	public void enter_the_check_in(String checkIn) {
	  checkIn(checkIn);
	  System.out.println(checkIn);
	}
	@When("Enter the CheckOut {string}")
	public void enter_the_check_out(String checkOut) {
		checkOut(checkOut);
		System.out.println(checkOut);
	}
	@When("Enter the Adults {string}")
	public void enter_the_adults(String adults) {
		adults(adults);
		System.out.println(adults);
	}
	@When("Enter the Children {string}")
	public void enter_the_children(String children) {
		children(children);
		System.out.println(children);
	}
	@When("click the search button")
	public void click_the_search_button() {
	   System.out.println("search button");
	}
	@Then("Validate the search hotel page")
	public void validate_the_search_hotel_page() {
		System.out.println("Validate the search hotel page");
	}

}
