package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import scenarios.AndroidSetup;
import scenarios.AppiumTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;



public class Test_1 extends AndroidSetup{
    public void selendroid(){
        System.out.println("test started");
        String app_package_name = "com.app.dream11Pro";
        By letsplay_id = By.id(app_package_name+"97362f04-7b8a-4547-9b5a-17af18d8049e");
        driver.findElement(letsplay_id).click();

    }
}
