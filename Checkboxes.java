package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.sql.SQLOutput;

public class Checkboxes {
    public static void main(String[] args) {
       // System.setProperty("","");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        WebElement input=driver.findElement(By.id("email"));
        //input.sendKeys("somemeail@somemail.com"+ Keys.ENTER);
        input.sendKeys("somemeail@somemail.com");
        input.submit();

        String expected="Your e-mail's been sent!";
        String actual=driver.findElement(By.id("content")).getText();
        System.out.println(actual);
        if(actual.equals(expected)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
            System.out.println("actual = "+actual);
            System.out.println("expected = "+expected);
        }


    }
}
