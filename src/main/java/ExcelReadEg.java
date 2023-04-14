import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadEg {
     	
      public XSSFSheet sh;
		
		public ExcelReadEg() throws IOException {
			FileInputStream f= new FileInputStream("D:\\excel_sheet for java\\Book1.xlsx");
			//FileInputStream f= new FileInputStream("C:\\Users\\User\\Desktop\\ExcelFileRead.xlsx");

			XSSFWorkbook w= new XSSFWorkbook(f);
			sh= w.getSheet("Sheet1");
			
		}
		
		public String readData(int i, int j) {
			Row r= sh.getRow(i);
			Cell c= r.getCell(j); //Import Cell of apache poi not Table
			int celltype=c.getCellType();
			switch(celltype) 
			{
			case Cell.CELL_TYPE_NUMERIC:
			{
				double a=c.getNumericCellValue();
				return String.valueOf(a);
			}
			case Cell.CELL_TYPE_STRING:
			{
				return c.getStringCellValue();
			}
			}
			return null; 
			
		}

}


