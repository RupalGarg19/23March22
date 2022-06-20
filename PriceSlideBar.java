package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PriceSlideBar {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("sofa"+ Keys.ENTER);
        Thread.sleep(2000);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[2]/div[3]/div[1]/div[1]/div"));
        Thread.sleep(2000);
        
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 50, 0).perform();
		Thread.sleep(2000);
		WebElement item1 = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[2]"));
//		item1.click();
		Thread.sleep(2000);
		String t = item1.getAttribute("title");
        System.out.println("Item Name is : " +t);
		
        driver.close();
	}

}
