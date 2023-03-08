package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager implements interfaces.ConnectionManager {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
        connection.setAutoCommit(false);
        return connection;
    }
}
