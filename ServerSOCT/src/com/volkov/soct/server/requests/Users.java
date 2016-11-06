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
    @Path("/users.json")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertFtoC(@PathParam("m") String m) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        jsonObject.put("test", "test");
        jsonObject.put("test1", "test1");
        jsonObject1.put("obj1", "123");
        jsonObject2.put("obj2", "12345");
        jsonArray.put(jsonObject1);
        jsonArray.put(jsonObject2);
        jsonObject.put("test2", jsonArray);

        String result = "Users: " + jsonObject;

        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/test.json")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response testDB(@PathParam("m") String m) throws JSONException, SQLException {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        jsonObject.put("test", "test");
        jsonObject.put("test1", "test1");
        jsonObject1.put("obj1", "123");
        jsonObject2.put("obj2", "12345");
        jsonArray.put(jsonObject1);
        jsonArray.put(jsonObject2);
        jsonObject.put("test2", jsonArray);

        String result = "Users: " + jsonObject;

        return Response.status(200).entity(result).build();
    }
}


