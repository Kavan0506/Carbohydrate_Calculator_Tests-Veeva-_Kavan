package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TC002_ValidCalculationMetric extends BaseClass {
	
	@Test
    public void validCalculationTest() {
		HomePage home=new HomePage(driver);

        home.selectMetricUnits();
        home.setAge("30");
        home.selectMale();
        home.setHeightCm("180");        
        home.setWeightKg("60");
        home.setActivity("1.55"); //Active
        home.submitForm();

        String resultText = home.getResultText();
        System.out.println("🔹 Result Table Output:\n" + resultText);
        System.out.println("Checking result table for valid US input");

        Assert.assertTrue(resultText.contains("Weight Maintenance"), "Result table should appear");
        Assert.assertTrue(resultText.contains("Calories"), "Calories should be displayed");
    }
}

