package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class talla extends Base {

    By cTalla = By.cssSelector("input[aria-label = '10']");


    public talla(WebDriver driver) {
        super(driver);
    }

    public void clickTalla() {
        click(cTalla);
    }
}
