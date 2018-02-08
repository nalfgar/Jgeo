package pl.strojecki.models.dataBase;

import pl.strojecki.utils.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseConnector {

    private static DataBaseConnector instance = new DataBaseConnector();
    private Connection connection;


    public static DataBaseConnector getInstance() {
        return instance;
    }

    private DataBaseConnector() {
        connect();
    }

    private void connect() {
        try {
            Class.forName(Config.PG_DRIVER);
            connection = DriverManager.getConnection(Config.PG_LINK, Config.PG_USER, Config.PG_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connected to PG");

    }

    public PreparedStatement createStatement(String sql){
        try {
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
