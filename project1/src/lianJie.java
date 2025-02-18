import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class lianJie {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        String url = "jdbc:mysql://127.0.0.1:3306/练习?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true";
            String user = "root";
            String password = "510903";
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("数据库连接成功");
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("select * from j_student");
            while(rs.next()){
                String sno= rs.getString("sno");
                String sname = rs.getString("sname");
                String sage = rs.getString("sage");
                String ssex = rs.getString("ssex");

                System.out.print("学生ID:"+sno+"\t");
                System.out.print("学生名称:"+sname+"\t");
                System.out.print("学生出生:"+sage+"\t");
                System.out.print("学生性别:"+ssex+"\n");
            }
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
