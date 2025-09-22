package testCases;

import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.HomePage;

public class TC001_ValidCalculationUS extends BaseClass {
	
	@Test
    public void validCalculationTest() {
		HomePage home=new HomePage(driver);
		
		// US units

        home.selectUSUnits();
        home.setAge("30");
        home.selectMale();
        home.setHeightFeet("5");
        home.setHeightInch("10");
        home.setWeightLb("170");
        home.setActivity("1.55"); //Active
        home.submitForm();

        String resultText = home.getResultText();
        System.out.println("🔹 Result Table Output:\n" + resultText);
        System.out.println("Checking result table for valid US input");

        Assert.assertTrue(resultText.contains("Weight Maintenance"), "Result table should appear");
        Assert.assertTrue(resultText.contains("Calories"), "Calories should be displayed");
    }
}