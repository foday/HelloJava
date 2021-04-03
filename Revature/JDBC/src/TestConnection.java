package Revature.JDBC.src;

import java.sql.Connection;
import java.sql.DatabaseMetaData;;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args){
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresSWl://localhost:5432/PubHub";
            String user = "postgres";
            String pass = "password";

            Connection conn = DriverManager.getConnection(url, user, password);
        }
    }
    
}
