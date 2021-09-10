package org.example;// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AuthorizationTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void authorizationTest() throws InterruptedException {
        driver.get("https://diary.ru/");
        driver.findElement(By.cssSelector(".i-lock")).click();
        driver.findElement(By.id("loginform-username")).click();
        driver.findElement(By.id("loginform-username")).sendKeys("TestTset2");
        driver.findElement(By.id("loginform-password")).click();
        driver.findElement(By.id("loginform-password")).sendKeys("TestTset2");
        driver.findElement(By.id("loginform-rememberme")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(10000);
        driver.findElement(By.id("login_btn")).click();
        driver.findElement(By.cssSelector("#wrapper > .container")).click();
        assertThat(driver.findElement(By.cssSelector(".block:nth-child(1) > h1")).getText(), is("Популярное"));
    }
}
