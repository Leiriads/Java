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

/*
CREATE TABLE `prova` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `disciplina` varchar(255) DEFAULT NULL,
  `aluno` varchar(255) DEFAULT NULL,
  `professor` varchar(255) DEFAULT NULL,
  `nota` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `questao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prova_id` int(11) DEFAULT NULL,
  `pergunta` varchar(255) DEFAULT NULL,
  `resposta_correta` char(1) DEFAULT NULL,
  `resposta_aluno` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `prova_id` (`prova_id`),
  CONSTRAINT `questao_ibfk_1` FOREIGN KEY (`prova_id`) REFERENCES `prova` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


*/
