package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ManipularBanco.ResultadoDePesquisa;
import Banco.SelecionarDadosDoProfessor;
import java.sql.ResultSet;

public final class DadosDoProfessor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 ResultadoDePesquisa RP=new ResultadoDePesquisa(); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>  <link href=\"MeuCss/Visual.css\" rel=\"stylesheet\"><link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"Sessao\">\n");
      out.write("        ");
//if(request.getParameter("Escolha").equals("Editar")){//Mostrara dados de forma editavel
       //ResultSet rs= RP.SelecionarDadosDoProfessor(request.getParameter("ID"));
      out.write("\n");
      out.write("       \n");
      out.write("       <div class=\"row\">\n");
      out.write(" <div class=\"form-group col-md-4\">\n");
      out.write("   <label for=\"campo1\">Campo Um</label>\n");
      out.write("   <input type=\"text\" class=\"form-control\" id=\"campo1\">\n");
      out.write(" </div>\n");
      out.write(" \n");
      out.write(" <div class=\"form-group col-md-4\">\n");
      out.write("   <label for=\"campo2\">Campo Dois</label>\n");
      out.write("   <input type=\"text\" class=\"form-control\" id=\"campo3\">\n");
      out.write(" </div>\n");
      out.write(" \n");
      out.write(" <div class=\"form-group col-md-4\">\n");
      out.write("   <label for=\"campo3\">Campo Três</label>\n");
      out.write("   <input type=\"text\" class=\"form-control\" id=\"campo3\">\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("        ");
//}
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("  <div class=\"col-md-4\">\n");
      out.write("    <p><strong>Nome do Campo</strong></p>\n");
      out.write("    <p>{Valor do Campo}</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-4\">\n");
      out.write("    <p><strong>Nome do Campo</strong></p>\n");
      out.write("    <p>{Valor do Campo}</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-4\">\n");
      out.write("    <p><strong>Nome do Campo</strong></p>\n");
      out.write("    <p>{Valor do Campo}</p>\n");
      out.write("  </div>\n");
      out.write("</div> <!-- .row -->\n");
      out.write("        </section>\n");
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
