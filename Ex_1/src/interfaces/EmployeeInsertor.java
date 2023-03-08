package interfaces;


import java.sql.Connection;

public interface EmployeeInsertor {
    void inserData(Connection connection) throws Exception;
}
