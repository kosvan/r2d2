package ru.ZDBTest.TestNG;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class StartAppiumTest {
	
    private AppiumDriver<WebElement> driver;

    private List<Integer> values;

    private static final int MINIMUM = 0;
    private static final int MAXIMUM = 10;

  @BeforeMethod
  public void SetUp()   throws Exception {
	  System.out.println("БЕфор");
  										}
  
  @AfterMethod
  public void tearDown() throws Exception {
	  System.out.println("Афтер");
  										}
  
  
  @Test
  public void f() {
	  System.out.println("Запуск аппиум теста");
	 
  					}
  					
 
}
