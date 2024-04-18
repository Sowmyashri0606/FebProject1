package com.test;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;


	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.DataProvider;

	public class Dataprovider_GetExcelData{
			Object[][] data = null;
			
			@DataProvider(name = "testData")
			public Object[][] getExcelData(){
					
				try
						{
							File file = new File("C:\\Ec\\TestNG\\src\\test\\resources\\Data\\Ex.xlsx");
							FileInputStream fis = new FileInputStream(file);
							Workbook wb = new XSSFWorkbook(fis);
							Sheet sheet = wb.getSheet("Sheet1");
							int totalRows = sheet.getPhysicalNumberOfRows();
							Row row = sheet.getRow(0);
							int totalCellsPerRow = row.getPhysicalNumberOfCells();
							data = new Object[totalRows-1][totalCellsPerRow];
							Cell cell;

							for (int i = 1; i <totalRows; i++)
								{
									for (int j = 0; j < totalCellsPerRow; j++)
										{
											row = sheet.getRow(i);
											cell = row.getCell(j);
											data[i-1][j] = cell.getStringCellValue();
										}
								}
							wb.close();
						}
					catch (FileNotFoundException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					catch (IOException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					return data;
			}
		}

