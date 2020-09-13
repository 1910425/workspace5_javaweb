package pojo;

import Utils.JDBCutils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class LivingroomDaoImple  {

    public  static List<LivingroomTemp> GetAllMessageFromMysql() {
        Connection connection = null;
        List<LivingroomTemp> list = null;
        try {
            QueryRunner runner = new QueryRunner();
            connection = JDBCutils.getConnection();
            String sql="select temp,humidity,location,pressure from LivingRoomTemp;";
            BeanListHandler<LivingroomTemp> handler = new BeanListHandler<>(LivingroomTemp.class);
            list = runner.query(connection,sql,handler);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCutils.closeResource(connection,null);
        }
        return list;
    }

    @Test
    public void test3(){
//        LivingroomDaoImple livingroomDaoImple = new LivingroomDaoImple();
        List<LivingroomTemp> list = LivingroomDaoImple.GetAllMessageFromMysql();
        list.forEach(System.out::println);
    }
}
