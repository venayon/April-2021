package ho.qat.seo.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.chrome.ChromeDriver;


@DefaultUrl("https://www.gov.uk.uk/check-uk-visa") // TODO FIXED VENU
public class StartPage extends PageObject {


    public StartPage() {
        super(new ChromeDriver());
    }

    @FindBy(css = "#get-started > a")
        private WebElementFacade startNowButton;

        public void clickStartNow(){
            clickOn(startNowButton);
        }

}
