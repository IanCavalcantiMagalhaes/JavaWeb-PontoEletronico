package org.apache.jsp.Testando;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title><script>\n");
      out.write("            function executa(){\n");
      out.write("      \n");
      out.write("            var e = document.getElementById(\"Escolha_id\");\n");
      out.write("     \n");
      out.write("var txt = e.options[e.selectedIndex].text;   \n");
      out.write("            if(txt===\"Ler\"){\n");
      out.write("                document.getElementById(\"Senha_id\").style.display = \"none\";\n");
      out.write("       \n");
      out.write("            }if(txt===\"Editar\"){\n");
      out.write("                document.getElementById(\"Senha_id\").style.display = \"block\";\n");
      out.write("            }   \n");
      out.write("        }\n");
      out.write("        function recarregar(){\n");
      out.write("            location.reload();\n");
      out.write("        }    \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   <div id=\"main\" class=\"container-fluid\">\n");
      out.write("     <div id=\"top\" class=\"row\">\n");
      out.write(" \n");
      out.write("     </div> <!-- /#top -->\n");
      out.write(" \n");
      out.write("     <hr />\n");
      out.write("     <div id=\"list\" class=\"row\">\n");
      out.write("     \n");
      out.write("     </div> <!-- /#list -->\n");
      out.write(" \n");
      out.write("     <div id=\"bottom\" class=\"row\">\n");
      out.write("     \n");
      out.write("     </div> <!-- /#bottom -->\n");
      out.write(" </div>  <!-- /#main -->\n");
      out.write(" <div id=\"top\" class=\"row\">\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("        <h2>Itens</h2>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("        <div class=\"input-group h2\">\n");
      out.write("            <input name=\"data[search]\" class=\"form-control\" id=\"search\" type=\"text\" placeholder=\"Pesquisar Itens\">\n");
      out.write("            <span class=\"input-group-btn\">\n");
      out.write("                <button class=\"btn btn-primary\" type=\"submit\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("                </button>\n");
      out.write("            </span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("        <a href=\"add.html\" class=\"btn btn-primary pull-right h2\">Novo Item</a>\n");
      out.write("    </div>\n");
      out.write("</div> <!-- /#top -->\n");
      out.write("<div class=\"col-md-3\">\n");
      out.write("    <h2>Itens</h2>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-6\">\n");
      out.write("     <div class=\"input-group h2\">\n");
      out.write("         <input name=\"data[search]\" class=\"form-control\" id=\"search\" type=\"text\" placeholder=\"Pesquisar Itens\">\n");
      out.write("         <span class=\"input-group-btn\">\n");
      out.write("                 <button class=\"btn btn-primary\" type=\"submit\">\n");
      out.write("                     <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("                 </button>\n");
      out.write("         </span>\n");
      out.write("     </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"list\" class=\"row\">\n");
      out.write(" \n");
      out.write("    <div class=\"table-responsive col-md-12\">\n");
      out.write("        <table class=\"table table-striped\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Header 1</th>\n");
      out.write("                    <th>Header 2</th>\n");
      out.write("                    <th>Header 3</th>\n");
      out.write("                    <th class=\"actions\">Ações</th>\n");
      out.write("                 </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write(" \n");
      out.write("                <tr>\n");
      out.write("                    <td>1001</td>\n");
      out.write("                    <td>Lorem ipsum dolor sit amet, consectetur adipiscing</td>\n");
      out.write("                    <td>Jes</td>\n");
      out.write("                    <td>01/01/2015</td>\n");
      out.write("                    <td class=\"actions\">\n");
      out.write("                        <a class=\"btn btn-success btn-xs\" href=\"view.html\">Visualizar</a>\n");
      out.write("                        <a class=\"btn btn-warning btn-xs\" href=\"edit.html\">Editar</a>\n");
      out.write("                        <a class=\"btn btn-danger btn-xs\"  href=\"#\" data-toggle=\"modal\" data-target=\"#delete-modal\">Excluir</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write(" \n");
      out.write("            </tbody>\n");
      out.write("         </table>\n");
      out.write(" \n");
      out.write("     </div>\n");
      out.write(" </div> <!-- /#list -->\n");
      out.write(" <div id=\"bottom\" class=\"row\">\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("         \n");
      out.write("        <ul class=\"pagination\">\n");
      out.write("            <li class=\"disabled\"><a>&lt; Anterior</a></li>\n");
      out.write("            <li class=\"disabled\"><a>1</a></li>\n");
      out.write("            <li><a href=\"#\">2</a></li>\n");
      out.write("            <li><a href=\"#\">3</a></li>\n");
      out.write("            <li class=\"next\"><a href=\"#\" rel=\"next\">Próximo &gt;</a></li>\n");
      out.write("        </ul><!-- /.pagination -->\n");
      out.write(" \n");
      out.write("    </div>\n");
      out.write("</div> <!-- /#bottom -->\n");
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
