package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://objectspy.space/");

	}

	@Test
	public void testLocators() throws InterruptedException {
		// using name
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		// using ID
		driver.findElement(By.id("sex-1")).click();
		// using className
		// upload file //Robot Class in case the element node is not Input
		// driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\siddh\\Desktop\\My
		// TF GMAIL");

		// link text
		// driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		// using partialLinkTest
		//driver.findElement(By.partialLinkText("Backend")).click();
		//using CSS
		driver.findElement(By.cssSelector("input#exp-2")).click();
		//driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
		driver.findElement(By.cssSelector("input[type='checkbox'][value='Automation Tester']")).click();
	
		//xpath
		//absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Selenium is Fun");
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("I Hate Absolute Xpath");
		driver.findElement(By.xpath("//input[@type='checkbox' and @ name='tool' and @id = 'tool-2']")).click();
		driver.findElement(By.xpath("//strong[text() = 'Link Test : New Page']")).click();
		driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : Page Change')]")).click();
		
	
	
	}

	// @After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
