package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();

	       //Open the URL in firefox browser
	       driver.get("https://www.google.co.in/");

	       //Maximize the Browser window
	       driver.manage().window().maximize();

	       //Get the current page URL and store the value in variable 'str'
	       String str = driver.getCurrentUrl();

	       //Print the value of variable in the console
	       System.out.println("The current URL is " + str);

	}

}
