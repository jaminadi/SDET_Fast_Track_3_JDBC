package jdbcTests;

import org.testng.annotations.Test;
import utilities.DBUtils;

import java.util.List;
import java.util.Map;

public class DBUtils_practice {

    @Test
    public void test1() {
        //create connection
        DBUtils.createConnection();
        //using method to get result as a list of maps
        List<Map<String, Object>> queryResult = DBUtils.getQueryResultMap("select * from departments");

        for (Map<String, Object> Map : queryResult) {
            System.out.println(Map.toString());
        }
        //close connection
        DBUtils.destroy();
    }

    @Test
    public void test2() {
        //create connection
        DBUtils.createConnection();

        Map<String, Object> rowMap = DBUtils.getRowMap("select * from employees where employee_id = 100");

        System.out.println(rowMap.toString());

        //close connection
        DBUtils.destroy();

    }

}

