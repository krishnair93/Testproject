package com.Qalegendproject.Utilities;

import java.io.File;
import java.io.FileInputStream;



import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class ExcelUtilities {

	
	public static Object[][] getDataFromExcel(String filePath,String sheetName )throws IOException,Exception,InvalidFormatException{
		
		Object[][] data;
		
		FileInputStream inputStream= new FileInputStream(new File(filePath));
	
		Workbook wb= WorkbookFactory.create(inputStream);
		Sheet s= wb.getSheet(sheetName);
	


		int rowCount = s.getLastRowNum();
		int colCount = s.getRow(0).getLastCellNum();  
		
		 data= new Object[rowCount][colCount];
		 for (int i=1;i<=rowCount;i++) {
			 
			 for (int j=0;j<=colCount-1;j++) {
				 
				 
				 if(!getCellValue(s,0,j).equals("")) {
					 
					 data[i-1][j]=getCellValue(s,i,j);
				 }
					 
				 }
			
			 }
		 
		 return data;
		 }
	
	private static String getCellValue(Sheet sheet,int row,int col) {
		String value =" ";
		if (sheet.getRow(row).getCell(col)==null)
		{
			value ="";
		}
		else if (sheet.getRow(row).getCell(col).getCellType()==Cell.CELL_TYPE_STRING) {
			
			value =sheet.getRow(row).getCell(col).getStringCellValue();
	
		
	}
		
		else
		{
			sheet.getRow(row).getCell(col).setCellType(Cell.CELL_TYPE_STRING) ;
				
				value =sheet.getRow(row).getCell(col).getStringCellValue();
		}
		return value;
	}
	

/*
	public static String getCellStringData(int Rownum, int ColNum) throws IOException
	{
	FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/excel"+"/Book1.xlsx");
	XSSFWorkbook w = new XSSFWorkbook(f);
	Sheet sh =w.getSheet("sheet1");
	return sh.getRow(Rownum).getCell(ColNum).getStringCellValue();
	

	}
	

	public static int getCellNumericData(int Rownum, int ColNum) throws IOException
	{
	FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/excel"+"/Book1.xlsx");
	XSSFWorkbook w = new XSSFWorkbook(f);
	Sheet sh =w.getSheet("sheet1");
	return (int)sh.getRow(Rownum).getCell(ColNum).getNumericCellValue();
	

	} */

}