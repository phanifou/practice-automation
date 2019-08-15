package com.automation.practice.others;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.*;

public class ExcelDataProvider {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static void main(String...strings) throws Exception {
		openExcel("C:\\Users\\IBM_ADMIN\\Desktop\\Book1.xlsx");
		getSheet();
		String[][] abc = (String[][])getDataAry();
		
		//System.out.println(abc);
		System.out.println(Arrays.deepToString(abc));
		
	}
public	static void openExcel(String path) throws IOException{
		if(path!=null&&path!="")
		{
			InputStream fis = new FileInputStream(new File(path));
		 workbook= new XSSFWorkbook(fis);
		}
		
	}
	
public 	static void getSheet() throws Exception
	{
		sheet = workbook.getSheetAt(0);
	}
	
	public static String getCellData(int rowNum,int colNum)  throws Exception{
			cell =sheet.getRow(rowNum).getCell(colNum);
			return cell.toString();
			}
	
	public static Object[][] getDataAry() throws Exception{
		
		
		int startRow =1;
		int startCol =0;
		int ci,cj;
		int totalRows = sheet.getLastRowNum();
		int totalCols =2;
		String [][] dataArry = new String [totalRows][totalCols];
		ci=0;
		for(int i=startRow;i<=totalRows;i++,ci++) {
			
			cj=0;
			for(int j=startCol;j<totalCols;j++,cj++) {
			dataArry[ci][cj]=getCellData(i,j); 
			System.out.println(dataArry[ci][cj]);
			}
				
		}
		
		
		return dataArry;
		
	}  
	
}
