package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import ManipularBanco.ResultadoDePesquisa;

public final class DadosDoProfessorEditavel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 ResultadoDePesquisa RP=new ResultadoDePesquisa(); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head><link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("               <link href=\"MeuCss/Visual.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"TelaDeFundo\">\n");
      out.write("        <section class=\"Sessao\">\n");
      out.write("        <table style=\"position:relative;margin:0 auto;width:500px;\">\n");
      out.write("       \n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <div class=\"form-group col-md-4\">\n");
      out.write("   <label for=\"campo1\">ID do Professor</label>\n");
      out.write("   <input type=\"text\" class=\"form-control\" id=\"campo1\" style=\"position:relative;width:200px;\">\n");
      out.write(" </div></td>\n");
      out.write("                    <td> <div class=\"form-group col-md-4\">\n");
      out.write("   <label for=\"campo2\">Nome do professor</label>\n");
      out.write("   <input type=\"text\" class=\"form-control\" id=\"campo3\" style=\"position:relative;width:200px;\">\n");
      out.write(" </div></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <div class=\"form-group col-md-4\">\n");
      out.write("   <label for=\"campo3\">CPF do Professor</label>\n");
      out.write("   <input type=\"text\" class=\"form-control\" id=\"campo3\" style=\"position:relative;width:200px;\">\n");
      out.write(" </div>\n");
      out.write("</div></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"Remover\" style=\"position:relative;left:50px;\"/>\n");
      out.write("\n");
      out.write("</section>\n");
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
