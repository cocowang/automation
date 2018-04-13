// 使用testng框架的测试类, 主要进行页面输入框,按钮的测试, 其中的测试数据也可以分离,暂时没有进行分离,
package com.company.testSuites.businessA;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.company.commonObject.UseBrowser;
import com.company.pageObject.HomePageObject;

public class BaiduSearch {
    HomePageObject page =new HomePageObject();
    UseBrowser browser = new UseBrowser();
    WebDriver drivers;
    
    
  @Test
  public void test_baidu() throws Exception {
      page.click_Search_Bar(drivers);
      page.input_Search_Box(drivers,"PageObject");
      Thread.sleep(10000);
      page.click_Search_Button(drivers);
  }
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("Before method success....");
     
  }

  @AfterMethod
  public void afterMethod() {
      System.out.println("After Method success....");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("Before Class success....");
  }

  @AfterClass
  public void afterClass() {
      System.out.println("After Class success....");
  }

  @BeforeTest
  public void beforeTest() {
      System.out.println("Before Test success....");
  }

  @AfterTest
  public void afterTest() {
      System.out.println("After Test success....");
  }

  @BeforeSuite
  public void beforeSuite() {
      drivers = browser.setupChrome("http://www.baidu.com/");
      System.out.println("Before Suite success....");
  }

  @AfterSuite
  public void afterSuite() {
      browser.teardownBrowser();
      System.out.println("After Suite success....");
  }
}
