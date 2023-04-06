package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {
    public void initBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome"))
            initChromedriver();
        else if (browserType.equalsIgnoreCase("firefox")) {
            initFirefoxDriver();
        } else if (browserType.equalsIgnoreCase("ie")) {
            initIEDriver();
        } else
            throw new RuntimeException("invalid browser type");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(URL);
        ManagePages.initPractitionerApp();
    }

    public static WebDriver initChromedriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOption);
        return driver;
    }

    public static WebDriver initFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initIEDriver() {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }
    @BeforeClass
    public void startSession() {
        String platform ="web";
       // if (platform.equalsIgnoreCase("web"))
            initBrowser("chrome");
     //   else if (platform.equalsIgnoreCase("mobile"))
       //     initMobile;
       // else
         //   throw new RuntimeException("invalid platform name");
    }

    @AfterClass
    public void closeSession()
    {
        driver.quit();
    }

    @Test
    public void test1(){

    }
    
}
