package lambdaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleFormPage {

    @FindBy(id = "user-message")
    private WebElement messageTextField;

    @FindBy(id = "showInput")
    private WebElement checkValueButton;

    @FindBy(id = "message")
    private WebElement messageBox;

    public WebElement getMessageTextField() {
        return messageTextField;
    }

    public void setMessageTextField(WebElement messageTextField) {
        this.messageTextField = messageTextField;
    }

    public WebElement getCheckValueButton() {
        return checkValueButton;
    }

    public void setCheckValueButton(WebElement checkValueButton) {
        this.checkValueButton = checkValueButton;
    }

    public WebElement getMessageBox() {
        return messageBox;
    }

    public void setMessageBox(WebElement messageBox) {
        this.messageBox = messageBox;
    }
}
