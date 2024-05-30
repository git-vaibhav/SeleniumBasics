package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.setProperty("webdriver.chrome.driver","/Users/vaibhav/Downloads/chromedriver-mac-arm64/chromedriver" );
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin");
        WebDriver driver = new ChromeDriver();
        driver.get("https://stackoverflow.com/questions/76477186/selenium-not-requiring-chromedriver");
        System.out.println(driver.getTitle());

        int[] arr = new int[2];
        arr[0] = 1;
        arr[1]= 2;


        Thread.sleep(10000);

        driver.close();

//Invoking Browser


    }
}