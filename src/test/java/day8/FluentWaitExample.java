package day8;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import util.Basic;

public class FluentWaitExample extends Basic {
  @Test
  public void f() {
	  driver.get("http://bing.com/");
	  Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
	  .withTimeout(30,TimeUnit.SECONDS)
	  .pollingEvery(5,TimeUnit.SECONDS)
	  .ignoring(NoSuchElementException.class);
	  
	  WebElement foo= wait.until(new Function<WebDriver,WebElement>()
			  {
		  public WebElement apply(WebDriver driver) {
			  return driver.findElement(By.name("q"));
		  }
		  });
	  foo.sendKeys("LTI");
		  
			  }
  }


