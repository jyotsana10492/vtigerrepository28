package com.autod.crms.genericlib;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class FileLib {
	
public String getPropKeyVal(String path,String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		
		String propval = prop.getProperty(key,"key not found");
		return propval;
	}
	
	
	public String getExcelData(String path,String sheet,int r,int c) throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	
	String cellval = wb.getSheet(sheet).getRow(r).getCell(c).toString();
	return cellval;		
	}
	
	
	public void setExcelData(String path,String sheet,int r,int c,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
		
		
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		
	}
	
	
	public int countRow(String path,String sheet) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
	
	public int countCol(String path,String sheet,int r) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		int colCount = wb.getSheet(sheet).getRow(r).getLastCellNum();
		return colCount;
	}
	
}


