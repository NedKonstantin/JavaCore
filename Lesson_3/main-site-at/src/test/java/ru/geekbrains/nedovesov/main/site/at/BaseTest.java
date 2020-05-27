package ru.geekbrains.nedovesov.main.site.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

abstract class BaseTest {
    WebDriver driver;
    final String BASE_URL = "https://geekbrains.ru";
    final String CAREER_LINK = "/career";
    final String TESTS_LINK = "/tests";
    final String COURSES_LINK = "/courses";
    final String EVENTS_LINK = "/events";
    final String TOPICS_LINK = "/topics";
    final String POSTS_LINK = "/posts";

    void closePopurBanner(){
        driver.findElement(By.xpath("//div/div/button[*]")).click();
    }

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
