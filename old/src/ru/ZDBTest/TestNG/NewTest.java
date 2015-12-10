package ru.ZDBTest.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Выполняется тест f");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Подготовка теста..");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("завершаем тест..");
  }

  @BeforeTest
  public void beforeTest() {
	 System.out.println( "Подготовка перед запуском тестов..");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println( "Завершение тестов.."); 
  }

}
