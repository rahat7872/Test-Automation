import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByTagName {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "C:/testSelenium/chromedriver.exe");		

	   WebDriver driver = new ChromeDriver();

	   driver.get("https://demoqa.com/text-box/");
		
	   // Find elements using tag name
	   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
		
	   if(allInputElements.size() != 0) 
	   {
		   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
			
		   for(WebElement inputElement : allInputElements) 
		   {
			   System.out.println(inputElement.getAttribute("placeholder"));
		   }
	   }
   }
}