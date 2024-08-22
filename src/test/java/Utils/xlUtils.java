package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class xlUtils {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Sheet ws;
	public static Row row;
	public static Cell cell;
	public static CellStyle style;


	public static int getRowCount(String xlfile,String xlsheet) throws IOException {
		fi = new FileInputStream(xlfile);
	wb= new XSSFWorkbook(fi);
     ws =	wb.getSheet(xlsheet);
   int rowcount = ws.getLastRowNum();
   fi.close();
   wb.close();
   return rowcount;
	
	}
	
	public static short getColumnCount(String xlfile,String xlsheet,int rownum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		short columncount= row.getLastCellNum();
		fi.close();
		wb.close();
		return columncount;
		
	}

public static String getStringCelldata(String xlfile,String xlsheet, int rownum,int column) throws IOException {
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws =wb.getSheet(xlsheet);
	row = ws.getRow(rownum);
	String data;
	try {
		cell =  row.getCell(column);
		data = cell.getStringCellValue();
	} catch (Exception e) {
		data = "";
	}
	fi.close();
	wb.close();
	return data;
	
	
}

public static double getIntCelldata(String xlfile,String xlsheet,int rownum,int column) throws IOException {
	fi= new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
row =  ws.getRow(rownum);
double data;
try {
	cell =row.getCell(column);
	data = cell.getNumericCellValue();
} catch (Exception e) {
	data = 0;
}
fi.close();
wb.close();
return data;
}
public static boolean  getBooleanCellData(String xlfile,String xlsheet, int rownum, int column) throws IOException {
	fi =new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
row = 	ws.getRow(rownum);
boolean data;
try {
	cell = row.getCell(column);
	data =cell.getBooleanCellValue();
} catch (Exception e) {
	data = false;	
}
fi.close();
wb.close();
return data;
	












}
public static void setCellData(String xlfile,String xlsheet, int rownum,int columnn,String data) throws IOException {
	
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws =wb.getSheet(xlsheet);
	row = ws.getRow(rownum);
	cell = row.createCell(columnn);
	cell.setCellValue(data);
	fo = new FileOutputStream(xlfile);
	wb.write(fo);
	
	fi.close();
	wb.close();
	fo.close();
	
	
	
}
public static void fillGreenColour(String xlfile,String xlsheet, int rowno,int columnno) throws IOException
{
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
	row = ws.getRow(rowno);
	cell = row.getCell(columnno);
	style = wb.createCellStyle();
	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	cell.setCellStyle(style);
	fo = new FileOutputStream(xlfile);
	wb.write(fo);
	fi.close();
	fo.close();
	wb.close();
}
public static void fillRedColor(String xlfile, String xlsheet, int rowno, int columno) throws IOException
{
	fi = new FileInputStream(xlfile);
wb = new XSSFWorkbook(fi);
ws = wb.getSheet(xlsheet);
row = ws.getRow(rowno);
row.getCell(columno);
style = wb.createCellStyle();
style.setFillForegroundColor(IndexedColors.RED.getIndex());
style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
cell.setCellStyle(style);
fo = new FileOutputStream(xlfile);
wb.write(fo);
fo.close();
wb.close();
fi.close();
}




}