package sample;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class practice {

	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		String Chromekey="webdriver.chrome.driver";
		String Chromepath="C:\\Users\\swath\\EclipseWork\\eclipse-workspace\\Sel100Pm\\Drive\\chromedriver.exe";
		System.setProperty(Chromekey,Chromepath);
		
		
		//launch my browser
		//upcasting/dynamic binding
		//Parentclass/Interface ObjRef=new predefined ChildClass();
		
		WebDriver driver=new ChromeDriver();
		
		
	
	/*	String url=("https://selenium08.blogspot.com/2019/11/dropdown.html"); 
		
		driver.manage().window().maximize();
		driver.navigate().to(url);
	    driver.get(url);	
	
	    
	  //value-attribute, Visible text-the name present, index-number assigned to the text
	    
	    //printing all the text options
	
	    Select select=new Select(driver.findElement(By.xpath("  //select[@name='country']")));
	   
	    select.selectByIndex(4);
	    
	    
	    select.selectByValue("CZ");
	   
	    
	    select.selectByVisibleText("Eritrea");
	    
	
	    List<WebElement> all=select.getOptions();
	    int size=all.size();
		System.out.println("Size="+size);
		Thread.sleep(2000);  
		System.out.println("==========GET ALL OPTIONS=============");
	
		for(int i=1;i<all.size();i++)
		{
			
			System.out.println(all.get(i).getText());
		}
			
		System.out.println("============ATTRIBUTES=============");
		
		for(WebElement webelement:all)
		{
			
			System.out.println(webelement.getAttribute("value"));  
			
		}
			
			
		
	    
        System.out.println("==========GET FIRST 5 OPTIONS=============");
        for(int i=1;i<=5;i++)
		{
			
			System.out.println(all.get(i).getText());
			
			
		} 
        System.out.println("==========GET LAST 5 OPTIONS=============");
        for(int i=all.size()-5;i<all.size();i++)
		{
			
			System.out.println(all.get(i).getText());
			
			
		} 
       
        System.out.println("==========GET ALTERNATE OPTIONS=============");
        for(int i=1;i<all.size();i+=2)
		{
			
			System.out.println(all.get(i).getText());
			
			
		} 
        
        System.out.println("==========GET MIDDLE TEXT=============");
        int middle=(all.size())/2;
        System.out.println(all.get(middle).getText());
			
			
        System.out.println("==========GET ALL OPTIONS WITHOUT USING SELECT CLASS=============");
        
        List<WebElement> allcountry=driver.findElements(By.xpath("  //select[@name='country']"));
	    for(int i=0;i<allcountry.size();i++)
	    {
	    	String allcountries=allcountry.get(i).getText();
	    	System.out.println(allcountries);
	    }

        
        
        System.out.println("==========CHECK FOR ANY DUPLICATES=============");
        List<List<WebElement>> duplicates=Arrays.asList(allcountry);
        for (int i = 0; i < duplicates.size(); i++) 
        {
        	for (int j = i+1; j <duplicates.size() ; j++)
        	{
                if(duplicates.get(i).equals(duplicates.get(j)))
                {
                    System.out.println(duplicates.get(i));
                }
            }
        }
        
       
        
        	 System.out.println("==========LAST OPTIONS(OPTIONS CHANGING DYNAMICALLY)=============");   */
       
     
		
		
		
driver.get("https://automationexplore.com/selenium-automation-practice-page/"); 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		           
	//question 1
	WebElement fn=driver.findElement(By.xpath("//input[@id='firstname']"));	
	
	fn.sendKeys("Hello World");
	String name= fn.getAttribute("value");
	if(name.contains("Hell World"))
		System.out.println("Hello World is entered");
	else
		System.out.println("Hello World is not entered");
	
	
	
	//question 2
	Select select=new Select(driver.findElement(By.xpath(" //select[@name='country']")));
	select.selectByIndex(2);
	WebElement data=select.getFirstSelectedOption();
	System.out.println(data.getText());
	Thread.sleep(3000);
	
    //question 3
	 
	

	WebElement firstwindow=driver.findElement(By.xpath("//a[text()='Selenium']"));
	firstwindow.click();
	
	//switching to second window
	String fwin=driver.getWindowHandle();
	Set<String> allWin=driver.getWindowHandles();
	for(String s:allWin)
		
	{
		if(!fwin.equals(s))
		{
			driver.switchTo().window(s);
		}
		
	}
	
	driver.switchTo().window(fwin);
	driver.findElement(By.xpath("//a[text()='Selenium']")).click();
	
	Set<String> allWin2=driver.getWindowHandles();
	   
	List<String> l=new ArrayList<String>(allWin2);
	int size=l.size();
	System.out.println("Size of the window handles="+size);
	driver.switchTo().window(fwin);
	
	
	
	
    for(int i=0;i<size;i++)
    {
    	if((driver.findElement(By.linkText("NEXT")))!=null)
    		driver.findElement(By.linkText("NEXT")).click();
    	
    }

	System.out.println("New branch created");
	
	
	System.out.println("Conflict branch code");
	System.out.println("Swathi branch code");
	
	

}


}	
	

