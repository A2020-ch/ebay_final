package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class marca extends Base {

    By mPuma = By.xpath("/html[1]/body[1]/div[4]/div[4]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/div[2]/ul[1]/li[8]/div[1]/a[1]/div[1]/div[1]/span[1]");


    public marca(WebDriver driver) {
        super(driver);
    }

    public void marcaPuma() {
        click(mPuma);

    }






}
