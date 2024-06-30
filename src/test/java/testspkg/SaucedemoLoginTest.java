package testspkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import basepkg.baseclass;
import pagepkg.SaucedemoLoginPage;
import utilitipkg.Excelutils;



public class SaucedemoLoginTest extends baseclass {
	@Test
	public void verifyLoginWithValidCred() throws InterruptedException  {
		SaucedemoLoginPage f=new SaucedemoLoginPage (driver);
		String xl="C:\\\\Users\\\\LENOVO PC\\\\Pictures\\\\iocode machinetest1.xlsx";
		String sheet="Sheet4";
		int row=Excelutils.getRowCount(xl,sheet);
		System.out.println(row);
		for(int i=1;i<=row;i++) {
			String UserName=Excelutils.getCellValue(xl,sheet,i,0);
			System.out.println("username="+UserName);
			String password=Excelutils.getCellValue(xl,sheet,i,1);
			System.out.println("password="+password);
			Thread.sleep(1000);
			
			f.setvalues(UserName,password);
			
			f.loginClick();
		}
	}	
}

	
