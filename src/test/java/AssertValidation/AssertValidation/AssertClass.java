package AssertValidation.AssertValidation;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AssertClass {
	WebDriver driver=null;
	//String BaseURL="https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

	//String BaseURL="http://www.inviul.com";
	@Test
	public void AssertGmailLogin() throws InterruptedException 
	{
		/*WebElement gmail=driver.findElement(By.id("identifierId"));
		gmail.sendKeys("");
		WebElement next=driver.findElement(By.cssSelector(".RveJvd"));
		next.click();

		String actualError= driver.findElement(By.className("TQGan")).getText();
		String expectederror="Enter an email or phone number";
		
		//Assert.assertEquals(actualError, expectederror);
		Assert.assertEquals(actualError.contains("safsdafsdf"), expectederror, "Please check with devs");*/
		
		//Expected Title 
		/*String expectedTitle = "Free Selenium Tutorials by Avinash Mishrda"; 
		//Actual Title 
		String actualTitle = driver.getTitle(); */
		
		/*//Ternary Operator Definition
		   String result = (t==true) ? "Title Matched" :  "Title didn't match";*/
		   
		/*//Conditions 
		boolean t = (actualTitle.equals(expectedTitle));
		//Assertions
		Assert.assertTrue(t, "Title didn't match");*/
		
		//Conditions
		  /* if(actualTitle.equals(expectedTitle)){
		   
		   System.out.println("Title Matched");
		   
		   }else {
		   
		   System.out.println("Title didn't match");
		   }*/
		
		// Open URL
		
		driver.get("http://www.naukri.com");
		 WebElement lgnBtn1=driver.findElement(By.linkText("Login"));

		 lgnBtn1.click();

		 WebElement lgnBtn2=driver.findElement(By.xpath("//button[@value=’Login’]"));

		 lgnBtn2.click();

		 WebElement lgnBtn3=driver.findElement(By.id("eLogin_err"));
		 WebElement lgnBtn4=driver.findElement(By.id("pLogin_err"));

		 Assert.assertEquals(lgnBtn3.getText(),"Please enter your Email ID");
		 Assert.assertEquals(lgnBtn4.getText(),"Please enter your Password");
		 Thread.sleep(10000);
		 WebElement lgnBtn5=driver.findElement(By.id("fLogin_err"));

		 System.out.println("There is one more error on the screen :- " + lgnBtn5.getText());
		 
		    }
		
	
		@BeforeMethod
		public void beforeMethod() 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\TUAutomation\\drivers\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			//driver.get(BaseURL);
			driver.manage().window().maximize();
		}

		@AfterMethod
		public void afterMethod()
		{
			driver.quit();

		}

	}

