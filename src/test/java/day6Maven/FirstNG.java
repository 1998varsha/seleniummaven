package day6Maven;

import org.testng.annotations.Test;

import util.Basic;

import java.util.List;               
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FirstNG extends Basic {
	/*WebDriver driver;*/
  @Test
  public void f() {

	  driver.get("http://agiletestingalliance.org/");
	  driver.findElement(By.linkText("Certifications")).click();
	  List<WebElement> gg=driver.findElements(By.xpath("//area"));
	
		  System.out.println("No of certification are"+gg.size());
String url=driver.findElement(By.xpath("/html/body/section/div/div[2]/map/area[5]")).getAttribute("href");
	 System.out.println("href of the CP-BAT url is"+url); 
  }


}