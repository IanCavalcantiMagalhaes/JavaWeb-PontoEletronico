package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>       <link href=\"MeuCss/Visual.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("<link href=\"MeuCss/Decorar.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"TelaDeFundo\">\n");
      out.write("        <section class=\"Sessao\">\n");
      out.write("            <p>OLA</p>\n");
      out.write("            <a href=\"Inserir.jsp\"><img src=\"Imagem/add-icon-png-2489.png\" width=\"100px\" height=\"100px\"></a>\n");
      out.write("        <a href=\"Pesquisar.jsp\" style=\"margin-left: 500px;position: relative;\"><img src=\"Imagem/user-search-find-icon-33.png\" width=\"100px\" height=\"100px\"\n");
      out.write("                                                                                    alt=\"Pesquisar\"/></a>\n");
      out.write("    </section>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
      out.write("<!--position:fixed;independente do rolamento sempre estara na mesma posiçao <img alt=\"\" src=\"search.png\" width=\"100\" height=\"100\" style=\"align:center;\"> <!--    a{\n");
      out.write("        text-decoration:none;\n");
      out.write("        align:center;\n");
      out.write("        left: 10px;\n");
      out.write("        position: absolute;\n");
      out.write("        \n");
      out.write("        }-->");
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
