package ru.geekbrains.nedovesov.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPage extends BasePage {
    @FindBy(className = "gb-header__title")
    private WebElement pageHeader;

    @FindBy(css = "input.form-control[type='email']")
    private WebElement emailField;

    @FindBy(css = "input.form-control[type='password']")
    private WebElement passwordField;

    @FindBy(css = "input.btn")
    private WebElement inputButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage waitLoadPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.form-control[type='email']")));
        return this;
    }

    @Override
    @Step("Проверка заголовка {expected}")
    public LoginPage checkHeader(String expected) {
        assertEquals(expected, pageHeader.getText());
        return this;
    }

    @Step("Ввод e-mail и пароля")
    public Page enterLoginData(String emailAdress, String password){
        emailField.sendKeys(emailAdress);
        passwordField.sendKeys(password);
        inputButton.click();
        return new Page(driver);
    }
}
