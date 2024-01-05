package com.example; // Change this to your current package

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
  public Connection conn = null;

  public void connect(String database_name) {
    String database_url =
        "jdbc:sqlite:D:\\Projects\\StudentAttendanceSystem\\demo\\src\\" + database_name;

    try {
      this.conn = DriverManager.getConnection(database_url);

    } catch (SQLException e) {
      System.out.println(e);
    }
  }

  public void executeStatement(String sql) {
    try {
      Statement stmt = this.conn.createStatement();
      stmt.execute(sql);
    } catch (SQLException e) {
      System.out.println(e);
    }
  }

  public ResultSet executeSearch(String sql) {
    try {
      Statement stmt = this.conn.createStatement();
      ResultSet result = stmt.executeQuery(sql);
      return result;

    } catch (SQLException e) {
      System.out.println(e);
      ResultSet result = null;
      return result;
    }
  }

  public void loopThroughResultSet(ResultSet resultSet) {
    try {
      ResultSetMetaData metaData = resultSet.getMetaData();
      int columnCount = metaData.getColumnCount();

      while (resultSet.next()) {
        System.out.println("Row:");

        for (int i = 1; i <= columnCount; i++) {
          String columnName = metaData.getColumnName(i);
          Object columnValue = resultSet.getObject(i);

          System.out.println("  " + columnName + ": " + columnValue);
        }

        System.out.println(); // Separate rows with an empty line
      }
    } catch (SQLException e) {
      System.out.println("Error while looping through ResultSet: " + e.getMessage());
    }
  }

  public String replaceWildcards(String query, String... keyValues) {
    if (keyValues.length % 2 != 0) {
      throw new IllegalArgumentException("Number of key-value pairs must be even.");
    }

    for (int i = 0; i < keyValues.length; i += 2) {
      String wildcard = keyValues[i];
      String replacement = keyValues[i + 1];
      query = query.replace(wildcard, replacement);
    }
    return query;
  }
}
