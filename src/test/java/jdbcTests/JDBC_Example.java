package jdbcTests;

import org.testng.annotations.Test;

import java.sql.*;

public class JDBC_Example {

    String dbUrl = "jdbc:oracle:thin:@44.204.231.116:1521:xe";
    String dbUserName = "hr";
    String dbPassword = "hr";

    String query = "select * from employees";

    @Test
    public void createConnectionTest() throws SQLException{

        Connection connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery(query);

        DatabaseMetaData dbMetadata = connection.getMetaData();

        System.out.println(dbMetadata.getUserName());

        ResultSetMetaData rsmd = resultSet.getMetaData();

        //count how many columns we have
        int columnCount = rsmd.getColumnCount();
        System.out.println(columnCount);

        //get column names
        System.out.println(rsmd.getColumnName(1));

        //get value of the first column cell ignoring the header row
        resultSet.next();
        System.out.println(resultSet.getString(1));

        for (int i = 1; i <=columnCount; i++) {
            System.out.println(rsmd.getColumnName(i));
        }

    }
}
