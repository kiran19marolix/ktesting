package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
    File file = new File ("./target/datafromexcel.xlsx");
    FileInputStream stream = new FileInputStream(file);
    XSSFWorkbook workbook = new XSSFWorkbook(stream);
    XSSFSheet sheet = workbook.getSheetAt(0);
    int rows = sheet.getPhysicalNumberOfRows();
    int cells = sheet.getRow(1).getLastCellNum();
    sheet.getRow(1).getLastCellNum();
    for(int i=0;i<rows;i++) {
    for(int j=0;j<cells;j++) {
    	DataFormatter df = new DataFormatter();
    	System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
    	
    	
    }
    }
	}

}
