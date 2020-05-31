package ru.geekbrains.nedovesov.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class SearchTest extends BaseTest {

    @Test
    void searchJavaTest() {
        // Переменная для хранения количества профессий, курсов, вебинаров и т.д.
        int volumeItem;
        // Переменная для сравнения
        boolean whichVolumeItem;
        // Открываем страницу с курсами
        driver.get(BASE_URL + "/courses");
        // Закрываем баннер
//        driver.findElement(By.xpath("//div/div/button[*]"));

        WebElement searchButton = driver.findElement(By.cssSelector("ul > li > .show-search-form"));
        searchButton.click();

        WebElement searchInput = driver.findElement(By.cssSelector(".search-panel__search-field"));
        searchInput.sendKeys("java");
        // В после отправки поискового запроса, нужно дождаться прогрузки страницы.
        // Попробуем использовать явные ожидания. Будем ждать до тех пор, пока панель, на которой расположены
        //  нужные нам элементы не будет прогружена.

        // Создаем экземпляр класса WebDriverWait, в конструктор передаем текущий экземпляр драйвера
        // и количество секунд, которое нужно ждать.
        WebDriverWait wait = new WebDriverWait(driver, 15);
        // передаем в него условие - ждать до тех пор, пока элемент с указанным CSS селектором не появится на экране
        // если ожидание затянется более чем на 15 секунд - тест упадет.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs")));

        // Мы нашли первую интересующую нас плашку.
        WebElement professionsTab = driver
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='professions']"));
        // Давайте проверим, что она видна пользователю.
        Assertions.assertTrue(professionsTab.isDisplayed());
        volumeItem = Integer.parseInt(driver
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='professions'] > span")).getText());
        whichVolumeItem = volumeItem >= 2;
        Assertions.assertTrue(whichVolumeItem);

        // С остальными элементами поступим по аналогии
        WebElement coursesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='courses']"));
        Assertions.assertTrue(coursesTab.isDisplayed());
        volumeItem = Integer.parseInt(driver
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='courses'] > span")).getText());
        whichVolumeItem = volumeItem > 15;
        Assertions.assertTrue(whichVolumeItem);

        WebElement webinarsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='webinars']"));
        Assertions.assertTrue(webinarsTab.isDisplayed());
        volumeItem = Integer.parseInt(driver
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='webinars'] > span")).getText());
        whichVolumeItem = 180 < volumeItem && volumeItem < 300;
        Assertions.assertTrue(whichVolumeItem);

        WebElement blogsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='blogs']"));
        Assertions.assertTrue(blogsTab.isDisplayed());
        volumeItem = Integer.parseInt(driver
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='blogs'] > span")).getText());
        whichVolumeItem = volumeItem > 300;
        Assertions.assertTrue(whichVolumeItem);

        WebElement forumsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='forums']"));
        Assertions.assertTrue(forumsTab.isDisplayed());
        volumeItem = Integer.parseInt(driver
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='forums'] > span")).getText());
        whichVolumeItem = volumeItem != 350;
        Assertions.assertTrue(whichVolumeItem);

        WebElement testsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='tests']"));
        Assertions.assertTrue(testsTab.isDisplayed());
        volumeItem = Integer.parseInt(driver
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='tests'] > span")).getText());
        whichVolumeItem = volumeItem != 0;
        Assertions.assertTrue(whichVolumeItem);

        WebElement companiesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='companies']"));
        Assertions.assertTrue(companiesTab.isDisplayed());
        volumeItem = Integer.parseInt(driver
                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='companies'] > span")).getText());
        whichVolumeItem = volumeItem != 0;
        Assertions.assertTrue(whichVolumeItem);

    }
}
