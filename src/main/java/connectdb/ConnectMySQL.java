package connectdb;


import java.sql.*;

public class ConnectMySQL {

    public static void main(String [] args) throws SQLException {


        String userName = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String query = "select * from studentDemo";

        /**
         *During runtime this will load and register driver
         *  */

      try {

        //  Class.forName("com.mysql.jdbc.Driver");
          Class.forName("com.mysql.cj.jdbc.Driver");
      }
       catch (ClassNotFoundException e){

          e.printStackTrace();
           System.out.println("Check Driver availability");
       }


        /**
         *
         * Connect DB
         * */

        Connection connection = DriverManager.getConnection(url, userName, password);

        /**
         * Create Statement
         * */
        Statement statement = connection.createStatement();

        /**
         * Execute the query and store in a ResultSet reference variable
         * */
        ResultSet table = statement.executeQuery(query);

        System.out.println("ID" + " " + "name");

       while( table.next()) {

           String valueId1 = table.getString("ID");
           String nameOfId1 = table.getString("name");
           System.out.println(valueId1 + "  " + nameOfId1);

       }

       statement.close();
       connection.close();

    }

}
