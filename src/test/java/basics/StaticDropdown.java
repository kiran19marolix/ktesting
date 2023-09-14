package basics;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    WebElement searchdrop = driver.findElement(By.id("searchDropdownBox"));
	     Select search = new Select(searchdrop);
	     //search.selectByVisibleText("Computers & Accessories");
	     search.selectByIndex(5);     //Amazon pharmacy
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("para");
	     List<WebElement> drugs = driver.findElements(By.xpath("//span[@class='s-heavy']"));
	     System.out.println(drugs.size());
	     for(WebElement dr:drugs) {
	     System.out.println(dr.getText());
	     if(dr.getText().equals("cetamol tablets 500mg")) {
	    	 dr.click();
	     }
	    	 
	    }
	     
	     
	}

}
