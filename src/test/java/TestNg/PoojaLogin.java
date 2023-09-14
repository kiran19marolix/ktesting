package TestNg;

import org.bouncycastle.asn1.ASN1Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PoojaLogin {
	@Test(dataProvider = "loginTestData", dataProviderClass=PoojaStores.class)
	public void LoginFunctionality(String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("pword")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
	    String url = driver.getCurrentUrl();
		Assert.assertEquals("http://poojastore.marolix.com/", url);
	
	}
}
