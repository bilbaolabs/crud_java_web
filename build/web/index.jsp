<%-- 
    Document   : index
    Created on : 14-08-2023, 19:43:17
    Author     : BilbaoLabs
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/513bd683e0.js" crossorigin="anonymous"></script>
        <title>Gestión Usuarios</title>
    </head>
    <body>
        <%
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
        %>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col" colspan="4" class="text-center">Usuarios</th>
                                <th scope="col">
                                    <a href="crear.jsp"><i class="fa-solid fa-user-plus"></i></a>
                                </th>
                            </tr>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Nombre Usuario</th>
                                <th scope="col">Contraseña</th>
                                <th scope="col">Correo</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proyecto_java_web?user=root");
                                st = con.createStatement();
                                rs = st.executeQuery("SELECT * FROM tbl_usuario;");
                                while (rs.next()) {
                            %>                     
                            <tr>
                                <th scope="row"><%= rs.getString(1)%></th>
                                <td><%= rs.getString(2)%></td>
                                <td><%= rs.getString(3)%></td>
                                <td><%= rs.getString(4)%></td>
                                <td>
                                    <a href="editar.jsp?id_usuario=<%= rs.getString(1)%>&nombre_usuario=<%= rs.getString(2)%>&contrasena_usuario=<%= rs.getString(3)%>&correo_usuario=<%= rs.getString(4)%>"<i class="fa-solid fa-pencil"></i></a>
                                    <a href="borrar.jsp?id_usuario=<%= rs.getString(1)%>"><i class="fa-regular fa-trash-can"></i></a>
                                </td>
                            </tr>
                            <%
                                }
                            %>                
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
