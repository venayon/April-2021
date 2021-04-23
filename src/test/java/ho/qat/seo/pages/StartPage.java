package ho.qat.seo.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;

@DefaultUrl("https://www.gov.uk/employee-immigration-employment-status")
public class StartPage extends PageObject {

        @FindBy(css = "#get-started > a")
        private WebElementFacade startNowButton;

        public void clickStartNow(){
            clickOn(startNowButton);
        }

}
