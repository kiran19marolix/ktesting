package TestNg;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PoojaScript {
	@Test(dataProvider = "loginTestData")
	public void TestLogin(String emailAddress, String Password)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("emailid")).sendKeys("emailAddress");
		driver.findElement(By.name("pword")).sendKeys("Password");
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String url = driver.getCurrentUrl();
		assertEquals("http://poojastore.marolix.com/", url);
		}
	
	@DataProvider(name = "loginTestData")
    public Object[][] loginData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "pooja132@gmail.com";
		data[0][1] = "1234";
		
		data[1][0] = "neeraj@gmail.com";
		data[1][1] = "123";
		//div[@class='col-md-6']//b
		return data;
    }
}
