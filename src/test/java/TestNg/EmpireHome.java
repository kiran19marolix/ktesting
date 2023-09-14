package TestNg;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EmpireHome {
	@Test()
	public void AddProduct() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/Authenticate/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("emailid")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[@class='btn green_btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='pe-7s-keypad']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Inventory']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Add Inventory']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Model Number']")).sendKeys("8888420420");
		driver.findElement(By.xpath("//textarea[@name='Title']")).sendKeys("garden chair");
		driver.findElement(By.xpath("//textarea[@name='ItemDescription']")).sendKeys("bamboo chair for lawn");
		driver.findElement(By.xpath("//input[@placeholder='Enter Height']")).sendKeys("22");
		driver.findElement(By.xpath("//input[@placeholder='Enter Width']")).sendKeys("18");
		driver.findElement(By.xpath("//input[@placeholder='Enter Breadth']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@placeholder='Enter Color Name']")).sendKeys("beige");
		driver.findElement(By.xpath("//input[@id='actual']")).sendKeys("2000");
		WebElement mrp = driver.findElement(By.xpath("//*[@id=\"lobicard-custom-control1\"]/div[2]/form/div[1]/div[17]/div/span/span[1]/span"));
		mrp.click();
		WebElement mrpof = driver.findElement(By.xpath("//li[contains(text(),'1.00')]"));
		mrpof.click();
		driver.findElement(By.xpath("//input[@id='mrp']")).sendKeys("1500");
		driver.findElement(By.xpath("//input[@placeholder='Enter Qty ']")).sendKeys("2");
		Actions ac = new Actions(driver);
		WebElement img = driver.findElement(By.xpath("//input[@name='ProductMainImageUploaded']"));
		ac.moveToElement(img).click().perform();
		Robot rb = new Robot();
		rb.delay(3000);
		StringSelection path = new StringSelection("C:\\Users\\kiran\\Downloads\\images.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		
	
		
	}
	

}
