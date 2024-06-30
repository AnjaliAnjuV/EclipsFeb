package testspkg;

import org.testng.annotations.Test;

import basepkg.baseclass;
import pagepkg.CheckoutYourInformationPage;
import utilitipkg.Excelutils;

public class CheckoutYourInformationTest extends baseclass{
	@Test
	public void test() throws InterruptedException  {
		CheckoutYourInformationPage f=new CheckoutYourInformationPage(driver);
		String xl="C:\\\\Users\\\\LENOVO PC\\\\Pictures\\\\iocode machinetest1.xlsx";
		String sheet="Sheet4";
		int row=Excelutils.getRowCount(xl,sheet);
		System.out.println(row);
		for(int i=1;i<=row;i++) {
			String FirstName=Excelutils.getCellValue(xl,sheet,i,2);
			System.out.println("firstname="+FirstName);
			String LastName=Excelutils.getCellValue(xl,sheet,i,3);
			System.out.println("lastname="+LastName);
			String ZipCode=Excelutils.getCellValue(xl,sheet,i,4);
			System.out.println("zipcode="+ ZipCode);
			Thread.sleep(1000);
			f.setvalues(FirstName, LastName,ZipCode);
		}
			
		}
}	


