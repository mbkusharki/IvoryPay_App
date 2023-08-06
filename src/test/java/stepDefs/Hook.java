package stepDefs;

<<<<<<< HEAD
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import ivorypay.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil
{
    private BaseUtil base;
    public Hook(BaseUtil base)
    {
        this.base = base;
    }
    @Before
    public void initialize()
    {
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();
    }
=======
public class Hook
{

>>>>>>> origin/master
}
