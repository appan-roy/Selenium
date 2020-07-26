package killWindowsProcessDemo;

import org.openqa.selenium.os.WindowsUtils;

public class KillUnusedDrivers {

	public static void main(String[] args) {
		
		WindowsUtils.killByName("chromedriver.exe");
		
		WindowsUtils.killByName("chrome.exe");

	}

}
