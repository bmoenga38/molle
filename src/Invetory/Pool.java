package Invetory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Pool {

    Connection con;
    String db_username;
    String db_password;
    String schema;

    public Pool(String user, String pass){
      this.db_username = user;
      this.db_password = pass;
    }

    public Pool(String user, String pass,String db){
        this.db_username = user;
        this.db_password = pass;
        this.schema = db;
    }
    public Connection connect() {
        String db_url = "jdbc:mysql://127.0.0.1:3306/schema";
        try {
            con = DriverManager.getConnection(db_url,db_username,db_password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
    public boolean connectTwo(){
        String db_url = "jdbc:msql://127.0.0.1:3306/schema";
        boolean connected = true;
        try{
            con = DriverManager.getConnection(db_url,db_username,db_password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connected = false;
        }


        return connected;
    }
}

