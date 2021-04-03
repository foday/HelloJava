//import oracle.sql.DriverManager;

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

        }
    }
}