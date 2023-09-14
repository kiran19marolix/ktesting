package basics;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 
	     driver.manage().window().maximize();
	     
	     //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     
	     driver.get("https://www.google.com/");
	     
	     driver.findElement(By.id("APjFqb")).sendKeys("tops");
	     
	     List<WebElement> search=driver.findElements(By.xpath("//div[@class='pcTkSc']//b"));
	     
	     System.out.println(search.size());
	     
	     for(WebElement search1:search) {
	    	 System.out.println(search1.getText());
	    	 if(search1.getText().equals("for women")) {
	    		 search1.click();
	    	 }
	     }
	    
	    // for(int i=0; i<search.size();i++) {
	     //if(search.get(i).getText().contains("centuries")){
	    	// System.out.println(search.get(i).getText());
	    	 //search.get(i).click();
	    	 //break;
	     }
	    	
	}

