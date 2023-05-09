package starter.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.startBrowser.Baseclass;

public class LifeInsuranceProduct extends Baseclass {


    public void i_click_on_insurance_and_select_life_insurance() {
        driver.findElement(By.linkText("Insurance Products")).click();
        driver.findElement(By.linkText("Life Insurance")).click();

    }

    public void click_on_get_quote_button() {
        // 5 | click | css=.btn-holder:nth-child(2) > .button--tertiary |
        driver.findElement(By.cssSelector(".btn-holder:nth-child(2) > .button--tertiary")).click();
    }

    public void details_are_entered() {
        WebElement Dob = driver.findElement(By.name("dateOfBirth"));
        Dob.click(); // name=dateOfBirth | 1207199393
        Dob.sendKeys("1207199393");

        // Select Gender
        driver.findElement(By.xpath("//div/div[2]/div/label")).click();
        // Select if you smoke
        driver.findElement(By.xpath("//div[3]/div[2]/div/div/div[2]/div/label")).click();

        WebElement Occupation = driver.findElement(By.name("occupation"));
        Occupation.click(); // Computer - Analyst / Consultant / Programmer - University qualified
        Occupation.sendKeys("Computer - Analyst / Consultant / Programmer - University qualified");
        Occupation.click();

        WebElement AnnualIncome = driver.findElement(By.name("annualIncome"));
        AnnualIncome.click();// AnnualIncome > 130000
        AnnualIncome.sendKeys("130000");

        // click button
        driver.findElement(By.name("continue")).click();

        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.click();
        firstName.sendKeys("dishali");

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.click();
        lastName.sendKeys("khilari");

        WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
        phoneNumber.click();
        phoneNumber.sendKeys("0412309837");

        WebElement emailAddress = driver.findElement(By.name("emailAddress"));
        emailAddress.click();
        emailAddress.sendKeys("dishali.khilari12@gmail.com");

        WebElement postCode = driver.findElement(By.name("postcode"));
        postCode.click();
        postCode.sendKeys("2061");
    }

    public void click_get_my_quote_button_and_submit() {
        // 25 | click | name=submit |
        driver.findElement(By.name("submit")).click();

    }

    public void review_quote_details() throws InterruptedException {
        Thread.sleep(5000);
        // name=Life Insurance Plan > click
        driver.findElement(By.name("Life Insurance Plan")).click();
        // name=coverAmount > click
        WebElement coverAmount = driver.findElement(By.name("coverAmount"));
        coverAmount.sendKeys("1,500,000");
        driver.findElement(By.name("ChevronUp")).click();
        Thread.sleep(5000);
        coverAmount.click();


    }

    public void click_apply_now() {
        // 32 | mouseOver | name=TPD Insurance Plan |
        driver.findElement(By.cssSelector("h5.tal-gel-v2owhe")).getText();
    }
}
