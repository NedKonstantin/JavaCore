package ru.geekbrains.nedovesov.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Filtres extends BasePage {

    public Filtres(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 20);

    @FindBy(css = "li > div > label")
    private List<WebElement> checkBoxSelection;

    @Step("Выбор чекбокса")
    public CoursesPage chooseCheckBox(String checkBoxTitle) {
        for (WebElement webElement : checkBoxSelection) {
            if (webElement.getText().equals(checkBoxTitle)) {
                webElement.click();
                break;
            }
        }
        return new CoursesPage(driver);
    }
}
