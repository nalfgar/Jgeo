package pl.strojecki.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PgDao {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "darek";
        String password = "qqqwww123";

        String number = "15-10/2";
        String pew = "11.11";
        String pew2 = "22.22";
        String pew3 = "33.33";

        String query = "INSERT INTO plots (id, pew, pew2, pew3) VALUES(?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password); ){
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, number);
            preparedStatement.setString(2, pew);
            preparedStatement.setString(3, pew2);
            preparedStatement.setString(4, pew3);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
