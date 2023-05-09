using System.Collections.Generic;
using System.Linq;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Interactions;

namespace TalTechWebUIAutomation.PageObjects
{
    internal class MainPage : BasePage
    {
        public MainPage(IWebDriver driver) : base(driver)
        {
        }

        public static By PageLocator => By.CssSelector("#header > div.cf > div > div.c-logo > a > img");

        private IEnumerable<IWebElement> NavigationLinks =>
            Driver.FindElements(By.ClassName("nav-cf"));

        public IWebElement ActiveNavigationMenuItems(string link) =>
            Driver.FindElement(By.XPath("//a[contains(text(), "+link+")]"));

        private IWebElement ButtonClickDiv(string buttonName) =>
            Driver.FindElement(By.XPath("//button//span[text()='"+buttonName+"']"));

        private IWebElement ButtonClick(string buttonName) =>
            Driver.FindElement(By.XPath("//button[text()='"+buttonName+"']"));

        private IWebElement SubmitbuttonClick(string buttonName) =>
            Driver.FindElement(By.XPath("//input[@value='"+buttonName+"']"));

        private IWebElement SuccessMessage() =>
            Driver.FindElement(By.XPath("//h1[@class='article-header__heading']"));

        public bool? IsLinkPresentOnTheHeader(string linkText)
        {
            return NavigationLinks.First(navLink => navLink.Text.Trim() == linkText).Displayed;
        }

        public void SubmitButton(string buttonName)
        {
            SubmitbuttonClick(buttonName).Click();
        }
        public void ClickButtonDiv(string buttonName)
        {
            ButtonClickDiv(buttonName).Click();
        }

        public void ClickButton(string buttonName)
        {
            ButtonClick(buttonName).Click();
        }

        public void SuccessMessage(string message)
        {
            Assert.AreEqual(message, SuccessMessage().Text);
        }
        public void HoverOverTheNavigationMenu(string navLink)
        {
            Actions action = new Actions(Driver);

            var navigationItem = NavigationLinks.First(nav => nav.Text.Trim() == navLink);

            action.MoveToElement(navigationItem).Perform();
        }

        public void ClickNavigationMenuItem(string link)
        {
            ActiveNavigationMenuItems(link).Click();
        }
    }
}