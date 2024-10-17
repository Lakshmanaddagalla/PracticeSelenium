package day1;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataIntoExcelFile {

    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\data1.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Sheet1");
        XSSFRow rows1 = sheet.createRow(0);
        rows1.createCell(0).setCellValue("Name");
        rows1.createCell(1).setCellValue("Age");
        rows1.createCell(2).setCellValue("Height");


        XSSFRow rows2 = sheet.createRow(1);
        rows2.createCell(0).setCellValue("Lakshman");
        rows2.createCell(1).setCellValue("24");
        rows2.createCell(2).setCellValue("5.6");

        XSSFRow rows3 = sheet.createRow(2);
        rows3.createCell(0).setCellValue("Mammu");
        rows3.createCell(1).setCellValue("24");
        rows3.createCell(2).setCellValue("5.3");

        XSSFRow rows4 = sheet.createRow(3);
        rows4.createCell(0).setCellValue("Gayathri");
        rows4.createCell(1).setCellValue("24");
        rows4.createCell(2).setCellValue("5.5");


        workbook.write(file);

        workbook.close();
        file.close();
    }
}
