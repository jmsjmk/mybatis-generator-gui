package com.zzg.mybatis.generator.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Owen on 8/21/16.
 */
public class ConnectionManager {

     private static final String DB_URL = "jdbc:sqlite:./config/sqlite3.db";
//    private static final String DB_URL = "jdbc:sqlite:sqlite3.db";

    public static Connection getConnection() throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(DB_URL);
        return conn;
    }


    public static void main(String[] args) {
        try {
            Connection connection = getConnection();

            boolean b = connection.getAutoCommit();
            System.out.println(b);



            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
//
//            statement.executeUpdate("drop table if exists person");
//            statement.executeUpdate("create table person (id integer, name string)");
//            statement.executeUpdate("insert into person values(1, 'leo')");
//            statement.executeUpdate("insert into person values(2, 'yui')");
            ResultSet rs = statement.executeQuery("select * from person");
            while(rs.next())
            {
                // read the result set
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
