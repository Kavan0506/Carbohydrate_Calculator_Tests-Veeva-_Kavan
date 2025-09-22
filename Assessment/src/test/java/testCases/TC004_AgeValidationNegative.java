package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TC004_AgeValidationNegative extends BaseClass{
	
	@Test
    public void invalidAgeTest() {
		HomePage home=new HomePage(driver);
		
		home.selectUSUnits();
        home.setAge("17"); // Invalid age
        home.selectFemale();
        home.setHeightFeet("5");
        home.setHeightInch("5");
        home.setWeightLb("140");
        home.setActivity("1.2"); // Sedentary
        home.submitForm();

        String errorMsg = home.getAgeErrorMessage();
        System.out.println("🔹 Error Message Displayed: " + errorMsg);

        Assert.assertTrue(errorMsg.contains("between 18 and 80"), "Error message should mention valid age range");
    }
}


