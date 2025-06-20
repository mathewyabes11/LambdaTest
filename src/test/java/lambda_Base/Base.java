package lambda_Base;

import lambdatest.utils.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;


import java.io.File;
import java.io.FileInputStream;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

public class Base {
    WebDriver driver;
    public Properties prop;
    public Properties dataProp;

    public Base() {
        prop = new Properties();
        File propfile = new File(
                System.getProperty("user.dir") + "\\src\\main\\java\\lambda\\config\\Config.properties");
        try {
            FileInputStream fis = new FileInputStream(propfile);
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }

        dataProp = new Properties();
        File dataPropFile = new File(System.getProperty("user.dir")
                + "\\src\\main\\java\\lambdaTestdata\\TestData.properties");
        try {
            FileInputStream datafis = new FileInputStream(dataPropFile);
            dataProp.load(datafis);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public WebDriver initializeBrowserandLaunchApplicaionusingURL(String browserName) {
        browserName = prop.getProperty("browserName");
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.get(prop.getProperty("url"));

        return driver;
    }
}
