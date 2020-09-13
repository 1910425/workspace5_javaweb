package Utils;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutils {

    public static Connection getConnection() throws Exception {
        InputStream is = JDBCutils.class.getClassLoader().getResourceAsStream("Utils/jdbc.properties");
        Properties pros = new Properties();
        pros.load(is);
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");
        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public static void closeResource(Connection conn, Statement ps){
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException var4) {
            var4.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException var3) {
            var3.printStackTrace();
        }
    }
//@Test
//public void test3(){
//    Connection connection = null;
//    try {
//        connection = JDBCutils.getConnection();
//        System.out.println(connection);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }finally {
//        JDBCutils.closeResource(connection,null);
//    }
//
//}
}
