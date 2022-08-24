package com.EducationalDomain.Wipro.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import com.mysql.cj.jdbc.Driver;

/**
 * 
 * @author Bharani
 *
 */
public class FileUtilies  {
	public static Connection con;
	/**
	 * It is used to read the data from propertyfile
	 * 
	 * @param key
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */

	public String getPropertyFile(String key) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(AutoConstant.datapropertyfile));
		return p.getProperty(key);

	}
	
	/**
	 * To read the data from ExcelSheet
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

//	public String getExcelfile(String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException {
//		FileInputStream fis = new FileInputStream(AutoConstant.excelfilepath);
//		Workbook wb = WorkbookFactory.create(fis);
//		return wb.getSheet("SheetName").getRow(rownum).getCell(cellnum).getStringCellValue();
//
//	}
//	@DataProvider
//	public Object[][] readExceldata() throws EncryptedDocumentException, IOException {
//		FileInputStream fis=new FileInputStream(AutoConstant.excelfilepath);
//	Workbook wb = WorkbookFactory.create(fis);
//	Sheet sh = wb.getSheet("Sheet1");
//	int rownum = sh.getLastRowNum();
//	short cellnum = sh.getRow(1).getLastCellNum();
//	
//	Object obj[][]=new Object[rownum][cellnum];
//	for(int i=0;i<rownum;i++) {
//		for(int j=0;j<cellnum;j++) {
//		sh.getRow(i+1).getCell(j).getStringCellValue();
//		System.out.println(obj[i][j]);
//	}
//	}
//	return obj;
//	}
	/**
	 * It is used to read the data from database
	 * @return
	 * @throws SQLException
	 */
	
	public static Connection getDataDb() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		return con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root",
				"root");
	}
	/**
	 * To execute the query
	 * @param query
	 * @param column
	 * @param Expecteddata
	 * @return
	 * @throws SQLException
	 */
	public static String queryExecution(String query,int column,String Expecteddata) throws SQLException {
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		while(result.next()) {
			if(result.getString(column).equals(Expecteddata)) {
				break;
			}
			else
			{
				Reporter.log("Data found",true);
			}
		}
		return Expecteddata;
	
	}
	/**
	 * Close the database connection
	 * @throws SQLException
	 */
	public static void closedb() throws SQLException {
		con.close();
	}
}
