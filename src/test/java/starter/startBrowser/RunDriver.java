package starter.startBrowser;

public class RunDriver extends Baseclass{

    public void setUp(String URL) throws InterruptedException {
        Baseclass.openbrowser("Firefox");
        if (!options.setHeadless(true).is(String.valueOf(true)))
        {
            Baseclass.maximize();
        }
        Baseclass.deletecookies();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofDays(40000)); //calculated as milliseconds
        Baseclass.SiteURL(URL);
        Thread.sleep(5000);
    }

}