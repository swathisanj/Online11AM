package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		String Chromekey="webdriver.chrome.driver";
		String Chromepath="C:\\Users\\swath\\EclipseWork\\eclipse-workspace\\Sel100Pm\\Drive\\chromedriver.exe";
		System.setProperty(Chromekey,Chromepath);
		
		
		//launch my browser
		//upcasting/dynamic binding
		//Parentclass/Interface ObjRef=new predefined ChildClass();
		
		WebDriver driver=new ChromeDriver();
		
		
		//SELECTING MULTIPLE OPTIONS
/*		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement ddn = driver.findElement(By.id("fruits"));
		
		Select s = new Select(ddn); 	
		//to check if the DDN is Multiple Selection 
	/*	boolean mu = s.isMultiple();
		System.out.println(mu);
		//selecting multiple options 
		Thread.sleep(2000);
		s.selectByValue("orange");
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByVisibleText("Banana");
		
		// to get all the selected options 
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement w : all) {
			System.out.println(w.getText());
		}
		
		// to get the first selected options 
		WebElement fs = s.getFirstSelectedOption();
		System.out.println(fs.getAttribute("value"));
		
		
		//deselect my options 
		Thread.sleep(2000);
		s.deselectByVisibleText("Orange");
		Thread.sleep(2000);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByVisibleText("Grape"); 

	
	 //to select all options
	
		//1.Get all the options
	 List<WebElement> options=s.getOptions();
	 
	 
	 //2.get individual options
	 for(WebElement w:options)
	 {
		 
		 //3.get the text from web element
	String text=w.getText();
	
	//4.use the text from selected visible text
	s.selectByVisibleText(text);
	Thread.sleep(2000);
	 } 
	 
	
	 
	 
	 for (int i = 0; i < options.size(); i++) {
		s.selectByIndex(i);
	} 
	
	Thread.sleep(2000);
	// to deselect all, the Options 
	s.deselectAll(); */

	 
	
	 
	//IMAGE CLICK 
	 
 /*driver.get("https://www.lambdatest.com/blog/selenium-click-button-with-examples/");
 WebElement img=driver.findElement(By.xpath("//img[@src='https://www.lambdatest.com/blog/wp-content/uploads/2019/05/selenium.png']"));
  img.click(); */
	 

	 
/*	 //HANDLING FRAMES
 
 driver.get("https://demo.guru99.com/test/guru99home/");
 
//to get the frame count
 List<WebElement> allframe=driver.findElements(By.tagName("iframe"));
 System.out.println(allframe.size());
 
	
 //switching to iframes
 
 driver.switchTo().frame("a077aa5e");
 
 //clicking the element inside the frame
 WebElement imag=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	 
 imag.click();
 
 
 //switch to default page
 driver.switchTo().defaultContent();
 System.out.println(driver.findElement(By.xpath("//h3[text()='Email Submission']")).getText()); */
 
/*//=========INNER FRAMES================	 
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
//to find the count of the iframes

List<WebElement> all=driver.findElements(By.tagName("iframe"));
System.out.println(all.size());

 driver.switchTo().frame(0); //frame("frame1")-0th index
 driver.findElement(By.xpath("//body//input")).sendKeys("A");
 
 driver.switchTo().frame(0); //inner frame-frame("frame3")-inner frame starts from 0 again
 driver.findElement(By.xpath("//input[@id='a']")).click();
 
 //switching to its parent frame
 driver.switchTo().parentFrame();
 driver.findElement(By.xpath("//body//input")).sendKeys("ABCDEF");
 
 
 //switching to default DOM
 driver.switchTo().defaultContent();
 
 ///switching to frame 1-frame("frame2")
 driver.switchTo().frame(1);
 WebElement ddn=driver.findElement(By.id("animals"));
 Select select=new Select(ddn);
 select.selectByIndex(3);
 
 //switching to default DOM
 driver.switchTo().defaultContent(); */
 
 
 
/*//SINGLE WINDOW HANDLING-New Tab		
		
driver.get("https://www.amazon.in/");
 
 //to get the window id
 String firstwindowhandle=driver.getWindowHandle();// will get the id of the current or controlling page
 System.out.println(firstwindowhandle);
 
 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone",Keys.ENTER);
 System.out.println(driver.getWindowHandle());// will get the id of the current or controlling page

 
 
driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - Black']")).click();

System.out.println(driver.getWindowHandle());// will get the id of the current or controlling page
Thread.sleep(3000);

//to get all the windows
Set<String> allwindows=driver.getWindowHandles();
System.out.println(allwindows);

//to iterate between one by one id
for(String s:allwindows) //s-local variable
	//to check if the iterated value is not equal to first window handle
{
	if(!firstwindowhandle.equals(s))
		driver.switchTo().window(s);
}

//clicking the element in the second window
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();  */

	
//MULTIPLE WINDOWS HANDLING
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone",Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone XR (128GB) - Coral']")).click();
		
		
        //Switching to second window
		String fwin=driver.getWindowHandle();
		Set<String> allWin=driver.getWindowHandles();
		
		for(String s:allWin) //s-local variable
			//to check if the iterated value is not equal to first window handle
		{
			if(!fwin.equals(s))
				driver.switchTo().window(s);
		}
 
		//clicking the element in the second window
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();  
		Thread.sleep(3000);


		driver.switchTo().window(fwin);
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - Black']")).click();
		String win=driver.getWindowHandle();
		System.out.println(win);  // the control is in the first window
		Set<String> allWin2=driver.getWindowHandles();
		System.out.println(allWin2);
				
		//adding to List to fetch individual values
		List<String> l=new ArrayList<String>(allWin2);
		//l.addAll(allWin2);
		int size=l.size();
		System.out.println("Size of the window handles="+size);
		 
		
		
		
		String win3=l.get(2);
		
		
	//switching to window 3	
	driver.switchTo().window(win3);	
		
		
	
	//3rd window ---- add to cart click
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();  
		driver.getWindowHandle(); 

 
 
 
 
	} 
}
	

