package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionClass {
    public Connection connection;

    public Connection getConnection() {
        String dbName = "Student";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/" + dbName + username + password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}