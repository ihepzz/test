package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<script language='javascript' type='text/javascript'>\n");
      out.write("    function getimg()\n");
      out.write("//另存为存放在服务器上图片到本地的方法\n");
      out.write("    {\n");
      out.write("        event.returnValue = false;\n");
      out.write("        show.window.location.href = imgSrc.src;\n");
      out.write("\n");
      out.write("        timer = setInterval(checkload, 100)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkload()\n");
      out.write("    {\n");
      out.write("        if (show.readyState !== \"complete\")\n");
      out.write("        {\n");
      out.write("            //调用document.execCommand方法，'Saveas'表示打开文件另存为对话框命令\n");
      out.write("            show.document.execCommand('SaveAs');\n");
      out.write("            clearInterval(timer)\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <img id=\"imgSrc\" width=\"320px\" height=\"200px\" src=\"bannerV2.jpg\" alt=\"\"/></br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <input id=\"btnSaveAs\" type=\"button\" value=\"上图另存为\" onclick=\"getimg()\"/>\n");
      out.write("        <iframe src=\"\" name=\"show\"  style=\"width:0;height:0\"></iframe>\n");
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
