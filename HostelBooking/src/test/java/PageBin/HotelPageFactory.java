package PageBin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class HotelPageFactory {
WebDriver driver;

	// we can also use xpath  and css as same as name in findBy
	@FindBy(id="txtFirstName")
	@CacheLookup
	WebElement pffname;
	
	@FindBy(how=How.ID, using="btnPayment")
	@CacheLookup
	WebElement pfbutton;
	
	@FindBy(name="txtLN")
	@CacheLookup
	WebElement pflname;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement pfemail;
	
	@FindBy(css="input[pattern='[789][0-9]{9}']")
	@CacheLookup
	WebElement pfmobile;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement pfcity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement pfstate;
	
	@FindBy(name="persons")
	@CacheLookup
	int pfpersons;
	
	@FindBy(id="txtCardholderName")
	@CacheLookup
	WebElement pfcardHolderName;
	
	@FindBy(name="debit")
	@CacheLookup
	WebElement pfdebit;
	
	@FindBy(name="cvv")
	@CacheLookup
	WebElement pfcvv;
	
	@FindBy(name="month")
	@CacheLookup
	WebElement pfmonth;
	
	@FindBy(name="year")
	@CacheLookup
	WebElement pfyear;
	
	

	public HotelPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getPffname() {
		return pffname;
	}

	public void setPffname(String sfname) {
		pffname.sendKeys(sfname);
	}

	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
		pfbutton.click();
	}

	public WebElement getPflname() {
		return pflname;
	}

	public void setPflname(String slname) {
		pflname.sendKeys(slname);
	}

	public WebElement getPfemail() {
		return pfemail;
	}

	public void setPfemail(String semail) {
		pfemail.sendKeys(semail);
	}

	public WebElement getPfmobile() {
		return pfmobile;
	}

	public void setPfmobile(String smobile) {
		pfmobile.sendKeys(smobile);
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public void setPfcity(String scity) {
		Select drpCity=new Select(pfcity);
		drpCity.selectByVisibleText(scity);
	}

	public WebElement getPfstate() {
		return pfstate;
	}

	public void setPfstate(String sstate) {
		Select drpState=new Select(pfstate);
		drpState.selectByVisibleText(sstate);
	}

	public int getPfpersons() {
		return pfpersons;
	}

	public void setPfpersons(int arg1) {
		pfpersons=arg1;
	}

	public WebElement getPfcardHolderName() {
		return pfcardHolderName;
	}

	public void setPfcardHolderName(String scardHolderName) {
		pfcardHolderName.sendKeys(scardHolderName);
	}

	public WebElement getPfdebit() {
		return pfdebit;
	}

	public void setPfdebit(String sdebit) {
		pfdebit.sendKeys(sdebit);
	}

	public WebElement getPfcvv() {
		return pfcvv;
	}

	public void setPfcvv(String scvv) {
		pfcvv.sendKeys(scvv);
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public void setPfmonth(String smonth) {
		pfmonth.sendKeys(smonth);
	}

	public WebElement getPfyear() {
		return pfyear;
	}

	public void setPfyear(String syear) {
		pfyear.sendKeys(syear);
	}
	
	
	
}
