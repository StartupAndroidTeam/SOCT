package com.volkov.soct.server;

import com.volkov.soct.server.manager.UserManager;

import java.sql.SQLException;

/**
 * Created by WoLf on 17.10.2016.
 */

public class Main {
    public static void main(String[] args) throws SQLException {
        UserManager manager = new UserManager();
        try {
            manager.getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            manager.closeConnection();
        }
    }
}