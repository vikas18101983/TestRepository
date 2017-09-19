package GitPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitClass {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
					
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("27"))
			{
				ele.click();
				break;
			}
			
		}
	}
}

