// Matric Number    : 240842
// Name             : Nur Diyana binti Zaidi
// Course           : STIW3054 RealTime Programming
// Task             : Asignment 1
// Submission Date  : 18/03/2018
package com.mycompany.rtasignment1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author Diyana
 */
public class ReadDataExcel {

    public void readFile() throws IOException, InvalidFormatException {
        Workbook workbook = WorkbookFactory.create(new File("C:/Users/User/Documents/ListStudent.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            DataFormatter dataFormatter = new DataFormatter();

            // Iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t | \t");

            }
            System.out.println();

        }
    }
}
