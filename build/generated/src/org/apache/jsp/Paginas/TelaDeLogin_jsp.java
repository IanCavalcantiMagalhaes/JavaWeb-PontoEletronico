package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TelaDeLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 String a="OI"; 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head> <link href=\"MeuCss/Visual.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("     <script>  \n");
      out.write("    \n");
      out.write("    $(document).ready(function(){\n");
      out.write("         $(#Formulario1).mask('000.000.000-00');\n");
      out.write("     });\n");
      out.write("    </script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("<style>\n");
      out.write("  #Fomulario1{width: 200px;  position:relative; top :-10px;}\n");
      out.write("  \n");
      out.write("  #Formulario2{width: 200px;}\n");
      out.write("  \n");
      out.write("  #Imagem{width: 100px;height: 25px;  position:relative; bottom: 10px; right: -50px; color: green;}\n");
      out.write("  \n");
      out.write("  .TelaDeFundo{background-image:url(Imagem/general-night-golden-gate-bridge-hd-wallpapers-golden-gate-bridge-wallpaper.jpg);\n");
      out.write("          background-repeat: no-repeat;background-attachment: fixed;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"TelaDeFundo\">\n");
      out.write("        <table align=\"center\" style=\"border:1px solid black;\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th style=\"width: 70px;color: green\">Ola</th>\n");
      out.write("                    <th style=\"width: 70px;color: green\">Ola</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("       \n");
      out.write("        </table>\n");
      out.write("    \n");
      out.write("        <form action=\"../Login\" style=\"color: white; text-align: center;\">\n");
      out.write("        <h1>Hello World! Usuario=Ian Senha=</h1>\n");
      out.write("        <input type=\"text\" name=\"Fomulario1\" value=\"\" placeholder=\"Digite seu nome\" id=\"Fomulario1\"/><br>\n");
      out.write("      <input type=\"text\" name=\"Senha\" value=\"\" placeholder=\"Digite senha\"  id=\"Formulario2\"/><br><br>\n");
      out.write("      <input type=\"image\" src=\"Imagem/BotaoEntrar.PNG\" value=\"Entrar\" id=\"Imagem\" /> \n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        \n");
      out.write("  \n");
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
