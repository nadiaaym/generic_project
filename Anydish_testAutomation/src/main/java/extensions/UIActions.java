package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

public class UIActions extends CommonOps {
    public static void click(WebElement elem){
       // wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    public static void updateText(WebElement elem, String text){
        elem.sendKeys(text);
    }

    public static void UpdateDropDown(WebElement elem, String text){
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }
}
