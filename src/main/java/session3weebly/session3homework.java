package session3weebly;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class session3homework {
	WebDriver driver;
		@Before
		public void open() {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.techfios.com/ibilling/?ng=admin/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  	 driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
			  driver.findElement(By.id("password")).sendKeys("abc123");
			  driver.findElement(By.name("login")).click();
}
		@Test
	public void Transactions() throws InterruptedException {
			Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Transfer')]")).click();
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='faccount']")));
		
		Thread.sleep(3000);
		sel.selectByVisibleText("Mean820");
		Thread.sleep(5000);
		Select sel1=new Select(driver.findElement(By.xpath("//select[@id='taccount']")));
			
		sel1.selectByValue("Mean680");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("QA tution fees");
		driver.findElement(By.xpath("//input[@id=\"amount\"]")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys("sanjay");
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
	}
		
}