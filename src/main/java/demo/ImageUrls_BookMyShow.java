package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class ImageUrls_BookMyShow {
    ChromeDriver driver;
    
    public ImageUrls_BookMyShow()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        
        //Open URL  https://in.bookmyshow.com/explore/home/chennai
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        Thread.sleep(70000);
        //Locate all the image URL of "Recommended Movies" Using Locator "XPath" //div[@class='sc-lnhrs7-4 bmyqGC']//img or //h2[text()='Recommended Movies']/../../../../../div/div[2]/div/div//img
        List<WebElement> allImageUrls=driver.findElementsByXPath("//div[@class='sc-lnhrs7-4 bmyqGC']//img");
        //Print image URLs for all the “Recommended Movies”   Using getAttribute("src")
        for(WebElement url: allImageUrls)
        { 
            System.out.println("Image URLs for all the “Recommended Movies "+url.getAttribute("src"));
        }
        //Print the  2nd item Name in the “Premiere” list Using Locator "XPath" //div[@class='sc-lnhrs7-4 bwyuwR']/div[2]//div[3]/div[1]/div
        WebElement name=driver.findElementByXPath("//div[@class='sc-lnhrs7-4 bwyuwR']/div[2]//div[3]/div[1]/div");
        System.out.println("Name:"+name.getText());
       // Print the 2nd item language in the “Premiere” list Using Locator "XPath" //div[@class='sc-lnhrs7-4 bwyuwR']/div[2]//div[3]/div[2]/div
        WebElement language=driver.findElementByXPath("//div[@class='sc-lnhrs7-4 bwyuwR']/div[2]//div[3]/div[2]/div");
        System.out.println("Language:"+language.getText());
        System.out.println("end Test case: testCase01");
     
    }


}