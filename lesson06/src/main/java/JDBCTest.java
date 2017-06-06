import entity.Student;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/students?serverTimezone=UTC&useSSL=false";

        Connection connection = DriverManager.getConnection(url, username, password);

        selectFromTable(connection);

        createNewRecordMySql(connection, enterStudentInfoForDB());
    }

    private static void createNewRecordMySql(Connection connection, Student student) throws SQLException {
        PreparedStatement preparedStatement = connection.
                prepareStatement("INSERT INTO students(NAME, surname, age, group_id) VALUES(?, ?, ?, ?)");
        preparedStatement.setString(1, student.getStudentName());
        preparedStatement.setString(2, student.getStudentSurname());
        preparedStatement.setString(3, String.valueOf(student.getStudentAge()));
        preparedStatement.setString(4, String.valueOf(student.getStudentGroup()));
        preparedStatement.executeUpdate();
    }

    private static void selectFromTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select st.name, st.surname, st.age, `group`.name " +
                "from students AS st inner JOIN `group` ON st.group_id = `group`.id;");
        while (resultSet.next()) {
            System.out.println("name=" + resultSet.getString(1) + " surname=" + resultSet.getString(2) +
                    " age=" + resultSet.getString(3) + " group=" + resultSet.getString(4));
        }
    }

    private static Student enterStudentInfoForDB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter students name");
        String name = scanner.next();
        System.out.println("Please enter students surname");
        String surname = scanner.next();
        System.out.println("Please enter students age");
        int age = scanner.nextInt();
        System.out.println("Please enter students group");
        int group = scanner.nextInt();
        System.out.println("Thank you");
        return new Student(name, surname, age, group);
    }
}
