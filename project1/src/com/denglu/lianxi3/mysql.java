// import java.sql.Connection;
package com.denglu.lianxi3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class mysql {
    public static void main(String[] args){
        Connection con =null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ri?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true","root","510903");
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        if(con != null){
            System.out.println("数据库连接成功");
            System.out.println(con);
        }
    }
}