package com.base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
    public static WebDriver browserLaunch() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project_New\\Driver\\chromedriver.exe");
    return driver = new ChromeDriver();
}
    public static void openUrl(String url) {                            
    driver.get(url);
}
    public void clickElement(WebElement button) {         
    button.click();
}
    public void sendkeys(WebElement element, String string) {     //pending
    element.sendKeys(string);
}
    public void close(WebElement cls) {                
    driver.close();
}
    public void navigateto(WebDriver Url) {
    driver.navigate().to("Url");
}
    public void navigateforward() {
    driver.navigate().forward();
}
    public void navigaterefresh() {
    driver.navigate().refresh();
}
    public void alertAccept() {
    driver.switchTo().alert().accept();
}
    public void alertDismiss() {
    driver.switchTo().alert().dismiss();
}
    public void alertPrompt(String s) {
    driver.switchTo().alert().sendKeys(s);
}    
    public static void dropdownIndex(WebElement element, int num) {
    Select s = new Select(element);
    s.selectByIndex(num);
}
    public static void dropdownValue(WebElement element, String value) {
    Select se = new Select(element);
    se.selectByValue(value);
}
    public static void dropdownVisibletext(WebElement element, String text) {
    Select sel = new Select(element);
    sel.selectByVisibleText(text);
}
    public static void action() {                           
    	Actions act = new Actions(driver);
        act.contextClick().build().perform();
}
    public void framesIndex(WebElement index) {
    driver.switchTo().frame(index);
}
    public void framesString(WebElement element) {
    driver.switchTo().frame(element);
}
    //public void framesId(WebElement nameORid) {
    //driver.switchTo().frame(nameORid)
    //System.out.println("maha");

//}
    public void defaultcontent() {
    driver.switchTo().defaultContent();
}
    public void robot() throws AWTException {          
    	Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_DOWN);
        robo.keyRelease(KeyEvent.VK_DOWN);

}
	
	}
		
	


    
    
    
    
    
    
    
    
    

