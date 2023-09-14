package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //WebDriverManager.chromedriver().setup();
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://cosmocode.io/automation-practice-webtable/");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   List<WebElement> CountRows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		   int CountRowsize = CountRows.size();
		   System.out.println(CountRowsize);
		   
		   for(int i=1;i<CountRowsize;i++) {
		   List<WebElement> Countcells = CountRows.get(i).findElements(By.xpath(".//td"));
		   for(WebElement Countcell:Countcells) {
		   String Countries = Countcell.getText();
		   System.out.println(Countries);
		   
		   if(Countries.equals("Yen")) {
		   WebElement Checkbox = CountRows.get(i).findElement(By.xpath(".//input[@type='checkbox']"));
		   Checkbox.click();
		   break;
		   }
		   }
		   }
		   
	}

}
