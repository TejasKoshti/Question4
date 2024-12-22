package com.cdac.InputValidationApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InputValidationTest {

    public static void main(String[] args) {
        // Set up Chrome Driver (ensure you have ChromeDriver installed)
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");  // Update this path
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        // Step 1: Open the webpage
        driver.get("http://testpage.eviltester.com/styled/validation/input-validation.html");

        // Step 2: Fill in the form fields
        WebElement firstName = driver.findElement(By.id("firstname"));
        WebElement lastName = driver.findElement(By.id("lastname"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement country = driver.findElement(By.id("country"));
        WebElement notes = driver.findElement(By.id("notes"));

        // Enter values into the fields
        firstName.sendKeys("John");
        lastName.sendKeys("Doe");
        age.sendKeys("30");
        country.sendKeys("USA");
        notes.sendKeys("This is a test.");

        // Step 3: Submit the form
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();

        // Step 4: Verify validation result
        WebElement validationReport = driver.findElement(By.id("validation-report"));
        if (validationReport.isDisplayed()) {
            System.out.println("Validation report displayed.");
        } else {
            System.out.println("Validation report not found.");
        }

        // Close the driver
        driver.quit();
    }
}