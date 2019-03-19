package FeatureHotel;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageBin.HotelPageFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefHJotel {
	private WebDriver driver;
	private HotelPageFactory hotelobj;
	
	
	@Given("^User is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\ChromePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hotelobj= new HotelPageFactory(driver);
		driver.get("file:///D:/Users/KAGRAWA1/Desktop/BDD/hotelbooking.html");
	  
	}

	@Then("^Check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
	   String title=driver.getTitle();
	   if(title.contentEquals("HotelBooking"))
		   System.out.println("Matched");
	   else
		   System.out.println("Not matched");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.close();
	}

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Pune");
		Thread.sleep(500);
		
		hotelobj.setPfstate("Maharashtra");
		Thread.sleep(500);
		
		hotelobj.setPfpersons(5);
		Thread.sleep(500);
		
		hotelobj.setPfcardHolderName("komal agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfdebit("123456789012");
		Thread.sleep(500);
		
		hotelobj.setPfcvv("123");
		Thread.sleep(500);
		
		hotelobj.setPfmonth("5");
		Thread.sleep(500);
		
		hotelobj.setPfyear("2020");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		hotelobj.setPfbutton();
		driver.close();
	}

	@Then("^navigate to welcome page$")
	public void navigate_to_welcome_page() throws Throwable {
		driver.navigate().to("file:///D:/Users/KAGRAWA1/Desktop/BDD/success.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}

	@When("^user leaves first Name blank and clicks the button$")
	public void user_leaves_first_Name_blank_and_clicks_the_button() throws Throwable {
		hotelobj.setPffname("");
		Thread.sleep(500);
		hotelobj.setPfbutton();
	}

	@Then("^display alert msg$")
	public void display_alert_msg() throws Throwable {
		String alertMeassage=driver.switchTo().alert().getText();
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		System.out.println(alertMeassage);
		driver.close();
		
	}

	@When("^user leaves last Name blank and clicks the button$")
	public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
		hotelobj.setPffname("komal");
		Thread.sleep(500);
		hotelobj.setPflname("");
		Thread.sleep(500);
		hotelobj.setPfbutton();
	}

	@When("^user enters all data$")
	public void user_enters_all_data() throws Throwable {
		hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Pune");
		Thread.sleep(500);
		
		hotelobj.setPfstate("Maharashtra");
		Thread.sleep(500);
		
		hotelobj.setPfpersons(5);
		Thread.sleep(500);
		
		hotelobj.setPfcardHolderName("komal agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfdebit("123456789012");
		Thread.sleep(500);
		
		hotelobj.setPfcvv("123");
		Thread.sleep(500);
		
		hotelobj.setPfmonth("5");
		Thread.sleep(500);
		
		hotelobj.setPfyear("2020");
		
	}

	@When("^user enters incorrect email format and clicks the button$")
	public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
		hotelobj.setPfemail("komal@.com");
		Thread.sleep(500);
		hotelobj.setPfbutton();
	}

	@When("^user leaves MobileNo blank and clicks the button$")
	public void user_leaves_MobileNo_blank_and_clicks_the_button() throws Throwable {
		hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("");
		Thread.sleep(500);
		
		hotelobj.setPfbutton();
	}

	@When("^user enters incorrect mobileNo format and clicks the button$")
	public void user_enters_incorrect_mobileNo_format_and_clicks_the_button(DataTable arg1) throws Throwable {
		hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
	   List<String> objList=arg1.asList(String.class);
		hotelobj.setPfbutton();
		
		for(int i=0; i<objList.size(); i++) {
			if(Pattern.matches("^[7-9]{1}[0-9]{9}$", objList.get(i))) {
			System.out.println("Matched" + objList.get(i));
			}
			else {
				System.out.println("NOT Matched" + objList.get(i));
			}
		}
	   
	}

	@When("^user doesnot select city$")
	public void user_doesnot_select_city() throws Throwable {
Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Select city");
		Thread.sleep(500);
		
		hotelobj.setPfbutton();
	}

	@When("^user doesnot select state$")
	public void user_doesnot_select_state() throws Throwable {
Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Pune");
		Thread.sleep(500);
		
		hotelobj.setPfstate("Select state");
		Thread.sleep(500);
		
		hotelobj.setPfbutton();
		
	}

	@When("^user enters (\\d+)$")
	public void user_enters(int arg1) throws Throwable {
	    hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Pune");
		Thread.sleep(500);
		
		hotelobj.setPfstate("Maharashtra");
		Thread.sleep(500);
		
		hotelobj.setPfpersons(arg1);
		Thread.sleep(500);
	}

	@Then("^allocate rooms such that (\\d+) room for minimum (\\d+) guests$")
	public void allocate_rooms_such_that_room_for_minimum_guests(int arg1, int arg2) throws Throwable {
		if(arg2 <=3) {
	    	System.out.println("1 room");
	    	assertEquals(1, arg1);
	    }
	    else if(arg2 <=6){
	    	System.out.println(" 2 rooms");
	    	assertEquals(2, arg1); 	
	    }	 
	    else if(arg2 <=9){
	    	System.out.println("3 rooms");
	    	assertEquals(3, arg1); 	
	    }
	
	}
	
	@When("^user leaves CardHolderName blank and clicks the button$")
	public void user_leaves_CardHolderName_blank_and_clicks_the_button() throws Throwable {
		hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Pune");
		Thread.sleep(500);
		
		hotelobj.setPfstate("Maharashtra");
		Thread.sleep(500);
		
		hotelobj.setPfpersons(5);
		Thread.sleep(500);
		
		hotelobj.setPfcardHolderName("");
		Thread.sleep(500);
		
		hotelobj.setPfbutton();
	}

	@When("^user leaves DebitCardNo blank and clicks the button$")
	public void user_leaves_DebitCardNo_blank_and_clicks_the_button() throws Throwable {
		hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Pune");
		Thread.sleep(500);
		
		hotelobj.setPfstate("Maharashtra");
		Thread.sleep(500);
		
		hotelobj.setPfpersons(5);
		Thread.sleep(500);
		
		hotelobj.setPfcardHolderName("Komal agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfdebit("");
		Thread.sleep(500);
		
		hotelobj.setPfbutton();
		
	}
	
	@When("^user leaves cvv blank and clicks the button$")
	public void user_leaves_cvv_blank_and_clicks_the_button() throws Throwable {
		hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Pune");
		Thread.sleep(500);
		
		hotelobj.setPfstate("Maharashtra");
		Thread.sleep(500);
		
		hotelobj.setPfpersons(5);
		Thread.sleep(500);
		
		hotelobj.setPfcardHolderName("komal agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfdebit("123456789012");
		Thread.sleep(500);
		
		hotelobj.setPfcvv("");
		Thread.sleep(500);
		hotelobj.setPfbutton();
		
		
		
		
	}
	@When("^user leaves expirationMonth blank and clicks the button$")
	public void user_leaves_expirationMonth_blank_and_clicks_the_button() throws Throwable {
		hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Pune");
		Thread.sleep(500);
		
		hotelobj.setPfstate("Maharashtra");
		Thread.sleep(500);
		
		hotelobj.setPfpersons(5);
		Thread.sleep(500);
		
		hotelobj.setPfcardHolderName("komal agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfdebit("123456789012");
		Thread.sleep(500);
		
		hotelobj.setPfcvv("123");
		Thread.sleep(500);
		
		hotelobj.setPfmonth("");
		Thread.sleep(500);
		
		hotelobj.setPfbutton();
	}

	@When("^user leaves expirationYr blank and clicks the button$")
	public void user_leaves_expirationYr_blank_and_clicks_the_button() throws Throwable {
		hotelobj.setPffname("Komal");
		Thread.sleep(500);
		
		hotelobj.setPflname("Agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfemail("komal@gmail.com");
		Thread.sleep(500);
		
		hotelobj.setPfmobile("7894561230");
		Thread.sleep(500);
		
		hotelobj.setPfcity("Pune");
		Thread.sleep(500);
		
		hotelobj.setPfstate("Maharashtra");
		Thread.sleep(500);
		
		hotelobj.setPfpersons(5);
		Thread.sleep(500);
		
		hotelobj.setPfcardHolderName("komal agrawal");
		Thread.sleep(500);
		
		hotelobj.setPfdebit("123456789012");
		Thread.sleep(500);
		
		hotelobj.setPfcvv("123");
		Thread.sleep(500);
		
		hotelobj.setPfmonth("5");
		Thread.sleep(500);
		
		hotelobj.setPfyear("");
		hotelobj.setPfbutton();
	}

}
