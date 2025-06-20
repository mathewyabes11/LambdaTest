package lambdaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage {

    @FindBy(xpath = "//div[@id='slider3']//input")
    private WebElement slider;

    @FindBy(id = "rangeSuccess")
    private WebElement successNumber;

    public WebElement getSlider() {
        return slider;
    }

    public void setSlider(WebElement slider) {
        this.slider = slider;
    }

    public WebElement getSuccessNumber() {
        return successNumber;
    }

    public void setSuccessNumber(WebElement successNumber) {
        this.successNumber = successNumber;
    }
}
