package ru.geekbrains.nedovesov.main.site.at.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BasePage closePopurBanner() {
        driver.findElement(By.xpath("//div/div/button[*]")).click();
        return this;
    }

    public BasePage waitLoadPage() {
        return this;
    }

    public BasePage checkHeader(String expected) {
        return this;
    }
}
