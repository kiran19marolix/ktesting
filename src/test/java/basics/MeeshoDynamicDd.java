package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoDynamicDd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.meesho.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("saree");
    List<WebElement> search = driver.findElements(By.xpath("//p[normalize-space()='saree bandhani']"));
    System.out.println(search.size());
    for(WebElement searchs:search) {
    	System.out.println(searchs.getText());
    	if(searchs.getText().equals("bandhani")) {
    		searchs.click();
    	}
    	
    }
	}

}
