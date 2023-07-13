# Welcome to the Payment Table Simulator

This repository contains the source code and documentation of the Payment Table Simulator, an application designed to assist you in calculating loan payments and amortizations using two amortization systems: the French system and the American system.

## Key Features

- **Configurable loan advisor:** Our application allows you to configure the options of the loan advisor to adapt it to your specific needs. You can set parameters such as interest rates, payment terms, and loan amount.

- **Report generation:** The simulator allows you to generate detailed reports of payments and amortizations, giving you a clear view of the evolution of your loan. These reports will be useful both to you as a customer and to loan advisors who wish to analyze different scenarios.

## Getting Started

1. Clone this repository to your local machine.
2. Install the necessary dependencies following the instructions in the `README` file.
3. Configure the options of the loan advisor according to your needs in the corresponding configuration file.
4. Run the application and enjoy its functionality.

# Developer's Guide - Connecting Java to MySQL Database

## Introduction

This guide aims to provide detailed instructions on how to connect a Java application to a MySQL database using the JDBC connection library. The application is developed with the Swing user interface.

## Prerequisites

- XAMPP: Make sure you have XAMPP installed, which includes the Apache server and MySQL.
- JDK: Make sure you have the Java Development Kit (JDK) installed on your system.

## Database Configuration

1. Start the MySQL server in XAMPP.
2. Open your web browser and access phpMyAdmin (e.g., [http://localhost/phpmyadmin](http://localhost/phpmyadmin)).
3. Create a new database called `my_database`.
4. Inside the `my_database`, create a table called `users` with columns `id` (INT, primary key) and `name` (VARCHAR).

## Project Configuration

1. Create a new Java project in your preferred development environment.
2. Make sure you have the MySQL JDBC library in your project. You can download it from [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/).
3. Add the downloaded library (`mysql-connector-java-x.x.x.jar`) to your project's configuration.

## Connecting to the Database

1. Import the necessary classes into your Java file:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
```
2. Inside your main class, add the following attributes:
```java
private static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
}

```
Make sure to update my_database with the name of your database and provide the correct username and password if you have set them previously.

3. Add the following method to establish the connection to the database:
```java
private static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
}

```
4. You can now use the getConnection() method in your application to obtain a connection to the database.

#Example Database Query
Here's a simple example of how to execute a SELECT query on the database and display the results in the user interface using Swing:
```java
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MyApplication extends JFrame {

    public MyApplication() {
        // User interface setup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Application");
        setSize(400, 300);
        setLayout(new FlowLayout());

        try {
            // Establish connection to the database
            Connection connection = getConnection();

            // Execute SELECT query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            // Display results in the user interface
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                JLabel label = new JLabel("ID: " + id + ", Name: " + name);
                add(label);
            }

            // Close connections
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyApplication app = new MyApplication();
            app.setVisible(true);
        });
    }
}

```




