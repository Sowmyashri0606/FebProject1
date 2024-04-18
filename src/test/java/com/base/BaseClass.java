package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
	public static String excelRead(int a, int b) {
		String value = null;
		try {
			FileInputStream fis = new FileInputStream(new File ("C:\\Ec\\TestNG\\src\\test\\resources\\Data\\Ex.xlsx"));
			Workbook wk = new XSSFWorkbook(fis);
			Sheet sheet = wk.getSheet("Sheet1");
			Row r = sheet.getRow(a);
			Cell c = r.getCell(b);
			CellType cellType = c.getCellType();
			if (cellType ==CellType.STRING) {
				value = c.getStringCellValue();
			}else if (cellType ==CellType.NUMERIC) {
				if (DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
					value = sf.format(dateCellValue);
				}else {
				double numericCellValue = c.getNumericCellValue();
				long numericValue = (long) numericCellValue;
				value = String.valueOf(numericValue);
				}
			}
	     }
		    catch(FileNotFoundException e ) {
		    e.printStackTrace();
	       }
		    catch(IOException e) {
		    	e.printStackTrace();
		    }
		return value;
	}
}
