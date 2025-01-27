package com.swsa.repository;
import com.swsa.model.Student;
import com.swsa.service.ConnectionService;
import java.sql.*;
public class StudentRepository {

    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }

    public boolean insertStudent(Student student) throws SQLException {
        this.initConnection();
        String query = "INSERT INTO student VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, student.getStudentId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getAddress().getAddressId());
            preparedStatement.setString(4, student.getGrade());
            preparedStatement.setFloat(5, student.getPercentage());
            System.out.println("inserting student data to table: " + student);

            int rowsInserted = preparedStatement.executeUpdate();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}