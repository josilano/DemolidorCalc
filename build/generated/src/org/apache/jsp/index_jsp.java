package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estiloV1.0.css\" type=\"text/css\" />\n");
      out.write("        <title>DemolidorCalc</title>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"planoDeFundo\" style=\" background-repeat: no-repeat;height: 100%;\n");
      out.write("    width: 90%;background-size: 100%;\" background=\"imagens/temis.jpg\">\n");
      out.write("        <div id=\"imglogo\">\n");
      out.write("            <img src=\"imagens/logo_demolidor.png\" alt=\"Demolidor calc\"/>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"cxlogin\">\n");
      out.write("            <fieldset class=\"fieldlogin\">\n");
      out.write("                <form class=\"formcxlogin\" action=\"Autenticacao\" method=\"post\">\n");
      out.write("                    <label class=\"labeluser\">USUÁRIO </label><input \n");
      out.write("                        class=\"caxnome\" autocomplete=\"on\" placeholder=\"Usuário\"\n");
      out.write("                        required autofocus type=\"text\" \n");
      out.write("                        style=\"border-top-left-radius: 5px;\n");
      out.write("                        border-top-right-radius: 5px; \n");
      out.write("                        border-bottom-right-radius: 5px;\n");
      out.write("                        border-bottom-left-radius: 5px ;\n");
      out.write("                        background-color: whitesmoke; \n");
      out.write("                        border-color: grey\" name=\"txtUsuario\" /><br />\n");
      out.write("                    <label class=\"labelsenha\">SENHA </label> \n");
      out.write("                        <input class=\"caxsenha\" placeholder=\"Senha\" required \n");
      out.write("                               type=\"password\" style=\"border-top-left-radius:5px;\n");
      out.write("                               border-top-right-radius: 5px; \n");
      out.write("                               border-bottom-right-radius: 5px;\n");
      out.write("                               border-bottom-left-radius: 5px ;\n");
      out.write("                               background-color: whitesmoke; \n");
      out.write("                               border-color: grey\" name=\"txtSenha\" /><br />\n");
      out.write("                    <a class=\"forgetpass\" href=\"recuperacao.jsp\">Esqueci a senha\n");
      out.write("                    </a>\n");
      out.write("                    <input class=\"btlogin\" type=\"submit\" \n");
      out.write("                           style=\"border-top-left-radius: 5px;\n");
      out.write("                           border-top-right-radius: 5px; \n");
      out.write("                           border-bottom-right-radius: 5px;\n");
      out.write("                           border-bottom-left-radius: 5px ;\n");
      out.write("                           background-color: whitesmoke; \n");
      out.write("                           border-color: grey; border: calc; \" value=\"Login\" />\n");
      out.write("                </form>\n");
      out.write("            </fieldset>\n");
      out.write("                <h4>\n");
      out.write("<!--                uma mensagem de erro é impressa na tela caso o usuário não\n");
      out.write("                    exista ou se os dados sejam inseridos de forma incorreta-->\n");
      out.write("                    ");

                        String mensagemErro = (String) request.getAttribute("mensagemErro");
                            if(mensagemErro != null)
                                out.println(mensagemErro);
                            else
                                out.println("");
                    
      out.write("\n");
      out.write("                </h4>\n");
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
