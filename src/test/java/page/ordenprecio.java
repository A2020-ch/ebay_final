package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ordenprecio extends Base {

    By cOrdenar = By.cssSelector("#s0-13-11-5-1\\[0\\]-42-0 > button");
    By eOrdenar =By.linkText("Precio + Envío: más bajo primero");

    public ordenprecio(WebDriver driver) {
        super(driver);
    }

    public void clickOrdenar(){
        click(cOrdenar);
    }
    public void escogerOrden(){

        click(eOrdenar);
    }
}
