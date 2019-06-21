import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Automation Testing");
		System.out.println("AutoBuild progress");

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");

//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("---start-maximized");
		WebDriver driver = new ChromeDriver();

//driver.manage().window().maximize();

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

	}

}
