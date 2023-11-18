package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Demo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager driver=new ChromeDriverManager();

	}

}
