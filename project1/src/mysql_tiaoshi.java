import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class mysql_tiaoshi{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            String url = "jdbc:mysql://127.0.0.1:3306/ri?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true";
            String user = "root";
            String password = "510903";
            Connection con = DriverManager.getConnection(url,user,password);
            Statement stmt =con.createStatement();
            ResultSet res = stmt.executeQuery("select * from sys_user where user_id=1");
            while(res.next()){
                String user_id= res.getString("user_id");
                String dept_id = res.getString("dept_id");
                String user_name = res.getString("user_name");
                System.out.print("用户ID:"+user_id+" ");
                System.out.print("部门ID:"+dept_id+" ");
                System.out.println("用户账号:"+user_name);
            }
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}