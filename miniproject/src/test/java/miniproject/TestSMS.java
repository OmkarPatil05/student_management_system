package miniproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSMS {
	public static void main(String args[]) throws Exception
	{
		 int totalTest =0;
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// url of html page
		String baseUrl = "http://localhost:8080/miniproject/home.jsp";
		// expected title value
        String expectedTitle = "Home";
        // actual title variable
        String actualTitle = "";
        
        // creating new session for browser
        driver.get(baseUrl);
        
        // Retrieving actual title value
        actualTitle = driver.getTitle();
        
        // comparing actual and expected value
        totalTest++;
        if (actualTitle.contentEquals(expectedTitle))
        {
        	System.out.println(totalTest+") Title test:");
            System.out.println("Test Passed \n");
        }
        else 
        {
        	System.out.println(totalTest+") Title test:");
            System.out.println("Test Failed \n");
        }
       
        
        Thread.sleep(2000);
        totalTest++;
      String actualHeader =  driver.findElement(By.className("headerInside")).getText();
        System.out.println(actualHeader);
      if (actualHeader.contentEquals("Student Management System"))
      {
    	  System.out.println(totalTest+") Header test:");
          System.out.println("Test Passed \n");
      } 
      else 
      {
    	  System.out.println(totalTest+") Header test:");
          System.out.println("Test Failed \n");
      }
      
          Thread.sleep(2000);
      
          // home.jsp login
         WebElement usernameField = driver.findElement(By.name("username"));
         usernameField.sendKeys("admin");
         
         WebElement passwordField = driver.findElement(By.name("password"));
         passwordField.sendKeys("123");
         
         WebElement loginButton = driver.findElement(By.className("btn"));
         loginButton.click();
         
          Thread.sleep(2000);
          totalTest++;
          // In admin.jsp
          System.out.println(totalTest+") Login test:");
          System.out.println("Test Passed \n");
          WebElement createButton = driver.findElement(By.name("create"));
          createButton.click(); 
          
          Thread.sleep(2000);
          totalTest++;

          // In create.jsp
          System.out.println(totalTest+") Buton click test:");
          System.out.println("Test Passed \n");
          WebElement nameField = driver.findElement(By.name("username"));
          nameField.sendKeys("Abc");
          
          WebElement rollNumberField = driver.findElement(By.name("rollNumber"));
          rollNumberField.sendKeys("24");
          
          WebElement phoneNumberField = driver.findElement(By.name("phoneno"));
          phoneNumberField.sendKeys("9921496778");
          
          WebElement branchField = driver.findElement(By.name("branch"));
          branchField.sendKeys("computer 2nd shift");
          
          WebElement yearField = driver.findElement(By.name("year"));
          yearField.sendKeys("4th");
          
          WebElement submitButton = driver.findElement(By.className("btn"));
          submitButton.click(); 
          Thread.sleep(2000);
          totalTest++;
          System.out.println(totalTest+") Record Create test:");
          System.out.println("Test Passed \n");
          
          //In admin.jsp
          totalTest++;
         
         
          WebElement searchButton = driver.findElement(By.name("search"));
          searchButton.click(); 
          System.out.println(totalTest+") Search button click test:");
          System.out.println("Test Passed \n");
       
          
          Thread.sleep(2000);
          
          // In search.jsp
          totalTest++;
          WebElement studentName = driver.findElement(By.name("name"));
          studentName.sendKeys("Abc");
          
          WebElement rollNumber = driver.findElement(By.name("rollNumber"));
          rollNumber.sendKeys("24");
          
          WebElement search = driver.findElement(By.className("btn"));
          search.click();
          System.out.println(totalTest+") Search test:");
          System.out.println("Test Passed \n");
          Thread.sleep(2000);
          //to close window of browser 
        driver.close();
	}
}
