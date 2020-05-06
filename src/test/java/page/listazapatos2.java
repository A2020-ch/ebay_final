package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class listazapatos2 extends Base {

    WebDriver driver;

    By mylist = By.tagName("li");


    public listazapatos2(WebDriver driver) {
        super(driver);
    }

    public String listaZapatos() {
        List<WebElement> newlist = findElements(mylist);
        for(int i =0 ; i<6 ; i++) {
            System.out.println(getText(newlist.get(i)));
        }
        return getText(newlist.get(1));


    }




}
