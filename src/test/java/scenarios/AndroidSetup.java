package scenarios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AndroidSetup {
    protected AndroidDriver driver;
    AppiumDriverLocalService appiumService;
    WebDriver dr;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("C:\\Users\\Admin\\IdeaProjects\\InditionAlerts\\apps");
        File app = new File(appDir, "dream.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","69fb901f");

        //mandatory capabilities
        capabilities.setCapability("deviceName","redmi_note7_pro");
        capabilities.setCapability("platformName","Android");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
       // driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver =  new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    public void clickLetsPlay(){
        System.out.println("test started");
        String app_package_name = "com.app.dream11Pro:id/";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button\n")).click();
        //By letsplay_id = By.id(app_package_name+"f2a99a43-18d2-4077-af21-d8a6bfa5274b");
        //driver.findElement(letsplay_id).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }



}
