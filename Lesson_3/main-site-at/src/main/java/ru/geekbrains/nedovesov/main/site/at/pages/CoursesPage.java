package ru.geekbrains.nedovesov.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoursesPage extends BasePage {

    private Filtres filtres;
    private Selection selection;

    @FindBy(css = "a.text-dark-dk[href='#cour-new']")
    private WebElement coursesSearchTab;


    @Override
    public CoursesPage waitLoadPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group")));
        return this;
    }

    public CoursesPage(WebDriver driver) {
        super(driver);
        filtres = new Filtres(driver);
        selection = new Selection(driver);
    }

    @Step("Переход на нужную закладку")
    public CoursesPage clickCoursesSearchTab(){
        coursesSearchTab.click();
        return this;
    }

    public Filtres getFiltres(){
        return filtres;
    }

    public Selection getSelection(){
        return selection;
    }

}
