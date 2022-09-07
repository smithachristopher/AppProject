package testNG;

import Driver.BaseClass;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CategoriesPage;
import pages.DashboardPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownTest extends BaseClass {

    @Test(priority = 2)
    public void selectFromDropdown() {

        DashboardPage dashboardPage = new DashboardPage();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        try{
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOf(dashboardPage.stratergy)).click();

        }
        catch (ElementNotVisibleException e)
        {
            System.out.println("element not found"+e);
        }


        CategoriesPage categoriesPage=new CategoriesPage();

        Select select= new Select(categoriesPage.categories);
        select.selectByVisibleText("Issues");

    }
    }

