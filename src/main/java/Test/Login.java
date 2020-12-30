package Test;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MiHCM.LoginPage;
import MiHCM.OntimeShortLeave;

    public class Login {

 

       public static WebDriver driver;
       LoginPage objLogin;
       OntimeShortLeave objOntimeShortLeave;

 
       @Test(priority=0)

 

        public void test_Home_Page_Appear_Correct()
       {
         System.setProperty("webdriver.chrome.driver","C:\\seldrv\\chromedriver.exe");
                   
     //   WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa.mihcm.com");
        //Create Login Page object
        objLogin = new LoginPage(driver);

 
        objLogin.logintoHCM("nilmie.gamhewa@gmail.com", "Admin@1234");
        
       }

       @Test(priority=1)
       public void DirecttoMenuOntimeLeaveEntry()
       {
    	   objOntimeShortLeave=new OntimeShortLeave(driver);
    	   objOntimeShortLeave.DirecttoMenuOntimeLeaveEntry();

   	    try {
   	    	objOntimeShortLeave.DirecttoMenuOntimeLeaveEntry();
   	    }
	    catch (Exception e) {
			e.printStackTrace();
		}
        //objOntimeLeave.DirecttoMenuOntimeLeaveEntry(driver);
        //Assert.assertTrue(objOntimeLeave.toLowerCase().contains("guru99 bank"));
        
       }
       @Test(priority=2)
       public void EnterOntimeLeave()
       {
    	   
    	   objOntimeShortLeave= new OntimeShortLeave(driver);
       	
     //  driver.close();
     //  driver.quit();
    }
   }