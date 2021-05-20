package week5.ass;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Base2 {
	
	public static ChromeDriver driver;
	public String excelFileName;
	
	@DataProvider
	public String[][] filedata() throws IOException {
		
		ReadExcel re = new ReadExcel();
		String[][] excelData = re.excelData("excelFileName");
		return excelData;
	}

}
