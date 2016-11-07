package com.volkov.soct.server.manager;

import com.volkov.soct.server.Constants;
import com.volkov.soct.server.db.DBWorker;
import com.volkov.soct.server.model.User;
import org.json.JSONArray;
import org.json.JSONObject;

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

    public JSONArray getAllUsers() throws SQLException {

        mStatement = mDbWorker.getConnection().createStatement();
        resultSet = mStatement.executeQuery(Constants.QUERY.USERS_ALL);

        JSONArray jsonArray = new JSONArray();

        while (resultSet.next()){

            User user = new User();
            user.setmId(resultSet.getInt("id"));
            user.setmName(resultSet.getString("name"));
            user.setmPosition(resultSet.getString("position"));
            user.setmTotalRepair(resultSet.getInt("totalRepair"));
            user.setmTotalRecharge(resultSet.getInt("totalRecharge"));
            user.setmPrinter(resultSet.getString("printer"));
            //System.out.println(user);

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", user.getmId());
            jsonObject.put("name", user.getmName());
            jsonObject.put("position", user.getmPosition());
            jsonObject.put("totalRepair", user.getmTotalRepair());
            jsonObject.put("totalRecharge", user.getmTotalRecharge());
            jsonObject.put("printer", user.getmPrinter());

            jsonArray.put(jsonObject);
        }
        return jsonArray;
    }
    public void createUser(){
    String create = "INSERT INTO users VALUES(?,?,?,?,?)";

    }

    public void closeConnection() throws SQLException {
        mStatement.getConnection().close();
        mDbWorker.getConnection().close();
    }
}
