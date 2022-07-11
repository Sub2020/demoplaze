package com.demoBlaze;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\demoblazeProject\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        String title = driver.getTitle();
        System.out.println("title");
        Assert.assertEquals("STORE", title);

    }
//    @After
//    public void tearDown(){
//        driver.close();


    @Test
    public void signup() {
        WebElement clickInNameField = driver.findElement(By.id("signin2"));
        clickInNameField.click();
        System.out.println("Signing in.");

    }

    @Test
    public void signingIn() {
        WebElement clickInNameField = driver.findElement(By.id("login2"));
        clickInNameField.click();
        WebElement usernameInNameField = driver.findElement(By.id("loginusername"));
        usernameInNameField.sendKeys("nycellphone");
        System.out.println("Sign-in username is enterned");

        WebElement passwordInNameField = driver.findElement(By.id("loginpassword"));
        passwordInNameField.sendKeys("123456nyc");
        System.out.println("password is enterned");

        WebElement loginInNameField = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
        loginInNameField.click();
    }
}























