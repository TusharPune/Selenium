package com.day1;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataproviderDemo {




	
	@Test(dataProvider="getdata")
	public void test1(String firstName,String lastName){
	System.out.println(firstName+lastName);	
	}
		

	@DataProvider (name = "getdata")
	
	public static Object[][] getdata() throws IOException {
			
		String FilePath = "C:\\Users\\tushar.patil\\workspace\\Conversion\\Input_Data\\Test.xlsx";
		// C:\Users\tushar.patil\workspace\Conversion\Input_Data\Input_file_path.xlsx
		
		//Reading excel file 
		FileInputStream ExcelFile = new FileInputStream(FilePath);

		// Will get the workbook instance for XLS and takes excel file to read
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(ExcelFile);
		
		// Will get xls sheet
		XSSFSheet ExcelWSheet = workbook.getSheet("Sheet1");

		int rownum=ExcelWSheet.getLastRowNum() + 1;			//Total rows
		int colnum=ExcelWSheet.getRow(0).getLastCellNum();	//Total Columns
		
		Object[][]data=new Object[rownum][colnum];	 //Object to get values from cell		
		
		for (int i=0;i<rownum;i++) {
			
			for (int j=0; j<=1;j++){
				data[i][j] =ExcelWSheet.getRow(i).getCell(j).getStringCellValue();				
			}
		}
		return data;
}

	

}