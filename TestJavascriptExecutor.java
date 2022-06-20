package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJavascriptExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
		
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        WebElement ele = (WebElement) jsExecutor.executeScript("return document.getElementById('email');");
//        ele.sendKeys("id");
//        
//        jsExecutor.executeScript("return document.getElementsByName('login')[0].click()");
        
//        jsExecutor.executeScript("return document.getElementById('email').style.border='5px red sloid';");
//        Thread.sleep(2000);
//        jsExecutor.executeScript("return document.getElementById('email').style.background='yellow';");

        
        
	}

}
