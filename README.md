# Carbohydrate_Calculator_Tests-Veeva-_Kavan

## ✅ Test Scenarios Covered
1. **Valid Calculation (US Units)**  
   - Input valid age, gender, height, weight, activity level in US units  
   - Verify that the result table is displayed with Calories and Carbs values  

2. **Valid Calculation (Metric Units)**  
   - Input valid age, gender, height, weight, activity level in metric units  
   - Verify that the result table is displayed with Calories and Carbs values  

3. **Unit Switching Consistency**  
   - Enter same person details in **US units** and **Metric units**  
   - Verify both calculations display the result table correctly  

4. **Invalid Age Validation**  
   - Enter age below 18  
   - Verify that the application shows the correct error message:  
     _"Please provide an age between 18 and 80."_  



---

## 🛠️ Prerequisites
- **Java 11+** installed ([Download](https://adoptium.net/))  
- **Maven 3+** installed ([Download](https://maven.apache.org/))  
- **Chrome browser** installed  


---

You can run the tests in two ways:

### 🔹 Option 1: Run from IDE
1. Clone this repository.
2. Open the project in your IDE (IntelliJ IDEA / Eclipse).
3. Navigate to:  
   `src/test/java/testCases/TC001_ValidCalculationUS.java`
4. Right-click the class → **Run 'TC001_ValidCalculationUS'**.  
   Do the same for `TC002` and `TC003` if you want to run them individually.

