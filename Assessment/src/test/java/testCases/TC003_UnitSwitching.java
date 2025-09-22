package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TC003_UnitSwitching extends BaseClass{
	

    @Test
    public void unitSwitchTest() {
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
            
        String usResult = home.getPageText();
        System.out.println("US Units calculation done");
        
        Assert.assertTrue(usResult.contains("Weight Maintenance"), "US Units result table should appear");

        // Metric Units
        home.selectMetricUnits();
        home.setAge("30");
        home.selectFemale();
        home.setHeightCm("165");
        home.setWeightKg("68");
        home.setActivity("1.375"); //Light
        home.submitForm();
        
        String metricResult = home.getPageText();
        System.out.println("Metric Units calculation done");        
        Assert.assertTrue(metricResult.contains("Weight Maintenance"), "Metric Units result table should appear");
    }
}


