package ho.qat.seo.stepDefinitions;

import org.openqa.selenium.WebDriver;


public class BaseStep {

	protected WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/webdrivers/mac/chromedriver");
	}
/*
	static {
		String osname = System.getProperty("os.name").toLowerCase();
		if (osname.contains("mac")) {
			System.out.println("Found Chrome Driver for MAC");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driverFiles/chromedriver");
		} else if (osname.contains("win")) { //TODO -  fixme with resource file path
			System.out.println("Found Chrome Driver for WINDOWS");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driverFiles/chromedriver");

		}
	}*/
	public BaseStep(){

		//this.driver = new ChromeDriver();
	}
	
}
