package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericData {
	public static String GetData(String sheet, int row, int cell)
	{
		String value="";
		try
		{
			FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sh = book.getSheet(sheet);
			Row r = sh.getRow(row);
			Cell c = r.getCell(cell);
			value=c.toString();
		}
		catch (Exception e) {
			System.out.println(e);
		}
			return value;
		}
	}


