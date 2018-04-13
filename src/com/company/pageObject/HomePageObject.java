//pageobject页面对象类,百度搜索页面的[输入框],[百度一下按钮]对象及操作
package com.company.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.company.elementPath.PageElementPath;

public class HomePageObject extends PageElementPath{    
	// 点击搜索栏
    public void click_Search_Bar(WebDriver driver){
        driver.findElement(By.id(search_bar_id)).click();
    }        
    
    public void input_Search_Box(WebDriver driver,String key_word){        
        driver.findElement(By.id(search_box_id)).clear();
        driver.findElement(By.id(search_box_id)).sendKeys(key_word);
        System.out.println("test:"+key_word);        
    }    
    //
    public void click_Search_Button(WebDriver driver){            
        driver.findElement(By.name(search_button_name)).click();
        System.out.println("click the baiduyixia,success...");    
    }
}