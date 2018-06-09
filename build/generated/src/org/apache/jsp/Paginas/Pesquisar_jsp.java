package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Banco.ConectarBanco;
import javax.swing.JOptionPane;
import ManipularBanco.ResultadoDePesquisa;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class Pesquisar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 ResultadoDePesquisa RP=new ResultadoDePesquisa(); ConectarBanco conecta=new ConectarBanco();
Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
conecta.ConectaBanco(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write(" <script src=\"https://igorescobar.github.io/jQuery-Mask-Plugin/js/jquery.mask.min.js\"></script>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>  <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"MeuCss/Visual.css\" rel=\"stylesheet\">\r\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">WebSiteName</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("      <li><a href=\"#\">Adicionar professor</a></li>\r\n");
      out.write("      <li><a href=\"#\">Levantamento da semana</a></li>\r\n");
      out.write("      <li><a href=\"#\">Pesquisar</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("      </head>\r\n");
      out.write("      <body>\r\n");
      out.write("          <section  class=\"Sessao\">\r\n");
      out.write("      <select name=\"PesquisarQueDado\">\r\n");
      out.write("        <option value=\"Professor\">Professor</option>\r\n");
      out.write("        <option></option>\r\n");
      out.write("        <option></option>\r\n");
      out.write("        <option></option>\r\n");
      out.write("        <option></option>\r\n");
      out.write("    </select>\r\n");
      out.write("    ");
//if(request.getParameter("CampoPesquisa")!=null){
      out.write("\r\n");
      out.write("      <table border=\"1\">\r\n");
      out.write("          <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <th>Nome</th>\r\n");
      out.write("                  <th>CPF</th>\r\n");
      out.write("                  <th></th>\r\n");
      out.write("              </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("              ");
//ResultSet RS=RP.PesquisaPorID(request.getParameter("CampoPesquisa"));
             // while(RS.next()){
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <td>Nome</td>\r\n");
      out.write("                  <td>CPF</td>\r\n");
      out.write("                  <td><input type=\"hidden\" name=\"\" value=\"");
//RS.getString("id");
      out.write("\" />\r\n");
      out.write("                      <form action=\"Atualizar\" method=\"GET\">\r\n");
      out.write("                      \r\n");
      out.write("                      <input type=\"submit\" value=\"Selecionar\" />\r\n");
      out.write("                      </form>\r\n");
      out.write("                  </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");
//}
      out.write("\r\n");
      out.write("          </tbody>\r\n");
      out.write("      </table>\r\n");
//}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
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
