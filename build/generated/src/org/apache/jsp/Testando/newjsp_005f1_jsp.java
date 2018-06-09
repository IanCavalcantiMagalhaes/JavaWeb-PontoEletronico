package org.apache.jsp.Testando;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Banco.ConectarBanco;

public final class newjsp_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write(" <script src=\"https://igorescobar.github.io/jQuery-Mask-Plugin/js/jquery.mask.min.js\"></script>  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("    \n");
      out.write("            .TelaDeFundo{background-image:url(http://carloswgama.com.br/cesmac/scripts/fundo_cachorro.png); background-repeat: repeat;background-attachment: fixed;\n");
      out.write("        }section{\n");
      out.write("            position: relative;background-color: rgb(219, 230, 228); left:25% ;height: 100%;width: 50%;\n");
      out.write("        }header{\n");
      out.write("            position:relative;height: 8%;background-color: #4caf50;\n");
      out.write("        }.AlinharETamanhoDoCampoDeTexto{\n");
      out.write("            position: absolute;left: 200px;width:300px; \n");
      out.write("        }#BotaoSair{\n");
      out.write("            background-color: #4caf50;\n");
      out.write("            padding: 15px 32px;\n");
      out.write("            color:white;\n");
      out.write("            border:solid white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            margin-left:90%;\n");
      out.write("        }.FonteDeTexto{\n");
      out.write("            font-family:arial ;\n");
      out.write("          \n");
      out.write("        } \n");
      out.write("        </style>\n");
      out.write("<link href=\"CSS/Decorar.css\">  \n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("  alert('jQuery Loaded!');//<i>italico,<u>sublinhado,<strong>negrito,<Strike>risco/Tachado.<audio src=\"\" controls=\"Controls\" type=\"audio.mp3\" autoplay=\"\"/>\n");
      out.write("});\n");
      out.write("function Executa(){\n");
      out.write("               \n");
      out.write("                \n");
      out.write("   //  alert($(\"#Uma\"));   \n");
      out.write("            \n");
      out.write("                  \n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    $(document).ready(function(){\n");
      out.write("         $(\"#Data\").mask('00/00/00');\n");
      out.write("     });\n");
      out.write("    </script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body class=\"TelaDefundo\">\n");
      out.write("        <header class=\"FonteDeTexto\">Pesquisar nome \n");
      out.write("            <div style=\"margin-left: 30%;\"> Bem-Vindo  <a href=\"\" id=\"BotaoSair\">Sair</a></div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("</header>\n");
      out.write("        <section>\n");
      out.write("     \n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td><img src=\"http://lorempixel.com/300/300/cats\" style=\" border-radius: 25px;\"/></td>\n");
      out.write("                    <td>\n");
      out.write("        <ul><div>Preço consulta</div>\n");
      out.write("            <li >Gato(R$ 50)</li>\n");
      out.write("            <li>Cachorro(R$ 70)</li>\n");
      out.write("            <li>Passaro(<strike>R$ 40</strike> por R$ 20)</li>\n");
      out.write("        </ul>\n");
      out.write("        </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table> \n");
      out.write("           <br>             \n");
      out.write("           <form action=\"\">\n");
      out.write("               <fieldset style=\"border-color:gray;\">\n");
      out.write("            <legend> Formulario: </legend>\n");
      out.write("          \n");
      out.write("                <label for=\"um\">Dono:</label><input type=\"text\" name=\"Dono\"  placeholder=\"carlos\" id=\"um\" class=\"AlinharETamanhoDoCampoDeTexto\"/><br><br>\n");
      out.write("                <label for=\"dois\">Nome do animal:</label><input type=\"text\" name=\"AnimalNome\" value=\"\" placeholder=\"bob\" id=\"dois\" class=\"AlinharETamanhoDoCampoDeTexto\"/><br><br>\n");
      out.write("                <label for=\"Data\">Dono:</label>  <input type=\"date\" name=\"\" value=\"\" id=\"Data\" class=\"AlinharETamanhoDoCampoDeTexto\"/><br><br>\n");
      out.write("            <div>Raças:  </div>\n");
      out.write("            <input type=\"radio\" name=\"Raça\" value=\"\" checked=\"checked\" />Gato\n");
      out.write("            <input type=\"radio\" name=\"Raça\" value=\"\" />Cachorro\n");
      out.write("            <input type=\"radio\" name=\"Raça\" value=\"\" />Passaro\n");
      out.write("           <br>\n");
      out.write("            <textarea name=\"\" rows=\"4\" cols=\"40\">\n");
      out.write("            </textarea><br>\n");
      out.write("            <input type=\"submit\" value=\"Confirmar\" onclick=\"Executa() \"/>\n");
      out.write("             </fieldset>\n");
      out.write("        </form>\n");
      out.write("        </section>\n");
      out.write("         </body>\n");
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
