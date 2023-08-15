package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.mysql.jdbc.Driver;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/513bd683e0.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Gestión Usuarios</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
        
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                    <h1 class=\"display-5\">Usuarios</h1>\n");
      out.write("\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                        <thead class=\"thead-dark\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\" colspan=\"4\">Usuarios</th>\n");
      out.write("                                <th scope=\"col\">\n");
      out.write("                                    <a href=\"crear.jsp\"><i class=\"fa-solid fa-user-plus\"></i></a>\n");
      out.write("                                </th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">#</th>\n");
      out.write("                                <th scope=\"col\">Nombre Usuario</th>\n");
      out.write("                                <th scope=\"col\">Contraseña</th>\n");
      out.write("                                <th scope=\"col\">Correo</th>\n");
      out.write("                                <th scope=\"col\">Acciones</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proyecto_java_web?user=root");
                                st = con.createStatement();
                                rs = st.executeQuery("SELECT * FROM tbl_usuario;");
                                while (rs.next()) {
                            
      out.write("                     \n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\">");
      out.print( rs.getString(1));
      out.write("</th>\n");
      out.write("                                <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <i class=\"fa-solid fa-pencil\"></i>\n");
      out.write("                                    <i class=\"fa-regular fa-trash-can\"></i>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                            
      out.write("                \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
