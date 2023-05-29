package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice05 {
    /*
        ODEV
        Yeni bir class olusturalim (Homework)
        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
        https://www.walmart.com/sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
         */
    public static void main(String[] args) {


        System.setProperty("chromedriver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com");

        if (driver.getTitle().contains("facebook")){
            System.out.println("Test PASSED");
        }else System.out.println(driver.getTitle());

        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Test PASSED");
        }else System.out.println(driver.getCurrentUrl());

        driver.get("https://www.walmart.com/");

        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Test PASSED");
        }else System.out.println(driver.getTitle());

        driver.navigate().back();

        driver.navigate().refresh();

        driver.manage().window().maximize();

        driver.close();



    }
}
