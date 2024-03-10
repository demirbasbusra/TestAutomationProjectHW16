package tests;

import common.QAHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTablesPageTest extends BaseTest{
    @BeforeMethod
    public void before(){
        pageManager.webTablesPage.open();
    }
    @Test
    public void addAndEditOperation(){

        pageManager.webTablesPage.addButton.click();
        pageManager.webTablesPage.firstName.sendKeys("Büşra");
        pageManager.webTablesPage.lastName.sendKeys("Demirbaş");
        pageManager.webTablesPage.email.sendKeys("demirbas@gmail.com");
        pageManager.webTablesPage.age.sendKeys("26");
        pageManager.webTablesPage.salary.sendKeys("100000");
        pageManager.webTablesPage.department.sendKeys("IT / TEST");
        pageManager.webTablesPage.btnSubmit.click();

        QAHelper.pause();

        pageManager.webTablesPage.editItem.click();
        pageManager.webTablesPage.searchBox.clear();
        pageManager.webTablesPage.firstName.clear();
        pageManager.webTablesPage.firstName.sendKeys("ELMAS");
        pageManager.webTablesPage.lastName.clear();
        pageManager.webTablesPage.lastName.sendKeys("DEMİRBAŞ");
        pageManager.webTablesPage.email.clear();
        pageManager.webTablesPage.email.sendKeys("ELMAS@gmail.com");
        pageManager.webTablesPage.age.clear();
        pageManager.webTablesPage.age.sendKeys("56");
        pageManager.webTablesPage.salary.clear();
        pageManager.webTablesPage.salary.sendKeys("2000000");
        pageManager.webTablesPage.department.clear();
        pageManager.webTablesPage.department.sendKeys("HOUSE WIFE :)");
        pageManager.webTablesPage.btnSubmit.click();
        QAHelper.pause();
    }
}