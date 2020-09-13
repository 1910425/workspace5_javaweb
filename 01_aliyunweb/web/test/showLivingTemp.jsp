<%@ page import="java.util.List" %>
<%@ page import="pojo.LivingroomTemp" %><%--
  Created by IntelliJ IDEA.
  User: liuzard
  Date: 2020/9/12
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>温度展示</title>

    <style>
        table{
            align-items: center;
            border:1px blue;
            width: 600px;
            border-collapse: collapse;
        }
        td,th{
            border:1px blue solid;
        }
    </style>
</head>
<body>
<%
    List<LivingroomTemp> livingRoomMessage = (List<LivingroomTemp>) request.getAttribute("LivingRoomMessage");
//    从上个页面当中获查询得到的对象数据
%>
<table align="center">
    <tr>
        <td>温度</td>
        <td>潮湿</td>
        <td>位置</td>
        <td>压强</td>
        <%--<td>删除</td>--%>
    </tr>

    <%  for (LivingroomTemp livingroomTemp:livingRoomMessage){    %>
    <tr>
        <td><%= livingroomTemp.getTemp()%></td>
        <td><%= livingroomTemp.getHumidity()%></td>
        <td><%= livingroomTemp.getLocation()%></td>
        <td><%= livingroomTemp.getPressure()%></td
    </tr>
    <%  } %>
</table>

<center>
<form action="/01_aliyunweb/searchStudentServlet">
    <input align="center" type="submit" value="刷新页面">
</form></center>
</body>
</html>
