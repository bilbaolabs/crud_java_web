<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/513bd683e0.js" crossorigin="anonymous"></script>
        <title>Gestión Usuarios</title>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">

                    <form action="crear.jsp" method="post">
                        <div class="form-group">
                            <label>Nombre</label>
                            <input name="nombre" type="text" class="form-control" id="nombre" placeholder="Nombre usuario" required="Requerido">
                        </div>
                        <div class="form-group">
                            <label>Contraseña</label>
                            <input name="contrasena" type="password" class="form-control" id="contrasena" placeholder="Contraseña" required="Requerido">
                        </div>
                        <div class="form-group">
                            <label>Correo</label>
                            <input name="correo" type="email" class="form-control" id="correo" placeholder="usuario@ciisa.cl" required="Requerido">
                        </div>

                        <button type="submit" name="enviar" class="btn btn-primary">REGISTRAR <i class="fa-regular fa-floppy-disk"></i></button>
                    </form>

                </div>
            </div>
        </div>

        <%
            if (request.getParameter("enviar") != null) {
                String strNombre = request.getParameter("nombre");
                String strContrasena = request.getParameter("contrasena");
                String strCorreo = request.getParameter("correo");

                try {
                    Connection con = null;
                    Statement st = null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proyecto_java_web?user=root");
                    st = con.createStatement();
                    st.executeUpdate("INSERT INTO tbl_usuario (nombre_usuario,contrasena_usuario,correo_usuario) VALUES ('" + strNombre + "','" + strContrasena + "','" + strCorreo + "')");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                } catch (Exception e) {
                    out.print(e);
                }
            }

        %>
    </body>
</html>
