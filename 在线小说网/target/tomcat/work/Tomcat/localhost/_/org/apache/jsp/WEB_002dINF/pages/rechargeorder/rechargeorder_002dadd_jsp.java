/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-07-12 01:54:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.rechargeorder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rechargeorder_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>欢迎页面-X-admin2.0</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/font.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/xadmin.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/static/lib/layui/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/static/js/xadmin.js\"></script>\r\n");
      out.write("    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/html5shiv/r29/html5.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"x-body\">\r\n");
      out.write("    <form class=\"layui-form\">\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label for=\"userId\" class=\"layui-form-label\">\r\n");
      out.write("                <span class=\"x-red\">*</span>用户id\r\n");
      out.write("            </label>\r\n");
      out.write("            <div class=\"layui-input-inline\">\r\n");
      out.write("                <input type=\"text\" id=\"userId\" name=\"userId\" required=\"\" lay-verify=\"required\"\r\n");
      out.write("                       autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label for=\"rechargeMoney\" class=\"layui-form-label\">\r\n");
      out.write("                <span class=\"x-red\">*</span>充值金额\r\n");
      out.write("            </label>\r\n");
      out.write("            <div class=\"layui-input-inline\">\r\n");
      out.write("                <input type=\"text\" id=\"rechargeMoney\" name=\"rechargeMoney\" required=\"\" lay-verify=\"required\"\r\n");
      out.write("                       autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label for=\"rechargeWay\" class=\"layui-form-label\">\r\n");
      out.write("                <span class=\"x-red\">*</span>充值方式\r\n");
      out.write("            </label>\r\n");
      out.write("            <div class=\"layui-input-inline\">\r\n");
      out.write("                <select name=\"rechargeWay\" id=\"rechargeWay\" class=\"valid\">\r\n");
      out.write("                    <option>充值方式</option>\r\n");
      out.write("                    <option>支付宝</option>\r\n");
      out.write("                    <option>微信</option>\r\n");
      out.write("                    <option>银行卡</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label  class=\"layui-form-label\">\r\n");
      out.write("            </label>\r\n");
      out.write("            <button  class=\"layui-btn\" lay-filter=\"add\" lay-submit=\"\" name=\"orderadd\">\r\n");
      out.write("                增加\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['form','layer'], function(){\r\n");
      out.write("        $ = layui.jquery;\r\n");
      out.write("        var form = layui.form\r\n");
      out.write("            ,layer = layui.layer;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        //监听提交\r\n");
      out.write("        form.on('submit(add)', function(data){\r\n");
      out.write("            // console.log(data)\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:\"post\",\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rechargeorder/add\",\r\n");
      out.write("                data:data.field,\r\n");
      out.write("                dataType:\"json\",\r\n");
      out.write("                success:function (data) {\r\n");
      out.write("                    console.log(data);\r\n");
      out.write("                    layer.alert(data.msg, {icon: data.code == 200 ? 6 : 5},function () {\r\n");
      out.write("                        // 获得frame索引\r\n");
      out.write("                        var index = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("                        //关闭当前frame\r\n");
      out.write("                        parent.layer.close(index);\r\n");
      out.write("                        parent.location.replace(parent.location.href);\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("            layer.alert(\"增加成功\", {icon: 6},function () {\r\n");
      out.write("                // 获得frame索引\r\n");
      out.write("                var index = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("                //关闭当前frame\r\n");
      out.write("                parent.layer.close(index);\r\n");
      out.write("            });\r\n");
      out.write("            return false;\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
