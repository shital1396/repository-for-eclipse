package testngex;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Excel  {
	@Test(dataProvider = "dp")
	public void f(String  email, String password) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();



	}

	@DataProvider
	public Object[][] dp() throws Exception {
		FileInputStream fis = new FileInputStream("Book2.xls");
		Workbook wb =Workbook .getWorkbook(fis); 
		Sheet sh=  wb.getSheet("Sheet1");
		int row =sh.getRows();
		int col =sh.getColumns();
		String b [][] = new String [row][col];
		for(int i =0 ;i<row;i++){
			for(int j=0;j<col;j++){
				Cell cl = sh.getCell(j, i);
				String data=cl.getContents();
				System.out.println(data);
				b[i][j]=data;
			}

		}
		return b;



	}

};


