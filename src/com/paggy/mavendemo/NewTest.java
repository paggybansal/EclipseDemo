package com.paggy.mavendemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver=null;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("paragbansal.bansal@gmail.com");;
      driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Paggy@123");
      driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
      
      Thread.sleep(100000);
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.gecko.driver","/Users/paragbansal/Downloads/geckodriver");
		 driver = new FirefoxDriver();
      String baseUrl = "http://www.facebook.com";
      
      
      driver.get(baseUrl);
      driver.manage().window().maximize();
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
      System.exit(0);
  }

}
