package session5weebly;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class session5homework {
WebDriver driver;
@Before
public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.techfios.com/ibilling/?ng=admin/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}
@Test
public void Bank$Cash() throws InterruptedException {

	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("	//span[contains(text(),'Bank & Cash')]")).click();
  Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='account']")).sendKeys("11Snt01122344");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='description']")).sendKeys("11Monthly Bsaving011236");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("10$1234");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("111");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("12JAY011234");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys(")111234560112341");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='ib_url']"))
			.sendKeys("http://a1utotechnotes.weebly.com/class-notes.html");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	String Actual = "Accounts- iBilling";

	Assert.assertEquals(driver.getTitle(), Actual);
	System.out.println("Page Validated");
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("scroll(0,2000)");

	driver.findElement(By.xpath("//ul/li[10]/ul/li[2]/a")).click();

	List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
	int tablerows = rows.size();
	System.out.println("number of rows=" + tablerows);

	/*String before_path1 = "//tbody/tr[";
	String after_path1 = "]/td[1]";
	for (int i = 2; i <= 5; i++) {
		String name = driver.findElement(By.xpath(before_path1 + i + after_path1)).getText();
		System.out.println(name);
		if (name.contains(name)) {
			driver.findElement(By.xpath("// tbody/tr[" + i + "]/td[3]/a[2]")).click();
			System.out.println("welldone");*/
			String description_before_Xpath="//tbody/tr[";		String description_After_Xpath = "]/td[2]";
			for (int j = 2; j <= 8; j++) {
				String description = driver.findElement(By.xpath(description_before_Xpath + j + description_After_Xpath))
						.getText();
				System.out.println(description);
				if (description.equalsIgnoreCase("Buy a Home")) {
					driver.findElement(By.xpath("// tbody/tr[" + j + "]/td[3]/a[2]")).click();

				}
				
					System.out.println("not found");

			}

		}}


