package LinkCxO2.O.Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	 public Workbook workbook;
	    public Sheet sheet;

	    public ExcelUtils(String filePath, String sheetName) throws IOException {
	        FileInputStream fileInputStream = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(fileInputStream);
	        sheet = workbook.getSheet(sheetName);
	    }

	    public String getCellData(int rowNum, int colNum) {
	        Row row = sheet.getRow(rowNum);
	        Cell cell = row.getCell(colNum);
	        return cell.getStringCellValue();
	    }

	    public void close() throws IOException {
	        workbook.close();
	    }
	

}
