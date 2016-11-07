package com.volkov.soct.server.requests;

import com.volkov.soct.server.manager.UserManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

/**
 * Created by WoLf on 18.10.2016.
 */

@Path("/v1")
public class Users {
    @GET
    @Path("/userstest.json")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertFtoC(@PathParam("m") String m) throws JSONException {
        JSONObject jsonObject = new JSONObject();


        jsonObject.put("test", "test");
        jsonObject.put("test1", "test1");

        String result = jsonObject.toString();

        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/users.json")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response testDB(@PathParam("m") String m) throws JSONException, SQLException {
        String res = "";
        UserManager manager = new UserManager();
        for (int i=0; i< manager.getAllUsers().length(); i++){
            manager.getAllUsers().get(i);
             res = manager.getAllUsers().toString();
        }
        manager.closeConnection();
        return Response.status(200).entity(res).build();
    }
}


