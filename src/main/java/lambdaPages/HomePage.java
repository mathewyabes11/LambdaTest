package lambdaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy (linkText = "Simple Form Demo")
    private WebElement simpleFormLink;

    @FindBy (linkText = "Drag & Drop Sliders")
    private WebElement dragAndDropLink;

    @FindBy(linkText = "Input Form Submit")
    private WebElement inputFormLink;

    public WebElement getDragAndDropLink() {
        return dragAndDropLink;
    }

    public void setDragAndDropLink(WebElement dragAndDropLink) {
        this.dragAndDropLink = dragAndDropLink;
    }

    public WebElement getInputFormLink() {
        return inputFormLink;
    }

    public void setInputFormLink(WebElement inputFormLink) {
        this.inputFormLink = inputFormLink;
    }

    public WebElement getSimpleFormLink() {
        return simpleFormLink;
    }

    public void setSimpleFormLink(WebElement simpleFormLink) {
        this.simpleFormLink = simpleFormLink;
    }
}
