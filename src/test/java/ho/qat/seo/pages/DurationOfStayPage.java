package ho.qat.seo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DurationOfStayPage extends PageObject {

    @FindBy(css = "#current-question > button")
    private WebElementFacade nextStepButton;

    @FindBy(xpath = "//label[@for='response-0']")
    private WebElementFacade lessThanSixMonths;

    @FindBy(xpath = "//label[@for='response-1']")
    private WebElementFacade moreThanSixMonths;

    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "more":
                clickOn(moreThanSixMonths);
                break;
            case "less":
                clickOn(lessThanSixMonths);
                break;
            default:
                break;
        }
    }

    public void clickNextStepButton(){
        nextStepButton.waitUntilEnabled().click();
    }
}
