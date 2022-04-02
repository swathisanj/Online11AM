package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test {
	
	
public static void main(String[] args) throws InterruptedException, AWTException {
	
	String Chromekey="webdriver.chrome.driver";
	String Chromepath="C:\\Users\\swath\\EclipseWork\\eclipse-workspace\\Sel100Pm\\Drive\\chromedriver.exe";
	System.setProperty(Chromekey,Chromepath);
	
	
	//launch my browser
	//upcasting/dynamic binding
	//Parentclass/Interface ObjRef=new predefined ChildClass();
	
	WebDriver driver=new ChromeDriver();
	
	
	
	
	
/*	driver.get("https://www.greenstechnologys.com/");
	
    WebElement btn=driver.findElement(By.xpath("//a[text()='Certifications']"));
    btn.click();
    String txt=btn.getText();
    System.out.println(txt); */
	
	/*driver.get("https://www.facebook.com/");
	
	WebElement user=driver.findElement(By.xpath("(//input[contains(@class ,'_')][1])");
	user.sendKeys("Greens");
	
	WebElement pass=driver.findElement(By.xpath("(//input[contains(@class ,'_')][2])");
	pass.sendKeys("Hello");
	
	//get the attribute value and comparing
	String attribute=pass.getAttribute("value");
	System.out.println(attribute);
	
	System.out.println(attribute.equals("Hello"));
	
	
	//to click
	WebElement l=driver.findElement(By.xpath("//button[contains(@class,'51sy')]"));
	l.click(); */
	
	/*driver.get("https://www.greenstechnologys.com/");
	
	WebElement par=driver.findElement(By.xpath("//strong[contains(text(),'DA')]"));
	String txt=par.getText();
	System.out.println(txt);
	
	WebElement para=driver.findElement(By.xpath("//p[contains(text(),'We undertake')]"));
	String text=para.getText();
	System.out.println(text); */
	
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement para=driver.findElement(By.xpath("//p[contains(text(),'will make')]"));
	String text=para.getText();
	System.out.println(text); */
	
	
	
	/*//xpath with attribute and values
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("Red");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Hello");
		
		WebElement btn=driver.findElement(By.xpath("//button[@value='1']"));
		btn.click(); */
		
		
	
	/*	//xpath using partial text
		WebElement par=driver.findElement(By.xpath("//h2[contains(text(),'h']"));
		String text=par.getText();
		System.out.println(text);
		
		//xpath using complete text
		WebElement btn=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btn.click(); */
			
		
	/*	//typing the text in webpage in any textbox		
	WebElement user= driver.findElement(By.id("email"));
	user.sendKeys("Greens");
	
	//password
	WebElement pass=driver.findElement(By.name("pass"));
	pass.sendKeys("Greens"); */
	
	/*WebElement btn=driver.findElement(By.name("login"));
	btn.click(); */
	
	
	
/*	//to go to the URL
	driver.get("http://www.greenstechnologys.com/");
	
	//to get the title of the page
	String Title=driver.getTitle();
	System.out.println(Title);
	
	//to get the current URL of the page
	String CurrentURL=driver.getCurrentUrl();
	System.out.println(CurrentURL);
	
	//to close the page
	driver.close(); */
	
	
	/*driver.get("http://demo.automationtesting.in/Register.html");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String currentUrl=driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	//driver.close();
	
	WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstname.sendKeys("Swathi");
	
	WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastname.sendKeys("Ram");
	
	lastname.sendKeys(Keys.ENTER);
	
	WebElement button=driver.findElement(By.xpath("//button[@id='Button1']")); */
	
/*	String url=("https://greenstechnologys.com/");
	driver.manage().window().maximize();
	driver.navigate().to(url);
    driver.get(url);	
	WebElement button=driver.findElement(By.xpath("//a[contains(text(),'N')]"));
	button.click();
	//pausing the execution
	Thread.sleep(2000); //to open a new DOM structure
	
			
	WebElement fn=driver.findElement(By.xpath("//input[]@name='firstname'"));
	fn.sendKeys("Hi"); 
    
    WebElement crs=driver.findElement(By.xpath("//a[text()='COURSES']"));
	
    Actions actions=new Actions(driver);
    
    //to do mouse over actions
    actions.moveToElement(crs).perform();
    Thread.sleep(2000);
    
    //mouse over action1
    WebElement orc=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
    actions.moveToElement(orc).perform();
    
    //sub mouse over action
    driver.findElement(By.xpath("//span[text()='SQL Certification']")).click();   
    
    */
	
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.findElement(By.xpath("//span[text()='Overview']")).click();
	
	String text=driver.findElement(By.xpath("//p[contains(text(),'learn')]")).getText();
	System.out.println(text);  */
	
	
/*	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	
	WebElement un=driver.findElement(By.name("username"));
	un.sendKeys("Swathi");
	
	WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("Ram");
	
	driver.findElement(By.xpath("//input[@value='Log In']")).click();  
	
	driver.getTitle();
	
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	Thread.sleep(4000);
	
	WebElement fn=driver.findElement(By.xpath("//input[@name='customer.firstName']"));
	fn.sendKeys("Swathi");
	
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
	//WebElement title=driver.findElement(By.xpath("//h1[contains(text(),'ParaSoft')]"));
	
	String text=driver.findElement(By.xpath("//p[contains(text(),'demo')]")).getText();
	System.out.println(text);  */
	
	
/*	driver.get("http://automationpractice.com/index.php");
	
	Actions actions=new Actions(driver);
	
	
	WebElement women=driver.findElement(By.xpath("//a[text()='Women']"));
	
    //to do mouse over actions
    actions.moveToElement(women).perform();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//a[contains(text(),'Tops')]")).click();
    Thread.sleep(2000); 
    
    WebElement txt=driver.findElement(By.xpath("//p[contains(text(),'Choose')]"));
	System.out.println(txt.getText());
    
    driver.close(); */
    
/*    String url=("https://demoqa.com/droppable/");
	driver.manage().window().maximize();
	driver.navigate().to(url);
    driver.get(url);
    
    
    //DRAG AND DROP ACTIONS METHOD
    
    //from/source element--which element it should drag
    //to/target element--where the element should be placed
    
 
  //Actions class method to drag and drop 
  Actions builder = new Actions(driver);
  WebElement from = driver.findElement(By.id("draggable"));
	 
	WebElement to = driver.findElement(By.id("droppable"));	
  //
   * Perform drag and drop
  builder.dragAndDrop(from, to).perform();
  
   */
	
	//RIGHT CLICK
	
	//driver.get("https://www.toolsqa.com/selenium-webdriver/robot-class/");
	
//	Actions builder = new Actions(driver);
	//WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
//	builder.contextClick().perform();
	
	//KEYBOARD ACTIONS
	//Robot robot=new Robot();
	
/*	//pressing down arrow two times
	
	robot.keyPress(KeyEvent.VK_DOWN);
    robot.keyRelease(KeyEvent.VK_DOWN);
    
    Thread.sleep(3000);
    robot.keyPress(KeyEvent.VK_DOWN);
    robot.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(3000);
    
    //press enter on the third option in drop down menu
	
	robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_DOWN); */
    
	//looping for many times
/*	for(int i=1;i<=10;i++)
	{
		robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyRelease(KeyEvent.VK_DOWN);
	}
	
    Thread.sleep(3000);
    
    //press enter on the third option in drop down menu
	
	robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_DOWN);  */
	//driver.get("https://parabank.parasoft.com/parabank/about.htm");
	
	
	//SHIFT KEY AND TAB KEY USING ROBOT
	
	//username
/*	robot.keyPress(KeyEvent.VK_SHIFT); //capslock
	
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_P);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_P);
	
	robot.keyRelease(KeyEvent.VK_SHIFT);
	
	//tab to the next field
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	//password
	robot.keyPress(KeyEvent.VK_SHIFT); //capslock
	
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_P);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_P);
	
	robot.keyRelease(KeyEvent.VK_SHIFT);  */
	
	
/*	//COPY and PASTE USING ROBOT
	
	//username
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_P);
	
	
	//MOUSE ACTION FOR DOUBLE CLICK for COPY and PASTE
	Actions builder = new Actions(driver);
	WebElement username=driver.findElement(By.name("username"));
	builder.doubleClick(username).perform();
	
	
   //Control+A and Control+C- select all and copy using ROBOT
	robot.keyPress(KeyEvent.VK_CONTROL);
	
	//robot.keyPress(KeyEvent.VK_A);
	//robot.keyRelease(KeyEvent.VK_A);
	
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);  
	
	//tab to the next field
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	//password-Control+V-Pasting the copied content-username
	robot.keyPress(KeyEvent.VK_CONTROL);
	
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);  */
	
	//When you have a valid WebElement but its sendkeys option is not working
	
/*	Actions builder = new Actions(driver);
	//username
	WebElement username=driver.findElement(By.name("username"));
	builder.keyDown(username,Keys.SHIFT).sendKeys(username,"apple").keyUp(username,Keys.SHIFT).perform();
	//builder.sendKeys(username,"Apple").perform();
	
	//password
	WebElement password=driver.findElement(By.name("password"));
	builder.keyDown(password,Keys.SHIFT).sendKeys(password,"apple").keyUp(password,Keys.SHIFT).perform();
	//builder.sendKeys(password,"Apple").perform(); */
	
/*	//ENUMS
 * 
 * driver.get("https://www.amazon.com/Amazon-Video/b/?&node=2858778011");
	//using ENUMS key for single keyboard action
	//Search bar in amazon
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.SHIFT,"movie",Keys.ENTER);  */
	
	
	
/*	//NAVIGATION METHODS
	
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/Amazon-Video/b/?&node=2858778011");
	Thread.sleep(2000);
	
	driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	
	WebElement un=driver.findElement(By.name("username"));
	un.sendKeys("Swathi");
	Thread.sleep(2000);
	
	//moving backwards
	driver.navigate().back();
	Thread.sleep(2000);
	
	//moving forward
	driver.navigate().forward();
	Thread.sleep(2000);
	
	//refresh the page
	driver.navigate().refresh();
	Thread.sleep(2000);   */
	
	
	
/*	//AUTHENTICATION
	
	//FIRST SCENARIO
	
	    //Parallel execution-Passing my username and password with url
		//Authentication Syntax
		//======= https://username:password@url
		//String auth="https://username:password@url"
		//User-admin
		//Password-admin
		//Url-the-internet.herokuapp.com/basic_auth
	
	driver.manage().window().maximize();
	
	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	
	
	//String us="admin";
	//String pass="admin";
	//String url="the-internet.herokuapp.com/basic_auth";
	//driver.get("https://"+us+":"+pass+"@"+url);

	
	//SECOND SCENARIO-when there are more than one credentials
	
	
	List<String> l=new ArrayList<>();
	l.add("A");
	l.add("B");
	l.add("C");
	
	
	List<Integer> l1=new ArrayList<>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	
	
	String url="the-internet.herokuapp.com/basic_auth";
	
	for(int i=0;i<l.size();i++)
	{
		
		System.out.println("https://"+l.get(i)+":"+l1.get(i)+"@"+url);
	}  */
	
	
/*	//ALERT TOPIC
 * 
 * 
 * 
 * driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	Thread.sleep(3000);
	driver.findElement(By.name("cusid")).sendKeys("Swathi",Keys.ENTER);
	//driver.findElement(By.name("submit")).click();
	Thread.sleep(3000);
	
	//switching the control to the browser popup
	Alert alert=driver.switchTo().alert();
	
	Thread.sleep(3000);
	
	//clicking on OK
	alert.accept();
	
	
	
	//to get the alert message on Console
	String text=alert.getText();
	System.out.println(text);
	
	Thread.sleep(3000);
	alert.accept();
	
	//to cancel the alert
	alert.dismiss();
	
	
	//to sendkeys in alert popup
	//alert.sendKeys("A");
	
	
	//https://demo.automationtesting.in/Alerts.html  */
	
	
	//JAVASCRIPT EXECUTER
	
	JavascriptExecutor executor= (JavascriptExecutor) driver;
	
/*	driver.get("https://parabank.parasoft.com/parabank/about.htm");
	WebElement user=driver.findElement(By.name("username"));
	user.sendKeys("Greens");
	
	
	
	//typecasting
	
	
	
	//sendkeys in JavaScript
	
	executor.executeScript("arguments[0].setAttribute('value','Greens')", user);
	
	//arguments-html document
	//index number-which element it has to work
	//setAttriibute- a method to set the value as 'Greens'
	//user- created WebElement
	
	//By doing this using JAVASCRIPT we are directly interacting with the DOM structure script
	

	
	//password using Java Script
	
	executor.executeScript("arguments[1].setAttribute('value','Hi')", user,driver.findElement(By.name("password")),pass);
	
	//to get some values
		Object executeScriptAttribute=executor.executeScript("return arguments[0].getAttribute('value')",user);
		System.out.println(executeScriptAttribute);
	
	//click the element using JS
	executor.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@class='button']")));

	
	//getText
		Object text= executor.executeScript("return arguments[0].innerHTML",driver.findElement(By.xpath("//h1[text()='Error!']")));
		System.out.println(text);
		System.out.println(executor.executeScript("return arguments[0].innerHTML",driver.findElement(By.xpath("//h1[text()='Error!']"))));  */
	
	
	
/*	//SCROLLING USING JS
	
	
	driver.get("https://www.amazon.com/Amazon-Video/b/?&node=2858778011");
	
	
	Thread.sleep(3000);
	executor.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//div[text()='Get to Know Us']")));
	
	
	Thread.sleep(3000);
	executor.executeScript("arguments[0].scrollIntoView(false)",driver.findElement(By.xpath("//div[text()='Get to Know Us']")));  */
	
	
/*	//SELECT METHODS_DROP DOWN  
	
	
	driver.get("https://demoqa.com/select-menu");
	//driver.findElement(By.xpath("//div[text()='Select Option']")).click();
	
	/*Robot robot=new Robot();
	
	//pressing down arrow two times
	
		robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyRelease(KeyEvent.VK_DOWN);
	    
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    
	    //press enter on the third option in drop down menu
		
		robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_DOWN); 
	
	Thread.sleep(3000);
	
	WebElement sele=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	
	//obj for Select class
	
	Thread.sleep(2000);
	
	Select select=new Select(sele);
    select.selectByIndex(5);
    
    Thread.sleep(2000);
    select.selectByValue("3");
    
    Thread.sleep(2000);
    select.selectByVisibleText("Purple");
	
	
	List<WebElement> all=select.getOptions();
	System.out.println(all.size());
	System.out.println("=======================");
	
	for(int i=0;i<all.size();i++)
	{
		WebElement webelement=all.get(i);
		String text=webelement.getText();
		System.out.println(text);
		//System.out.println(all.get(i).getText());
	}
		
	System.out.println("=========================");
	
	for(WebElement webelement:all)
	{
		String attribute=webelement.getAttribute("value");
		System.out.println(attribute);
		//System.out.println(webelement.getAttribute("value"));
		  }  
		  */
	
	
	

	
	
	
	}  
	
  

	
	
	
	
		
    
}

	
	

