package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String DB_HOST = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "prova2";
    private static final String DB_TIMEZONE = "?useTimezone=true&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection(DB_HOST + DB_NAME + DB_TIMEZONE, DB_USER, DB_PASS);
        } catch(SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
}
