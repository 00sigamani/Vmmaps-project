package Base;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Demo {
	
	public static WebDriver driver;
	public static WebDriver browser_Launch(String s) {//Browser Launch
		// TODO Auto-generated method stub
		
		if(s.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(s.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		else if(s.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	
}
	public static  void url(String s) { //Url
		// TODO Auto-generated method stub
		driver.get(s);

	}
	
	
	public static void windowHandles(int i) {
		// TODO Auto-generated method stub
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(i));

	}
	
	public static void getAcc_sigin(WebElement w) {
	click(w);
	
	}
	

	public static void screenshot(String s) throws IOException {  
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File screenshotAs=ts.getScreenshotAs(OutputType.FILE);
		 File f=new File("C:\\Users\\yuvas\\eclipse-workspace\\Amazon_Maven\\screenshot2\\"+s+"'.png");
		 FileUtils.copyFile(screenshotAs,f);
		
	}//select
	 public static void SelectByIndex( int i, WebElement w) {     
	  		Select s = new Select(w);
	  		s.selectByIndex(i);

	}
	      
	      public static void SelectByValue(String str,WebElement w) {  
	  			Select s1 = new Select(w);
	  			s1.selectByValue(str);
	  		
	}
	  	
	  	public static void SelectByVisibleText( String str,WebElement w) {  
	  		   Select s2 = new Select(w);
	  		   s2.selectByVisibleText(str);
	  	}
	  	
	  	public static void javascriptexecutor(String s) {
	  		
	  		JavascriptExecutor js = (JavascriptExecutor) driver ;
    		js.executeScript("window.scrollBy("+s+")");
			// TODO Auto-generated method stub

		}
	  	public static void doubleClick() {
			// TODO Auto-generated method stub
	  		Actions act = new Actions(driver);
	  		act.doubleClick();

		}
	  	public static void movetElement() {
			// TODO Auto-generated method stub
	  		Actions act = new Actions(driver);
	  		act.moveToElement(null);

		}
	  	
		public static void alertSimple(String s) {
			// TODO Auto-generated method stub
	  		if(s.equalsIgnoreCase("Accept")) {	
	  			driver.switchTo().alert().accept();
	  		}
	  		else {
	  			driver.switchTo().alert().dismiss();
	  		}
	  		}
	  	public static void confalert(String s) {
	  		if(s.equalsIgnoreCase("Accept")) {	
	  			driver.switchTo().alert().accept();
	  		}
	  		else {
	  			driver.switchTo().alert().dismiss();
	  		}
	  		
			// TODO Auto-generated method stub
}
	  	public static void promptalert(String s,WebElement a) {
	  		if(s.equalsIgnoreCase("Accept")) {	
	  			driver.switchTo().alert().accept();
	  			a.sendKeys(s);
	  		}
	  		else {
	  			driver.switchTo().alert().dismiss();
	  		}
			// TODO Auto-generated method stub
}
		
	  	public static void implicitwaitDemo(int i) {
			// TODO Auto-generated method stub
	  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
	  		

		}
	  	public static void explicitwait(int i) {
			// TODO Auto-generated method stub
	  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));

		}
	  	
	  	public static void senkeys(WebElement w,String s) {
			// TODO Auto-generated method stub
	  		w.sendKeys(s);

		}
	  	public static void click(WebElement w) {
	  		w.click();
			// TODO Auto-generated method stub

		}

	  		  	public static void windowshandles(int i) {
	  		
	  		 Set<String> windowHandles = driver.getWindowHandles();
				List<String> li = new ArrayList<String>(windowHandles);
				driver.switchTo().window(li.get(i));
			// TODO Auto-generated method stub

		}
	  	
	  	public static void webtable(List<WebElement> w) {
	  		List<WebElement> data= w;
			for (WebElement webElement : data) {
				String text2 = webElement.getText();
				
			}// TODO Auto-generated method stub

		}
		public static void quit() {
	  		
	  		driver.quit();
		}
	       
	  	public static void close() {
			driver.close();

		}
	 public static void clear(WebElement w) {
			// TODO Auto-generated method stub
          w.clear();
		}

}
