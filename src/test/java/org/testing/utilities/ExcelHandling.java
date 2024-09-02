package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExcelHandling {

	
	//write this by reading
	public static void readParticularCel(int rowNo, int columnNo) throws IOException {
		
		File file = new File("../SDETProject/Sanduni");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader =new BufferedReader(fileReader);
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row number you want to read: ");
        rowNo = scanner.nextInt();
        System.out.println("Enter the column number you want to read: ");
        columnNo = scanner.nextInt();

        int currentRow = 0;
        String line;

        // Read through the file line by line
        while ((line = bufferedReader.readLine()) != null) {
            if (currentRow == rowNo) {
                String[] cells = line.split(","); // Assuming CSV format, cells separated by commas
                if (columnNo < cells.length) {
                    System.out.println("Data at row " + rowNo + ", column " + columnNo + ": " + cells[columnNo]);
                } else {
                    System.out.println("Column number out of range.");
                }
                break;
            }
            currentRow++;
        }

        if (line == null) {
            System.out.println("Row number out of range.");
        }

        // Close resources
        bufferedReader.close();
        fileReader.close();
        scanner.close();
    }
		

	

	public static void readParticularRow(int rowNo) throws IOException {

		File file = new File("../SDETProject/Sanduni");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		System.out.println("Enter the row number you want to read   :  ");
		Scanner scanner = new Scanner(System.in);
		rowNo = scanner.nextInt();

		int currentRow = 0;

		String lineString;

		while ((lineString = bufferedReader.readLine()) != null) {

			if (currentRow == rowNo) {

				System.out.println("Data at row no " + rowNo + ":" + lineString);
				break;
			}
			currentRow++;

		}
		if (lineString == null) {
			System.out.println("Row number out of range.");
		}

		bufferedReader.close();
		fileReader.close();
	}

	public static void readRangeData(int initialRow, int endRow) throws IOException {
		
		File file = new File("../SDETProject/SanduniImalsha");
		FileReader fileReader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(fileReader);
		
		System.out.println("Enter the inital row number");
		Scanner scanner1 = new Scanner(System.in);
		initialRow = scanner1.nextInt();
		
		System.out.println("Enter the end row number");
		Scanner scanner2 = new Scanner(System.in);
		endRow = scanner2.nextInt();
		
		
		
		for (int i = initialRow; i<= endRow; i++) {
			   
			   System.out.println( bReader.readLine());
				
			}
		

	}
}
