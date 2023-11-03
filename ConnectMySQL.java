import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/online_food_ordering_system";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL JDBC driver
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database.");
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.err.println("Connection failed! Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found! Error: " + e.getMessage());
        }
    }
}
