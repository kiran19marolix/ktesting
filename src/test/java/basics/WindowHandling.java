package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	private static final String Set = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	     String MainWindow = driver.getWindowHandle();
	     System.out.println("MainHandle - "+ MainWindow);
	     driver.findElement(By.id("newWindowBtn")).click();
	     java.util.Set<String> handles = driver.getWindowHandles();
	     for(String handle:handles) {
	    	 System.out.println(handle);
	    	 if(!handle.equals(MainWindow)) {
	    		 driver.switchTo().window(handle);
	    		 driver.manage().window().maximize();
	    		 driver.findElement(By.id("firstName")).sendKeys("kiran");
	    		 Thread.sleep(5000);
	    		 driver.close();
	    	 }
	     }
	     driver.switchTo().window(MainWindow);
	     driver.findElement(By.id("name")).sendKeys("mandi");
	     Thread.sleep(5000);  
	}
}
