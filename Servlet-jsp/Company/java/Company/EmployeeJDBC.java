package Company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeJDBC {

    private static final String DEFAULT_JDBC_URL = "jdbc:mysql://localhost:3306/company";
    private static final String DEFAULT_JDBC_USERNAME = "root";
    private static final String DEFAULT_JDBC_PASSWORD = ""; // your Password

    private static final String INSERT_EMPLOYEE_SQL =
            "INSERT INTO employee (FirstName, LastName, Email, address, contact, Password) VALUES (?, ?, ?, ?, ?, ?)";

    private static final String SELECT_LOGIN_SQL =
            "SELECT 1 FROM employee WHERE Email = ? AND Password = ?";

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(getJdbcUrl(), getJdbcUsername(), getJdbcPassword());
    }

    public int insertEmployee(Employee employee) throws SQLException, ClassNotFoundException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getEmail());
            preparedStatement.setString(4, employee.getAddress());
            preparedStatement.setString(5, employee.getContact());
            preparedStatement.setString(6, employee.getPassword());
            return preparedStatement.executeUpdate();
        }
    }

    public boolean validateEmployee(String email, String password) throws SQLException, ClassNotFoundException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_LOGIN_SQL)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }
        }
    }

    private String getJdbcUrl() {
        return getEnvOrDefault("DB_URL", DEFAULT_JDBC_URL);
    }

    private String getJdbcUsername() {
        return getEnvOrDefault("DB_USERNAME", DEFAULT_JDBC_USERNAME);
    }

    private String getJdbcPassword() {
        return getEnvOrDefault("DB_PASSWORD", DEFAULT_JDBC_PASSWORD);
    }

    private String getEnvOrDefault(String key, String fallback) {
        String value = System.getenv(key);
        return value == null || value.trim().isEmpty() ? fallback : value.trim();
    }
}
