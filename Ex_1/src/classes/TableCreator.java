package classes;

import java.sql.Connection;
import java.sql.Statement;

public class TableCreator implements interfaces.TableCreator {
    @Override
    public void createTable(Connection connection) throws Exception {
        String sqlDrop = "DROP TABLE IF EXISTS employees";
        String sqlCreate = "CREATE TABLE employees(id INTEGER PRIMARY KEY,"
                + "name TEXT, address TEXT, salary REAL)";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sqlDrop);
        statement.executeUpdate(sqlCreate);
        statement.close();
        connection.commit();
    }
}
