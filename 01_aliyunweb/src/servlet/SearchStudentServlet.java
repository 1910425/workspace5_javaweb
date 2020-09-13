package servlet;
import pojo.LivingroomDaoImple;
import pojo.LivingroomTemp;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SearchStudentServlet extends HttpServlet{
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }
//在这个部分当中，从数据库获取连接，然后把获取到的数据传递给request对象，以便进行数据转发，从而给jsp的显示页面当中
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        LivingroomDaoImple livingroomDaoImple = new LivingroomDaoImple();
        List<LivingroomTemp> list = livingroomDaoImple.GetAllMessageFromMysql();
        request.setAttribute("LivingRoomMessage",list);
//        PrintWriter writer = response.getWriter();
//        writer.print(list);
//LivingRoomMessage这个是k也就是健，其对应的Value值就是这个列表e
        request.getRequestDispatcher("/test/showLivingTemp.jsp").forward(request,response);
    }
}
