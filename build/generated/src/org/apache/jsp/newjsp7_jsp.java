package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp7_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("　　<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("　　<html>\n");
      out.write("　　<head>\n");
      out.write("　　<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("　　<title>Export to Excel - Demo</title>\n");
      out.write("　　</head>\n");
      out.write("　　<body>\n");
      out.write("        ");

            String exportToExcel = (String) request.getAttribute("exportToExcel");
            if (exportToExcel != null && exportToExcel.toString().equalsIgnoreCase("YES")) {

                response.setContentType("application/vnd.ms-excel;charset=gb2312");

                response.setHeader("Content-Disposition", "attachment;filename=" + "excel.xls");
            }
        
      out.write("\n");
      out.write("　　<table align=\"left\" border=\"2\">\n");
      out.write("　　<thead>\n");
      out.write("　　<tr bgcolor=\"lightgreen\">\n");
      out.write("　　<th>Sr. No.</th>\n");
      out.write("　　<th>Text Data</th>\n");
      out.write("　　<th>Number Data</th>\n");
      out.write("　　</tr>\n");
      out.write("　　</thead>\n");
      out.write("　　<tbody>\n");
      out.write("                ");
 for (int i = 0; i < 10; i++) {
      out.write("\n");
      out.write("　　<tr bgcolor=\"lightblue\">\n");
      out.write("　　<td align=\"center\">");
      out.print(i + 1);
      out.write("</td>\n");
      out.write("　　<td align=\"center\">This is text data ");
      out.print(i);
      out.write("</td>\n");
      out.write("　　<td align=\"center\">");
      out.print(i * i);
      out.write("</td>\n");
      out.write("　　</tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("　　</tbody>\n");
      out.write("　　</table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"DbExportFileServlet\">\n");
      out.write("            \n");
      out.write("                        <input type=\"submit\" value=\"saveAs\" name=\"saveAs\">\n");
      out.write("                        <input type=\"hidden\" name=\"exportToExcel\">  \n");
      out.write("                   \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("　　</body>\n");
      out.write("　　</html>\n");
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