package ru.geekbrains.nedovesov.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Selection extends BasePage {

    @FindBy(css = "span.gb-course-card__title-text")
    private List<WebElement> coursesSelection;

    @Step("Проверка наличия курса")
    public CoursesPage checkSelection(String expected) {
        boolean available = false;
        for (WebElement webElement : coursesSelection) {
            if (expected.equals(webElement.getText())) {
                available = true;
                break;
            }
        }
        assertTrue(available);
        return new CoursesPage(driver);
    }

    public Selection(WebDriver driver) {
        super(driver);
    }
}
