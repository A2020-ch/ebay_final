package test;


import base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.*;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class test  {

    private  WebDriver driver;
    zapato test1;
    marca test2;
    talla test3;
    ordenprecio test4;
    cantidadresultado test5;
    listazapatos2 test6;




    @BeforeClass
    public void setUp() {

        test1 = new zapato(driver);
        test2 = new marca(driver);
        test3 = new talla(driver);
        test4 = new ordenprecio(driver);
        test5 = new cantidadresultado(driver);
        test6 = new listazapatos2(driver);
        driver=test1.ChromeDriverConnection();
        test1.visit("https://www.ebay.com/");
        driver.manage().window().maximize();


    }



    @Test
    public void buscarzapato() {

        test1.escogerzapato();
        test1.btnZapato();

    }

    @Test (dependsOnMethods = "buscarzapato")
    public void ingresandomarca() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        test2.marcaPuma();

    }

    @Test (dependsOnMethods = "ingresandomarca")
    public void escogetalla(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        test3.clickTalla();
    }

    @Test (dependsOnMethods = "escogetalla")
    public void preciomasbajo(){
        test4.clickOrdenar();
        test4.escogerOrden();
    }

    @Test (dependsOnMethods = "preciomasbajo")
    public void cantzapatos(){
        test5.totalzapatos();
    }

    @Test (dependsOnMethods = "cantzapatos")
    public void listarzapatos() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        test6.listaZapatos();


    }
}
