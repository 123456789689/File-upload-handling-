package HandleFileuploadPopup.Fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileuploadHandle {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver d = new FirefoxDriver();

		d.get("https://html.com/input-type-file/");

		d.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\mourya.s\\Desktop\\download LLR.pdf");
		//While uploading file should not use click() method, always use .sendkeys method

	}

}
