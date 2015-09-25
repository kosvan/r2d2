package ru.ZDBTest.TestNG;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StartAppiumTest {
	
    private AppiumDriver<WebElement> driver;

    private List<Integer> values;

    private static final int MINIMUM = 0;
    private static final int MAXIMUM = 10;


  @Test
  public void f() {
	  System.out.println("Запуск аппиум теста");
	  
	  
  }
}
