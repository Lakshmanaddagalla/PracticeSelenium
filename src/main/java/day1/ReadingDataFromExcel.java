package day1;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class    ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data1.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheetAt(0);

        int numberOfRows = sheet.getLastRowNum();

        int numberOfCells = sheet.getRow(2).getLastCellNum();

        System.out.println("number of rows: " + numberOfRows);
        System.out.println("number of cells: " + numberOfCells);

        for (int r = 0; r < numberOfRows; r++) {

            XSSFRow row = sheet.getRow(r);

            for (int c = 0; c < numberOfCells; c++) {
                XSSFCell cell = row.getCell(c);

                System.out.print(cell.toString() + ("\t"));
            }
            System.out.println();

        }
        workbook.close();
        file.close();
    }
}
