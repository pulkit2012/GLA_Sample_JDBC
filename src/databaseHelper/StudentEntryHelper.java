/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 06/12/19
 *   Time: 12:09 AM
 */

package databaseHelper;

import data.Student;

import java.sql.Connection;

public class StudentEntryHelper {
    /*
     * We are going to include the CRUD operations as methods in this class.
     * */


    /**
     * This method will help us to store the values of a student to the database
     */
    public boolean createNewStudentInDatabase(Connection connection, Student student) {
        String insertQuery = "INSERT INTO Student (rollNumber, name, year, cpi) VALUES (?, ?, ?, ?);";
        return false;
    }

}