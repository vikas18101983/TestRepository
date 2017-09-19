package Githubp;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Githubc {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).click();
					
		List<WebElement> allDates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
		
		
		int total_node = allDates.size();
		
		for(int i=0;i<total_node;i++)
		{
			String date=allDates.get(i).getText();
			
			if(date.equalsIgnoreCase("20"))
			{
				allDates.get(i).click();
				break;
			}
			
		}
	}
}
