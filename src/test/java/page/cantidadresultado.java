package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cantidadresultado extends Base {

    By cResultado =By.cssSelector("h1.srp-controls__count-heading");

    public cantidadresultado(WebDriver driver) {
        super(driver);
    }

    public void totalzapatos(){
        getText(cResultado);

    }
}
