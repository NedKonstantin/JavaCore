package ru.geekbrains.nedovesov.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Page extends BasePage {

    @FindBy(className = "gb-header__title")
    private WebElement pageHeader;

    private NavigationTab navigationTab;
    private CoursesPage coursesPage;

    public Page(WebDriver driver) {
        super(driver);
        navigationTab = new NavigationTab(driver);
        coursesPage = new CoursesPage(driver);
    }

    @Override
    public Page waitLoadPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".gb-header__title")));
        return this;
    }

    @Override
    @Step("Проверка заголовка")
    public Page checkHeader(String expected) {
        assertEquals(expected, pageHeader.getText());
        return this;
    }

    public NavigationTab getNavigationTab() {
        return navigationTab;
    }

    public CoursesPage getCoursesPage() {
        return coursesPage;
    }
}
