package starter.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.startBrowser.Baseclass;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class ContactUs extends Baseclass {

    public void clickedOnContactUs(){
        driver.findElement(cssSelector(".logo > img")).click();
        driver.findElement(By.xpath("//*[text()='Contact us']")).click();
    }

    public void selectOptionAs(String label) throws InterruptedException {

        waitForElementToBeClickable(driver, id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_5__Value"), 10000);
        WebElement enquiry = driver.findElement(id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_5__Value"));
        enquiry.click();
        Thread.sleep(3000);
        enquiry.findElement(By.xpath("//option[. = '"+label+"']")).click();
    }

    public void enteredAllDetails(String name, String email, String phone, String enquiryDetails) throws InterruptedException {

        Thread.sleep(3000);

        waitForElementToBeClickable(driver, id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_0__Value"), 10000);
        WebElement eleName = driver.findElement(id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_0__Value"));
        eleName.click();
        eleName.clear();
        eleName.sendKeys(name);

        waitForElementToBeClickable(driver, id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_1__Value"), 10000);
        WebElement eleEmail = driver.findElement(id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_1__Value"));
        eleEmail.click();
        eleEmail.clear();
        eleEmail.sendKeys(email);

        waitForElementToBeClickable(driver, id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_2__Value"), 10000);
        WebElement elePhone = driver.findElement(id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_2__Value"));
        elePhone.click();
        elePhone.clear();
        elePhone.sendKeys(phone);

        waitForElementToBeClickable(driver, id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_6__Value"), 10000);
        WebElement eleEnqDetails = driver.findElement(id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_6__Value"));
        eleEnqDetails.click();
        eleEnqDetails.clear();
        eleEnqDetails.sendKeys(enquiryDetails);

//        Baseclass.SwitchFrame(3);
//        driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
        Baseclass.DefaultContent();
        waitForElementToBeClickable(driver, cssSelector(".btn"), 10000);
        driver.findElement(cssSelector(".btn")).click();
    }
}
