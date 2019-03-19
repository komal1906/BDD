package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageFactory {
WebDriver driver;
	
	@FindBy(how=How.NAME, using="userName")
	@CacheLookup
	WebElement pfuname;

	@FindBy(xpath=".//*[@id='mainCnt']/div/div[1]/form/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement pfbutton;
	
	@FindBy(how=How.NAME, using="userPwd")
	@CacheLookup
	WebElement pfpwd;

	public WebElement getPfuname() {
		return pfuname;
	}

	public void setPfuname(String suname) {
		pfuname.sendKeys(suname);
	}

	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
		pfbutton.click();
	}

	public WebElement getPfpwd() {
		return pfpwd;
	}

	public void setPfpwd(String spwd) {
		pfpwd.sendKeys(spwd);
	}

	public HotelBookingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
