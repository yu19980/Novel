/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-07-18 09:19:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginauthor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>后台登陆</title>\n");
      out.write("    <meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi\" />\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/font.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/xadmin.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"/static/lib/layui/layui.js\" charset=\"utf-8\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/static/js/xadmin.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        .author{\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("        .admin{\n");
      out.write("            float:right;;\n");
      out.write("        }\n");
      out.write("        .zhuce{\n");
      out.write("            margin-left:130px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body class=\"login-bg\">\n");
      out.write("\n");
      out.write("<div class=\"login layui-anim layui-anim-up\">\n");
      out.write("    <div class=\"message\">在线小说系统</div>\n");
      out.write("    <div id=\"darkbannerwrap\"></div>\n");
      out.write("\n");
      out.write("    <form method=\"post\" class=\"layui-form\" >\n");
      out.write("        <input name=\"authorName\" placeholder=\"用户名\"  type=\"text\" lay-verify=\"required\" class=\"layui-input\" >\n");
      out.write("        <hr class=\"hr15\">\n");
      out.write("        <input name=\"authorPwd\" lay-verify=\"required\" placeholder=\"密码\"  type=\"password\" class=\"layui-input\">\n");
      out.write("        <hr class=\"hr15\">\n");
      out.write("        <input value=\"登录\" lay-submit lay-filter=\"login\" style=\"width:100%;\" type=\"submit\">\n");
      out.write("        <hr class=\"hr20\" >\n");
      out.write("    </form>\n");
      out.write("    <a  class=\"author\"  href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/duzhe'>读者</a>\n");
      out.write("    <a  class=\"admin\"  href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/loginPage'>管理员</a>\n");
      out.write("    <a  class=\"zhuce\" onclick=\"x_admin_show('注册账号','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/addPage',600,400)\">注册</a>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    $(function  () {\n");
      out.write("        layui.use('form', function(){\n");
      out.write("            var form = layui.form;\n");
      out.write("            // layer.msg('玩命卖萌中', function(){\n");
      out.write("            //   //关闭后的操作\n");
      out.write("            //   });\n");
      out.write("            // //监听提交\n");
      out.write("            form.on('submit(login)', function(data){\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"post\",// 提交表单的方法\n");
      out.write("                    url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/loginauthor\",// 对应登陆接口的路径\n");
      out.write("                    data: data.field,// 提交的数据\n");
      out.write("                    dataType: \"json\",// 服务端返回的数据类型\n");
      out.write("                    success:function (data) {// 服务器返回数据之后的回调函数\n");
      out.write("\n");
      out.write("                        layer.msg(data.msg,function(){\n");
      out.write("\n");
      out.write("                            if(data.code === 200){\n");
      out.write("\n");
      out.write("                                  location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/zuoping'\n");
      out.write("                                // location.href='index.jsp'\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                return false;\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    })\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 底部结束 -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
