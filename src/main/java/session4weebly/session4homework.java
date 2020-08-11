package session4weebly;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class session4homework {

	WebDriver driver;
	@Before
	public void techfios() {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	  
	}
	
	@Test
	public void TEST() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]")).click();
		Thread.sleep(2000);
	     driver.findElement(By.id("account")).sendKeys("SOYANT SHAH");
	     	     Select sel=new Select(driver.findElement(By.id("cid")));
		sel.selectByValue("1");
		driver.findElement(By.id("email")).sendKeys("gonzalez@gmailhotmail.com");
		driver.findElement(By.id("phone")).sendKeys("335-775-2180");
		driver.findElement(By.id("address")).sendKeys("123 jose street");
		driver.findElement(By.id("city")).sendKeys("mexico-city");
		driver.findElement(By.id("state")).sendKeys("michigan");
		driver.findElement(By.id("zip")).sendKeys("12345");
		 Select con=new Select(driver.findElement(By.id("country")));
		 con.selectByVisibleText("Mexico");
		  Select select=new Select(driver.findElement(By.id("country")));
			select.selectByVisibleText("United States");
			Select sel1 =new Select(driver.findElement(By.id("currency")));
			sel1.selectByValue("1");
			Select sel2=new Select(driver.findElement(By.id("group")));
			sel2.selectByValue("2");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.id("cpassword")).sendKeys("abc123");
            driver.findElement(By.xpath("//button[@id='submit']")).click();
            		
}
}