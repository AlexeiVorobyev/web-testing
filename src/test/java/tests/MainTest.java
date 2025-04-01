package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void testFirst() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");

        WebElement loginField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));

        loginField.sendKeys("ivan_shchetkin_zarya");
        passwordField.sendKeys("spokesilver0711");

        WebElement SubmitButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/section/main/article/div[2]/div[1]/div[2]/div/form/div[1]/div[3]/button"));

        SubmitButton.click();

        driver.quit();

    }

}
