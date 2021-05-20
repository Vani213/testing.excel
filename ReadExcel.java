package week5.ass;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] excelData(String DPExcel) throws IOException {

		
        XSSFWorkbook wb = new XSSFWorkbook("target/DPExcel.xlsx");
        
        XSSFSheet ws = wb.getSheet("Sheet1");
        int rowCount = ws.getLastRowNum(); // Excluding the first row
       
        short cellCount = ws.getRow(0).getLastCellNum();
        
        String[][] data = new String[rowCount][cellCount];
        
        for (int i = 1; i <= rowCount; i++) { //rows
            
            for (int j = 0; j < cellCount; j++) {
                            
                String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
                data[i-1][j] = cellValue;
            }
        
        }
        return data;
                
        //Close the workbook

	}
}

	

