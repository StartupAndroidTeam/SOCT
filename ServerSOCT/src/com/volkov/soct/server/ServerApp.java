package com.volkov.soct.server;

import com.volkov.soct.server.requests.Users;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by WoLf on 17.10.2016.
 */

@ApplicationPath("/soct")
public class ServerApp extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        HashSet h = new HashSet<Class<?>>();
        h.add( Users.class );
        return h;
    }
}
