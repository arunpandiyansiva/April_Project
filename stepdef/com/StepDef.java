package com.stepdef.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Arun.Base_Class;
import com.pom.com.Login;
import com.runner.com.Runner;

import cucumber.api.java.en.*;

public class StepDef extends Base_Class{
	
	
public static WebDriver driver=Runner.driver;

 Login lp =new Login(driver); 
 
	

@Given("^launch the application$")
public void launch_the_application() throws Throwable {
	getUrl("http://adactinhotelapp.com/");

}

@When("^user enter the username in the user field$")
public void user_enter_the_username_in_the_user_field() throws Throwable {
	inputvalues(lp.getEmail(),"a1r4u3ns");

}

@When("^user enter the password in the user field$")
public void user_enter_the_password_in_the_user_field() throws Throwable {
	inputvalues(lp.getPassword(), "Arun@1988");

}

@Then("^user clicks the login button$")
public void user_clicks_the_login_button() throws Throwable {
	clickOnElement(lp.getClick());

}

@Given("^after launch application and then searching Hotel$")
public void after_launch_application_and_then_searching_Hotel() throws Throwable {
implicitwait();
}



@When("^user select the loaction in the loaction field$")
public void user_select_the_loaction_in_the_loaction_field() throws Throwable {
    clickOnElement(lp.getLoca());
   isSelected(lp.getLoca());
    dropDownSelection(lp.getLoca(), "index","5");
    clickOnElement(lp.getLoca());
}

@When("^user select the hotels in the hotel field$")
public void user_select_the_hotels_in_the_hotel_field() throws Throwable {
	clickOnElement(lp.getHotel());
	isSelected(lp.getHotel());
	dropDownSelection(lp.getHotel(), "index", "3");
   clickOnElement(lp.getHotel());
}

@When("^user select the room type in the room type field$")
public void user_select_the_room_type_in_the_room_type_field() throws Throwable {
  clickOnElement(lp.getRoomt());
  isSelected(lp.getRoomt());
	dropDownSelection(lp.getRoomt(),"index", "3");
	clickOnElement(lp.getRoomt());
	
}

@When("^user select the number of rooms in the rooms field$")
public void user_select_the_number_of_rooms_in_the_rooms_field() throws Throwable {
   clickOnElement(lp.getRoomno());
   isSelected(lp.getRoomno());
   dropDownSelection(lp.getRoomno(), "index", "3");
   clickOnElement(lp.getRoomno());
}

@When("^user enter the checkin date in checkin field$")
public void user_enter_the_checkin_date_in_checkin_field() throws Throwable {
    clickOnElement(lp.getDatein());
	
}

@When("^user enter the checkout date in checkout field$")
public void user_enter_the_checkout_date_in_checkout_field() throws Throwable {
	clickOnElement(lp.getDateout());

}

@When("^user select the Adults per Room options in Adults per Room field$")
public void user_select_the_Adults_per_Room_options_in_Adults_per_Room_field() throws Throwable {
	clickOnElement(lp.getAdultr());
	isSelected(lp.getAdultr());
    dropDownSelection(lp.getAdultr(), "index", "2");	
    clickOnElement(lp.getAdultr());
}

@When("^user select the Children per Room options in the Children per Room field$")
public void user_select_the_Children_per_Room_options_in_the_Children_per_Room_field() throws Throwable {
   clickOnElement(lp.getChlidr());
   isSelected(lp.getChlidr());
   dropDownSelection(lp.getChlidr(),"index","1" );
}

@Then("^user clicks the search button$")
public void user_clicks_the_search_button() throws Throwable {
clickOnElement(lp.getSearch());
}

@Given("^user select the hotel$")
public void user_select_the_hotel() throws Throwable {
	

}

@When("^user click the select option$")
public void user_click_the_select_option() throws Throwable {
	clickOnElement(lp.getButton());
}

@Then("^user clicks the countine button$")
public void user_clicks_the_countine_button() throws Throwable {
clickOnElement(lp.getCon());
}

@Given("^User enter the details in book a hotel$")
public void user_enter_the_details_in_book_a_hotel() throws Throwable {

}

@When("^User enter the first name in first name field$")
public void user_enter_the_first_name_in_first_name_field() throws Throwable {
inputvalues(lp.getFirst(), "Arunpandiyan");
}

@When("^user enter last name in last name field$")
public void user_enter_last_name_in_last_name_field() throws Throwable {
	inputvalues(lp.getLast(), "S");

}

@When("^user enter biling address in biling address field$")
public void user_enter_biling_address_in_biling_address_field() throws Throwable {
	inputvalues(lp.getAdd(), "No.23 EVP park Avenue London");

}

@When("^user enter credit card number in credit card field$")
public void user_enter_credit_card_number_in_credit_card_field() throws Throwable {
	inputvalues(lp.getNum(), "1234567891234567");

}

@When("^user select credit card type in the credit card type field$")
public void user_select_credit_card_type_in_the_credit_card_type_field() throws Throwable {
	clickOnElement(lp.getType());
	isSelected(lp.getType());
    dropDownSelection(lp.getType(), "index", "1");
    clickOnElement(lp.getType());
}

@When("^user select Expiry date month in the Expiry date field$")
public void user_select_Expiry_date_month_in_the_Expiry_date_field() throws Throwable {
	clickOnElement(lp.getMonth());
	isSelected(lp.getMonth());
	dropDownSelection(lp.getMonth(), "index", "4");
	clickOnElement(lp.getMonth());  
}

@When("^user select Expriy year in the year field$")
public void user_select_Expriy_year_in_the_year_field() throws Throwable {
	clickOnElement(lp.getYear());
	isSelected(lp.getYear());
	dropDownSelection(lp.getYear(), "index", "11");
	clickOnElement(lp.getYear());
    
}

@When("^user enter the cvv number in the cvv field$")
public void user_enter_the_cvv_number_in_the_cvv_field() throws Throwable {
  inputvalues(lp.getCvv(), "916");
}

@Then("^user clicks the book Now button$")
public void user_clicks_the_book_Now_button() throws Throwable {
clickOnElement(lp.getBook());
implicitwait();
}

@Given("^booking confirmation for user$")
public void booking_confirmation_for_user() throws Throwable {
	implicitwait();
	robot(lp.getBook());
  
}

@Then("^User clicks the My ltinerary$")
public void user_clicks_the_My_ltinerary() throws Throwable {
   clickOnElement(lp.getMyl());
}

@Given("^user booked hotel and room$")
public void user_booked_hotel_and_room() throws Throwable {
   
}



}
