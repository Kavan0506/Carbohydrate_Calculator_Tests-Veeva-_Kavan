package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
    // ===== Constructor =====
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // initialize @FindBy elements
    }

    // ===== Locators with @FindBy =====
    @FindBy(xpath="//a[normalize-space()='US Units']")
    WebElement usUnitsLink;

    @FindBy(xpath="//a[normalize-space()='Metric Units']")
    WebElement metricUnitsLink;

    @FindBy(xpath="//input[@id='cage']")
    WebElement ageField;

    @FindBy(xpath = "//label[@for='csex1']//span[@class='rbmark']")
    WebElement maleRadio;

    @FindBy(xpath = "//label[@for='csex2']//span[@class='rbmark']")
    WebElement femaleRadio;

    @FindBy(name = "cheightfeet")
    WebElement heightFeet;

    @FindBy(name = "cheightinch")
    WebElement heightInch;

    @FindBy(name = "cheightmeter")
    WebElement heightCm;

    @FindBy(name = "cpound")
    WebElement weightLb;

    @FindBy(name = "ckg")
    WebElement weightKg;

    @FindBy(xpath = "//select[@id='cactivity']")
    WebElement activityDropdown;
    
    @FindBy(xpath = "//a[normalize-space()='+ Settings']")
    WebElement Settings;
    
    @FindBy(xpath = "//input[@name='x']")
    WebElement calculateBtn;
    
    @FindBy(xpath = "//input[@value='Clear']")
    WebElement clearBtn;
    
    @FindBy(xpath = "//*[@id=\"content\"]/table")
    WebElement resultTableDisp;
    
    @FindBy(xpath = "//div[@id='content']//font[@color='red']")
    WebElement ageErrorMsg;



    // ===== Actions =====
    public void selectUSUnits() {
        usUnitsLink.click();
    }

    public void selectMetricUnits() {
        metricUnitsLink.click();
    }

    public void setAge(String age) {
        ageField.clear();
        ageField.sendKeys(age);
    }

    public void selectMale() {
        maleRadio.click();
    }

    public void selectFemale() {
        femaleRadio.click();
    }

    public void setHeightFeet(String feet) {
        heightFeet.clear();
        heightFeet.sendKeys(feet);
    }

    public void setHeightInch(String inch) {
        heightInch.clear();
        heightInch.sendKeys(inch);
    }

    public void setHeightCm(String cm) {
        heightCm.clear();
        heightCm.sendKeys(cm);
    }

    public void setWeightLb(String lb) {
        weightLb.clear();
        weightLb.sendKeys(lb);
    }

    public void setWeightKg(String kg) {
        weightKg.clear();
        weightKg.sendKeys(kg);
    }

    public void setActivity(String value) {
        activityDropdown.sendKeys(value);
    }

    public void submitForm() {
        calculateBtn.click();
    }
    
    public void clearForm() {
    	clearBtn.click();
    }
    
    public String getResultText() {
    	return resultTableDisp.getText();
    }
    public String getPageText() {
        return driver.getPageSource();
    }
    public String getAgeErrorMessage() {
        return ageErrorMsg.getText();
    }
}
