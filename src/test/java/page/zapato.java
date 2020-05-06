package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class zapato extends Base {

    By sZapato = By.cssSelector("#gh-ac");
    By cZapato = By.xpath("//input[@id='gh-btn']");


    public zapato(WebDriver driver) {
        super(driver);
    }
    public void escogerzapato() {
        type("shoes",sZapato);

    }
    public void btnZapato(){
        click(cZapato);
    }




}
