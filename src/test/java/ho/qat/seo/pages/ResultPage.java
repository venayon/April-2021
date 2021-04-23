package ho.qat.seo.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;


public class ResultPage {

    @FindBy(xpath = "//*[@id=\"result-info\"]/div[2]/h2")
    WebElementFacade resultMessage;

    private String getResultMessage(){
       return resultMessage.getText();
    }

    public void confirmResultMessage(String expectedMessage){
        Assert.assertTrue(getResultMessage().equalsIgnoreCase(expectedMessage));
    }
}
