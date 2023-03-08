package main;

import classes.EmployeeReader;
import interfaces.ConnectionManager;
import interfaces.EmployeeInsertor;
import interfaces.Reader;
import interfaces.TableCreator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try {
            ConnectionManager connectionManager = new classes.ConnectionManager();
            Connection connection = connectionManager.getConnection();


            TableCreator employeeTableCreator = new classes.TableCreator();
            employeeTableCreator.createTable(connection);

           EmployeeInsertor employeeDataInsertor = new classes.EmployeeInsertor();
            employeeDataInsertor.inserData(connection);

            Reader employeeReader = new EmployeeReader();
            employeeReader.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}