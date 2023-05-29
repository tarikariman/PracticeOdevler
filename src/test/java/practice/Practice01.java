package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01 {

    public static void main(String[] args) {
        /*ODEV
    Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim.
    https://www.amazon.com/

    Sayfa basligini(title) yazdirin
    Sayfa basliginin “Amazon” icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url’inin “amazon” icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    Sayfayi kapatin.
     */

        System.setProperty("chromedriver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        System.out.println("Sayfa basligi" + driver.getTitle());

        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        System.out.println(driver.getCurrentUrl());

        if (driver.getCurrentUrl().contains("amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        System.out.println(driver.getWindowHandle());

        if (driver.getPageSource().contains("Gateway")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        driver.close();


    }


}
