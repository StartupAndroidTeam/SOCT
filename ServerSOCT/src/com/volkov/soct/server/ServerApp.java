package com.volkov.soct.server;

import com.volkov.soct.server.requests.Users;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by WoLf on 17.10.2016.
 */

@ApplicationPath("/soct")
public class ServerApp extends Application {
    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( Users.class );
        return h;
    }
}
