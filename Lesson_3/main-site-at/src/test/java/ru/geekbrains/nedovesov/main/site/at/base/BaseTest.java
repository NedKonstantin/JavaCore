package ru.geekbrains.nedovesov.main.site.at.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;
    protected final String BASE_URL = "https://geekbrains.ru";
    protected final String CAREER_LINK = "/career";
    protected final String TESTS_LINK = "/tests";
    protected final String COURSES_LINK = "/courses";
    protected final String EVENTS_LINK = "/events";
    protected final String TOPICS_LINK = "/topics";
    protected final String POSTS_LINK = "/posts";

    protected void closePopurBanner() {
        driver.findElement(By.xpath("//div/div/button[*]")).click();
    }

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();

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
