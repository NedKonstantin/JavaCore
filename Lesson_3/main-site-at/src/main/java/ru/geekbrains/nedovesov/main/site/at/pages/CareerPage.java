package ru.geekbrains.nedovesov.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class CareerPage extends BasePage {

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='professions']")
    private WebElement professionsTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='courses']")
    private WebElement coursesTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='webinars']")
    private WebElement webinarsTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='blogs']")
    private WebElement blogsTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='forums']")
    private WebElement forumsTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='tests']")
    private WebElement testsTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='companies']")
    private WebElement companiesTab;

    private NavigationForSearch navigationForSearch;

    private int volumeItem;

    public CareerPage(WebDriver driver) {
        super(driver);
        navigationForSearch = new NavigationForSearch(driver);
    }

    @Step
    public CareerPage checkProfessionsTab() {
        volumeItem = Integer.parseInt(professionsTab
                .findElement(By.cssSelector("li > a.search-page-tabs__item[data-tab='professions'] > span"))
                .getText());
        assertThat(volumeItem, greaterThanOrEqualTo(2));
        return this;
    }

    @Step
    public CareerPage checkCoursesTab() {
        volumeItem = Integer.parseInt(coursesTab
                .findElement(By.cssSelector("li > a.search-page-tabs__item[data-tab='courses'] > span"))
                .getText());
        assertThat(volumeItem, greaterThan(15));
        return this;
    }

    @Step
    public CareerPage checkWebinarsTab() {
        volumeItem = Integer.parseInt(webinarsTab
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='webinars'] > span"))
                .getText());
        assertThat(volumeItem, allOf(greaterThan(180), lessThan(300)));
        return this;
    }

    @Step
    public CareerPage checkBlogsTab() {
        volumeItem = Integer.parseInt(blogsTab
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='blogs'] > span"))
                .getText());
        assertThat(volumeItem, greaterThan(300));
        return this;
    }

    @Step
    public CareerPage checkForumsTab() {
        volumeItem = Integer.parseInt(forumsTab
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='forums'] > span"))
                .getText());
        assertThat(volumeItem, not(300));
        return this;
    }

    @Step
    public CareerPage checkTestsTab() {
        volumeItem = Integer.parseInt(testsTab
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='tests'] > span"))
                .getText());
        assertThat(volumeItem, not(0));
        return this;
    }

    @Step
    public CareerPage checkCompaniesTab() {
        volumeItem = Integer.parseInt(companiesTab
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='companies'] > span"))
                .getText());
        assertThat(volumeItem, not(0));
        return this;
    }
}
