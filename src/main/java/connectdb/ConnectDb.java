package connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {

    String userName = "root";
    String password = "root";
    String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";


    public void getConnection() throws SQLException {

        Connection connection = DriverManager.getConnection(url, userName, password);
    }

    public void createStatement(){

        // we can create statement
    }
}
