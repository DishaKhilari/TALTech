package starter.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.startBrowser.Baseclass;

public class ContactUs extends Baseclass {

    public void clickedOnContactUs(){
        driver.findElement(By.cssSelector(".logo > img")).click();
        driver.findElement(By.xpath("//*[text()='Contact us']")).click();
    }

    public void selectOptionAs(String label) throws InterruptedException {

        WebElement enquiry = driver.findElement(By.id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_5__Value"));
        enquiry.click();
        Thread.sleep(3000);
        enquiry.findElement(By.xpath("//option[. = '"+label+"']")).click();
    }

    public void enteredAllDetails(String name, String email, String phone, String enquiryDetails) throws InterruptedException {

        Thread.sleep(3000);

        WebElement eleName = driver.findElement(By.id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_0__Value"));
        eleName.click();
        eleName.clear();
        eleName.sendKeys(name);

        WebElement eleEmail = driver.findElement(By.id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_1__Value"));
        eleEmail.click();
        eleEmail.clear();
        eleEmail.sendKeys(email);

        WebElement elePhone = driver.findElement(By.id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_2__Value"));
        elePhone.click();
        elePhone.clear();
        elePhone.sendKeys(phone);

        WebElement eleEnqDetails = driver.findElement(By.id("wffm7bcebacf323c4981a33eab005b609b0f_Sections_0__Fields_6__Value"));
        eleEnqDetails.click();
        eleEnqDetails.clear();
        eleEnqDetails.sendKeys(enquiryDetails);

//        Baseclass.SwitchFrame(3);
//        driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
        Baseclass.DefaultContent();
        driver.findElement(By.cssSelector(".btn")).click();
    }
}
