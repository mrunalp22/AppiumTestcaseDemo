package scenarios;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import pages.Test_1;

public class AppiumTest{
    public static void main(String[] args)throws MalformedURLException, InterruptedException{

        AndroidSetup setup = new AndroidSetup();
        setup.prepareAndroidForAppium();
        System.out.println("appium started");
        setup.clickLetsPlay();
        System.out.println("test1 is running");

        /*Test_1 test = new Test_1();
        test.selendroid();
        System.out.println("Test1 is running");*/

    }
}
