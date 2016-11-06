package com.volkov.soct.server;

/**
 * Created by WoLf on 18.10.2016.
 */
public class Constants {
    public class DB{
        public static final String URL = "jdbc:mysql://localhost:3306/soct_adm_db";
        public static final String USERNAME = "root";
        public static final String PASSWORD = "root";
    }

    public class QUERY{
        public static final String USERS_ALL = "select * from users";
    }
}
