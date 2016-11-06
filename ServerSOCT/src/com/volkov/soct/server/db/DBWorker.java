package com.volkov.soct.server.db;

import com.volkov.soct.server.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by WoLf on 18.10.2016.
 */
public class DBWorker {

    private Connection mConnection;

    public DBWorker() {
        try {
            mConnection = DriverManager.getConnection(Constants.DB.URL, Constants.DB.USERNAME, Constants.DB.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return mConnection;
    }
}
