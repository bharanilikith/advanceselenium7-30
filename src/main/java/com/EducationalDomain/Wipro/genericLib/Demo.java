package com.EducationalDomain.Wipro.genericLib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Demo extends BaseClass{
	
	@DataProvider
	public Object[][] readExceldata() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(AutoConstant.excelfilepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	int rownum = sh.getLastRowNum();
	short cellnum = sh.getRow(1).getLastCellNum();
	
	Object obj[][]=new Object[rownum][cellnum];
	for(int i=0;i<rownum;i++) {
		for(int j=0;j<cellnum;j++) {
		obj[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
		System.out.println(obj[i][j]);
	}
	}
	return obj;
	}
}
