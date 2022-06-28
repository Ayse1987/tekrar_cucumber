package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;
import java.sql.SQLOutput;

public class Database_step {
    @Given("user is connected to database")
    public void user_is_connected_to_database() {
        DBUtils.createConnection();

    }
    @Given("user gets all data in {string} column in {string} table")
    public void user_gets_all_data_in_column_in_table(String column, String table) {
      String query="Select "+column+" from "+table;
      DBUtils.executeQuery(query);


    }
    @Given("user reads {int} data in {string} column")
    public void user_reads_data_in_column(Integer int1, String field) throws SQLException {
        DBUtils.getResultset().absolute(int1);
        System.out.println(DBUtils.getResultset().getObject(field));
        DBUtils.getResultset().next();
       System.out.println(DBUtils.getResultset().getObject(field));

       DBUtils.getResultset().last();
        System.out.println(DBUtils.getResultset().getObject(field));


        while(DBUtils.getResultset().previous()){
            System.out.println(DBUtils.getResultset().getObject(field));
        }


    }



}
