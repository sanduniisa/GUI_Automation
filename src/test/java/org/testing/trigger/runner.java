package org.testing.trigger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class runner {

	public static void main(String[] args) throws BiffException, IOException {
		XmlSuite xS = new XmlSuite(); // suite object

		xS.setName("Suite1"); // name set

		XmlTest xT = new XmlTest(xS); // test object

		//File f = new File("/Users/sanduniisa/Documents/testCases.xls");
		File f = new File("../GUIAutomation/testCases.xls");// excel file connection

		Workbook wk = Workbook.getWorkbook(f); // workbook object
		Sheet s = wk.getSheet(0); // sheet object

		int rows = s.getRows(); // fetch the number of rows

		ArrayList<XmlClass> al1 = new ArrayList<XmlClass>(); // storing values for xml class object
		// loop for checking the status and fetch the package name and class name

		for (int i = 1; i < rows; i++) { // starting loop from 1 because 0th row is including headers

			Cell c = s.getCell(4, i);
			if (c.getContents().equals("Y")) {
				Cell packageName = s.getCell(2, i);
				Cell className = s.getCell(3, i);

				String v = packageName.getContents() + "." + className.getContents();
				// storing packagename.class name for a
				// string value

				System.out.println("Adding class: " + v);

				XmlClass c1 = new XmlClass(v); // xml object class

				al1.add(c1);// storing xml class object in the array list

			}
		}

		System.out.println(al1.size());
		xT.setClasses(al1);
		ArrayList<XmlTest> al2 = new ArrayList<XmlTest>();

		al2.add(xT);
		xS.setTests(al2);

		ArrayList<XmlSuite> al3 = new ArrayList<XmlSuite>();
		al3.add(xS);

		TestNG t = new TestNG();
		t.setXmlSuites(al3);
		t.run();

	}

}
