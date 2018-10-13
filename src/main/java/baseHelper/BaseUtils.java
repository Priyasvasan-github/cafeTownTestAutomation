package baseHelper;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

/**
 * Created by Sripriya Srinivasan on 10/12/2018.
 */
public class BaseUtils extends PageObject {

    /*
     * This Method enters data into Text field
     */
    public void enterTextInto(WebElement webElement, String text){
        webElement.clear();
        webElement.sendKeys(text);
    }

    /*
     * This Method makes element to wait till element is Displayed
     * Helps avoiding Stale Element exception
     */
    public void waitForElementToBeStable(WebElement webElement){
        for(int waitCount=1;waitCount<6;waitCount++){
            try{
                waitFor(webElement);
            }catch(Exception e){
                //just created a wait loop where an element will be searched for 30 seconds after page is renderred
            }

        }
    }

    /**
     * This method verifies if any alert is displayed
     * @return
     */
    public boolean isAlertPresent(){
        try{
            Alert alert = this.getAlert();
            return true;
        } catch(NoAlertPresentException ex){
            return false;
        }
    }
}
