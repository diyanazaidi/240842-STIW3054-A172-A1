// Matric Number    : 240842
// Name             : Nur Diyana binti Zaidi
// Course           : STIW3054 RealTime Programming
// Task             : Asignment 1
// Submission Date  : 18/03/2018
package com.mycompany.rtasignment1;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Diyana
 */
public class Asignment1 {

    public static void main(String[] args) throws IOException, InvalidFormatException {
        ReadDataExcel rd = new ReadDataExcel();
        rd.readFile();

        readExcelWriteMD t1 = new readExcelWriteMD();
        t1.readData();

        gitHub g1 = new gitHub();
        g1.runTerminal();
    }
}
