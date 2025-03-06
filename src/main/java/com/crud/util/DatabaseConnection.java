package com.crud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url =  System.getenv("DB_URL");
    private static final String user = System.getenv("DB_USER");
    private static final String password = System.getenv("DB_PASSWORD");


    public static Connection conectar(){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            System.out.println("Erro ao conectar-se ao banco: "+ e.getMessage());
            return null;
        }
    }
}
