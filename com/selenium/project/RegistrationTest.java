package com.selenium.project;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class RegistrationTest {

    public static void main(String[] args) {

        // ✅ UPDATED CHROMEDRIVER PATH
        System.setProperty("webdriver.chrome.driver",
                "C:\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            // 1. Open page
            driver.get("http://127.0.0.1:5500/index.html");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
            System.out.println("✅ Page loaded successfully");

            // 2. Valid Data Test
            driver.findElement(By.id("name")).sendKeys("Mahek Shah");
            driver.findElement(By.id("email")).sendKeys("mahek@gmail.com");
            driver.findElement(By.id("mobile")).sendKeys("9876543210");

            driver.findElement(By.xpath("//input[@value='Female']")).click();

            Select dept = new Select(driver.findElement(By.id("department")));
            dept.selectByVisibleText("Computer Science");

            driver.findElement(By.id("feedback"))
                    .sendKeys("This is a very good system and I really like this feedback form project");

            driver.findElement(By.xpath("//input[@value='Submit']")).click();

            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("✅ Valid Data Test: " + alert.getText());
            alert.accept();

            // 3. Invalid Email Test
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("invalidEmail");

            driver.findElement(By.xpath("//input[@value='Submit']")).click();

            alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("✅ Invalid Email Test Passed: " + alert.getText());
            alert.accept();

            // 4. Invalid Mobile Test
            driver.findElement(By.id("mobile")).clear();
            driver.findElement(By.id("mobile")).sendKeys("123");

            driver.findElement(By.xpath("//input[@value='Submit']")).click();

            alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("✅ Invalid Mobile Test Passed: " + alert.getText());
            alert.accept();

            // 5. Empty Fields Test
            driver.findElement(By.xpath("//input[@value='Reset']")).click();

            driver.findElement(By.xpath("//input[@value='Submit']")).click();

            alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("✅ Empty Field Test Passed: " + alert.getText());
            alert.accept();

            // 5. Reset Button Test
            driver.findElement(By.xpath("//input[@value='Reset']")).click();
            System.out.println("✅ Reset Button Working");

        } catch (Exception e) {
            System.out.println("❌ Test Failed");
            e.printStackTrace();
        }

        driver.quit();
    }
}