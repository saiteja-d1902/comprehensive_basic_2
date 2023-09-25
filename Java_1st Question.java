
package com.comprehensive;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment1 {

    public static void main(String[] args) throws IOException {
        // Read the data from the Excel sheet
        Workbook workbook = new XSSFWorkbook(new FileInputStream("C:\\Intel\\Eclipse Java 2023-03-R\\eclipse\\AmazonTesting\\src\\test\\resources\\data.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);

        // Create a collection to store the data
         Collection<Student> students = new ArrayList<Student>();
        // Iterate over the rows in the Excel sheet
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);

            // Create a new student object
            Student student = new Student();

            // Get the student's name from the Excel sheet
            Cell nameCell = row.getCell(0);
            student.setName(nameCell.getStringCellValue());

            // Get the student's courses from the Excel sheet
            Cell coursesCell = row.getCell(1);
            student.setCourses(coursesCell.getStringCellValue());

            // Get the student's fee from the Excel sheet
            Cell feeCell = row.getCell(2);
            student.setFee(feeCell.getStringCellValue());

            // Add the student to the collection
            students.add(student);
        }

        // Close the workbook
        workbook.close();

        // Display the data in the console
        for (Student student : students) {
            System.out.println(student);
        }
    }

public static class Student {
    private String name;
    private String courses;
    private String fee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses='" + courses + '\'' +
                ", fee='" + fee + '\'' +
                '}';
    }
}
}
