package com.stat.nba.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        String jdbcUrl = "jdbc:postgresql://localhost:5432/flotte";
        String utilisateur = "postgres";
        String motDePasse = "mdpprom15";

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcUrl, utilisateur, motDePasse);
            System.out.println("connete");
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
