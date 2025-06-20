package lambdaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputFormPage {

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement submitButton;

    @FindBy(id = "name")
    private WebElement nameTextField;

    @FindBy(id = "inputEmail4")
    private WebElement emailTextField;

    @FindBy(id = "inputPassword4")
    private WebElement passwordTextField;

    @FindBy(id = "company")
    private WebElement companyTextField;

    @FindBy(id = "websitename")
    private WebElement WebSiteTextField;

    @FindBy(name = "country")
    private WebElement countryDropdown;

    @FindBy(id = "inputCity")
    private WebElement cityTextField;

    @FindBy(id = "inputAddress1")
    private WebElement address1TextField;

    @FindBy(id = "inputAddress2")
    private WebElement address2TextField;

    @FindBy(id = "inputState")
    private WebElement stateTextField;

    @FindBy(id = "inputZip")
    private WebElement postelCodeTextField;

    @FindBy(xpath = "//h2[text()='Input form validations']")
    private  WebElement successMessage;

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(WebElement successMessage) {
        this.successMessage = successMessage;
    }

    public WebElement getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(WebElement nameTextField) {
        this.nameTextField = nameTextField;
    }

    public WebElement getEmailTextField() {
        return emailTextField;
    }

    public void setEmailTextField(WebElement emailTextField) {
        this.emailTextField = emailTextField;
    }

    public WebElement getPasswordTextField() {
        return passwordTextField;
    }

    public void setPasswordTextField(WebElement passwordTextField) {
        this.passwordTextField = passwordTextField;
    }

    public WebElement getCompanyTextField() {
        return companyTextField;
    }

    public void setCompanyTextField(WebElement companyTextField) {
        this.companyTextField = companyTextField;
    }

    public WebElement getWebSiteTextField() {
        return WebSiteTextField;
    }

    public void setWebSiteTextField(WebElement webSiteTextField) {
        WebSiteTextField = webSiteTextField;
    }

    public WebElement getCountryDropdown() {
        return countryDropdown;
    }

    public void setCountryDropdown(WebElement countryDropdown) {
        this.countryDropdown = countryDropdown;
    }

    public WebElement getCityTextField() {
        return cityTextField;
    }

    public void setCityTextField(WebElement cityTextField) {
        this.cityTextField = cityTextField;
    }

    public WebElement getAddress1TextField() {
        return address1TextField;
    }

    public void setAddress1TextField(WebElement address1TextField) {
        this.address1TextField = address1TextField;
    }

    public WebElement getAddress2TextField() {
        return address2TextField;
    }

    public void setAddress2TextField(WebElement address2TextField) {
        this.address2TextField = address2TextField;
    }

    public WebElement getStateTextField() {
        return stateTextField;
    }

    public void setStateTextField(WebElement stateTextField) {
        this.stateTextField = stateTextField;
    }

    public WebElement getPostelCodeTextField() {
        return postelCodeTextField;
    }

    public void setPostelCodeTextField(WebElement postelCodeTextField) {
        this.postelCodeTextField = postelCodeTextField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(WebElement submitButton) {
        this.submitButton = submitButton;
    }
}
