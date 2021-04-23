package ho.qat.seo.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class ReasonForTravelPage extends PageObject {

    WebElementFacade reasonToSelect;

    @FindBy(css = "#current-question > button")
    private WebElementFacade nextStepButton;


    public void selectReasonForVisit(String reason){
        String selector = String.join("","div[value='", reason.toLowerCase(), "']");
        reasonToSelect = find(By.cssSelector(selector));
        clickOn(reasonToSelect);
    }

    public void clickNextStepButton(){
        clickOn(nextStepButton);
    }

}


