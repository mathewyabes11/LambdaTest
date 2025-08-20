package lambda_TestCase;

import lambdaPages.DragAndDropPage;
import lambdaPages.HomePage;
import lambdaPages.InputFormPage;
import lambdaPages.SimpleFormPage;
import lambda_Base.Base;
import lambdatest.utils.Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class selenium_101_assignment extends Base {

    public WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public SimpleFormPage simpleFormPage;
    public DragAndDropPage dragAndDropPage;
    public InputFormPage inputFormPage;


    @BeforeMethod
    public void setup() {
        driver = initializeBrowserandLaunchApplicaionusingURL(prop.getProperty("browserName"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void scenario1() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        simpleFormPage = PageFactory.initElements(driver, SimpleFormPage.class);
        homePage.getSimpleFormLink().click();
        Assert.assertTrue(driver.getCurrentUrl().contains(dataProp.getProperty("URLValidation")));
        String s = dataProp.getProperty("message");
        simpleFormPage.getMessageTextField().sendKeys(s);
        simpleFormPage.getCheckValueButton().click();
        String actualMessage = simpleFormPage.getMessageBox().getText();
        Assert.assertEquals(actualMessage, s, "Displayed message is not correct");
    }

    @Test(priority = 2)
    public void scenario2() throws InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        dragAndDropPage = PageFactory.initElements(driver, DragAndDropPage.class);
        homePage.getDragAndDropLink().click();

        WebElement slider = dragAndDropPage.getSlider();
        WebElement output = dragAndDropPage.getSuccessNumber();

        Actions actions = new Actions(driver);

        int targetValue = 95;
        int currentValue = Integer.parseInt(output.getText());
        int step = targetValue - currentValue;

        for (int i = 0; i < step; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT); // you can use LEFT if needed
        }
        Thread.sleep(500);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(output, dataProp.getProperty("output")));
        Assert.assertEquals(output.getText(), dataProp.getProperty("output"), dataProp.getProperty("outputMessage"));

    }

    @Test(priority = 3)
    public void scenario3() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        inputFormPage = PageFactory.initElements(driver, InputFormPage.class);
        homePage.getInputFormLink().click();
        inputFormPage.getSubmitButton().click();
        WebElement nameField = inputFormPage.getNameTextField();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String validationMessage = (String) js.executeScript("return arguments[0].validationMessage;", nameField);
        System.out.println("Validation message" + validationMessage);
        inputFormPage.getNameTextField().sendKeys(dataProp.getProperty("userName"));
        inputFormPage.getEmailTextField().sendKeys(Utilities.generateTimeStamp());
        inputFormPage.getPasswordTextField().sendKeys(dataProp.getProperty("password"));
        inputFormPage.getCompanyTextField().sendKeys(dataProp.getProperty("companyName"));
        inputFormPage.getWebSiteTextField().sendKeys(dataProp.getProperty("website"));
        Select countrySelect = new Select(inputFormPage.getCountryDropdown());
        countrySelect.selectByVisibleText(dataProp.getProperty("country"));
        inputFormPage.getCityTextField().sendKeys(dataProp.getProperty("city"));
        inputFormPage.getAddress1TextField().sendKeys(dataProp.getProperty("address1"));
        inputFormPage.getAddress2TextField().sendKeys(dataProp.getProperty("address2"));
        inputFormPage.getStateTextField().sendKeys(dataProp.getProperty("state"));
        inputFormPage.getPostelCodeTextField().sendKeys(dataProp.getProperty("pinCode"));
        inputFormPage.getSubmitButton().click();
        WebElement successMsg = inputFormPage.getSuccessMessage();
        Assert.assertTrue(successMsg.isDisplayed(), "Success message should be displayed after submission.");
    }
}
