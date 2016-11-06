package com.volkov.soct.server.manager;

import com.volkov.soct.server.Constants;
import com.volkov.soct.server.db.DBWorker;
import com.volkov.soct.server.model.User;
import org.json.JSONObject;

import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by WoLf on 18.10.2016.
 */

public class UserManager {

    private DBWorker mDbWorker;
    private Statement mStatement;
    ResultSet resultSet;

    public UserManager(){
        mDbWorker = new DBWorker();
    }



    public void getAllUsers() throws SQLException {

        mStatement = mDbWorker.getConnection().createStatement();
        resultSet = mStatement.executeQuery(Constants.QUERY.USERS_ALL);

        while (resultSet.next()){

            User user = new User();
            user.setmId(resultSet.getInt("id"));
            user.setmName(resultSet.getString("name"));
            user.setmPosition(resultSet.getString("position"));
            user.setmTotalRepair(resultSet.getInt("totalRepair"));
            user.setmTotalRecharge(resultSet.getInt("totalRecharge"));
            user.setmPrinter(resultSet.getString("printer"));
            System.out.println(user);

        }

    }
    public void createUser(){
    String create = "INSERT INTO users VALUES(?,?,?,?,?)";

    }

    public void closeConnection() throws SQLException {
        mStatement.getConnection().close();
        mDbWorker.getConnection().close();
    }
}
