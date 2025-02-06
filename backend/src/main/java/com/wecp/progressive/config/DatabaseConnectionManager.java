package com.wecp.progressive.config;

<<<<<<< HEAD
import java.io.IOException;
=======
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
<<<<<<< HEAD
    private static final Properties properties = new Properties();

    static {
        loadProperties();
    }

    private static void loadProperties() {
        try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new IllegalStateException("resource.properties not found in classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("spring.datasource.url");
        String user = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url, user, password);
    }
}
=======

    private static final Properties properties = new Properties();
    static {
        loadProperties();
    }
    private static void loadProperties () {
        try {
            InputStream input = DatabaseConnectionManager.class.getClassLoader()
                                .getResourceAsStream("application.properties");
            if(input == null) {
                throw new IllegalStateException("resources.properties not found in classpath");
            }
            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Error loading properties file", e);
            // TODO: handle exception
        }
    }
    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("spring.datasource.url");
        String username = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url, username, password);
    }
}
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
