package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/pp_jdbc";
    private static final String NAME = "root";
    private static final String PASSWORD = "qwerty";
    private static Connection CON;

    public static Connection getConnection() {
        try {
            CON = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Неудалось подключиться к БД!");
        }
        return CON;
    }
}
