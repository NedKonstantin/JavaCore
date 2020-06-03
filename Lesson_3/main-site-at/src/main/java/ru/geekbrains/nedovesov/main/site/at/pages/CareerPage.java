package ru.geekbrains.nedovesov.main.site.at.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;


public class CareerPage extends BasePage {

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='professions']")
    WebElement professionsTab;

    private NavigationForSearch navigationForSearch;

    public CareerPage(WebDriver driver) {
        super(driver);
        navigationForSearch = new NavigationForSearch(driver);
    }

    public CareerPage checkProfessionsTab() {
        int volumeItem = Integer.parseInt(professionsTab
                .findElement(By.cssSelector("li > a.search-page-tabs__item[data-tab='professions'] > span"))
                .getText());
        assertThat(volumeItem, greaterThanOrEqualTo(2));
        return this;
    }
}
