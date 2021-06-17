package seleniumpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// file and fileinputstream

		File f = new File("D:\\AAA\\Mytestbook.xlsx");//file select

		FileInputStream fis = new FileInputStream(f);//file read

		XSSFWorkbook workbook = new XSSFWorkbook(fis);//workbook

		XSSFSheet sheet = workbook.getSheetAt(0);//sheet getsheetat or getsheer

		int noofrows = sheet.getPhysicalNumberOfRows();
		System.out.println(noofrows);
		
		
		for(int i=1;i<noofrows;i++) {
			
			XSSFRow row=sheet.getRow(i);
			
			int cells=row.getLastCellNum();
			for(int j=0;j<cells;j++) {
				
				XSSFCell cell = row.getCell(j);
				
				System.out.println(cell.getStringCellValue());
				//cell type
				//null pointer exception
				
				if(cell.getCellType()==CellType.STRING) {
					System.out.println(row.getCell(j).getStringCellValue());
				} else if(cell.getCellType()==CellType.NUMERIC) {
					System.out.println(row.getCell(j).getNumericCellValue());
					
				}else if(cell.getCellType()==CellType.BLANK || cell==null) {
					//
					
				}
				
				
				if(j==1)
				if(row.getCell(2)==null || row.getCell(2).getCellType()==CellType.BLANK) {
					row.createCell(2);
					row.getCell(2).setCellValue("yes");
				}else {
					row.getCell(2).setCellValue("NO");
					
				}
				
			}
			
			
			
		}
		
		FileOutputStream fos =new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		

	}

}
