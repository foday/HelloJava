//import oracle.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class StatementTest {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new OracleDriver());

            String url = "jdbc:oracle:thin:@localhost:1532:xe";
            String user = "username";
            String pass = "password";

            Connection conn = DriveManager.getConnection(url, user, pass);

            PreparedStatement stmt1 = conn.prepareStatement("insert into STUDENTS values(?, ?)");
            stmt1.setInt(1, 1);
            stmt1.setString(2, "James Basketville");

            stmt1.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}