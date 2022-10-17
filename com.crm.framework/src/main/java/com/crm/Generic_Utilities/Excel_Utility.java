package com.crm.Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	public String getDataFromExcel(String sheetName, int RowNum, int cellNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Book3.xlsx");
		Workbook book = WorkbookFactory.create(fis);
//		Sheet sh = book.getSheet(sheetName);
//		Row row = sh.getRow(RowNum);
//		Cell cel = row.getCell(cellNum);
//		String value = cel.getStringCellValue();
		DataFormatter format = new DataFormatter();
		return format.formatCellValue(book.getSheet(sheetName).getRow(RowNum).getCell(cellNum));
	}

}
