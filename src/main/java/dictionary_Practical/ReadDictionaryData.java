package dictionary_Practical;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDictionaryData {

	public String path;
	public FileInputStream fis = null;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	public int rows;
	public int colms;
	
	
	public ReadDictionaryData(String path) {
		this.path = path;
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			rows = sheet.getLastRowNum();
			colms = sheet.getRow(1).getLastCellNum();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//Using For loop
	public void getData() {
		for(int r = 0; r<rows; r++) {
			row = sheet.getRow(r);
			
			for (int c = 0; c <colms; c++) {	
				cell = row.getCell(c);
				System.out.println(cell.getStringCellValue());
			}
		System.out.println();
		}
	}
	
	
// Using Iterator
	
	public void getDataUsingIterator() {	
		Iterator iterator =sheet.iterator();
		
		while(iterator.hasNext()) {	
			row = (XSSFRow) iterator.next();
			Iterator cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext()) {
				cell = (XSSFCell) cellIterator.next();
				System.out.println(cell.getStringCellValue());
			}
			System.out.println();
		}
		
		
	}
	
	
}
