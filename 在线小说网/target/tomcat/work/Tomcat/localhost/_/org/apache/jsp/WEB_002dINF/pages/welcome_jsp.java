/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-07-12 00:42:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>欢迎页</title>\n");
      out.write("        <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"/static/css/font.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/static/css/xadmin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"x-body layui-anim layui-anim-up\">\n");
      out.write("        <blockquote class=\"layui-elem-quote\">欢迎管理员：\n");
      out.write("            <span class=\"x-red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.adminName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>！当前时间:2018-04-25 20:50:53</blockquote>\n");
      out.write("        <fieldset class=\"layui-elem-field\">\n");
      out.write("            <legend>数据统计</legend>\n");
      out.write("            <div class=\"layui-field-box\">\n");
      out.write("                <div class=\"layui-col-md12\">\n");
      out.write("                    <div class=\"layui-card\">\n");
      out.write("                        <div class=\"layui-card-body\">\n");
      out.write("                            <div class=\"layui-carousel x-admin-carousel x-admin-backlog\" lay-anim=\"\" lay-indicator=\"inside\" lay-arrow=\"none\" style=\"width: 100%; height: 90px;\">\n");
      out.write("                                <div carousel-item=\"\">\n");
      out.write("                                    <ul class=\"layui-row layui-col-space10 layui-this\">\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>文章数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite>66</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>会员数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite>12</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>回复数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite>99</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>商品数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite>67</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>文章数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite>67</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>文章数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite>6766</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </fieldset>\n");
      out.write("        <fieldset class=\"layui-elem-field\">\n");
      out.write("            <legend>系统通知</legend>\n");
      out.write("            <div class=\"layui-field-box\">\n");
      out.write("                <table class=\"layui-table\" lay-skin=\"line\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td >\n");
      out.write("                                <a class=\"x-a\" href=\"/\" target=\"_blank\">新版小说系统 2.0上线了</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td >\n");
      out.write("                                <a class=\"x-a\" href=\"/\" target=\"_blank\">交流qq群:(519492808)</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </fieldset>\n");
      out.write("        <fieldset class=\"layui-elem-field\">\n");
      out.write("            <legend>系统信息</legend>\n");
      out.write("            <div class=\"layui-field-box\">\n");
      out.write("                <table class=\"layui-table\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>xxx版本</th>\n");
      out.write("                            <td>1.0.180420</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>服务器地址</th>\n");
      out.write("                            <td>x.xuebingsi.com</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>操作系统</th>\n");
      out.write("                            <td>WINNT</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>运行环境</th>\n");
      out.write("                            <td>Apache/2.4.23 (Win32) OpenSSL/1.0.2j mod_fcgid/2.3.9</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>PHP版本</th>\n");
      out.write("                            <td>5.6.27</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>PHP运行方式</th>\n");
      out.write("                            <td>cgi-fcgi</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>MYSQL版本</th>\n");
      out.write("                            <td>5.5.53</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ThinkPHP</th>\n");
      out.write("                            <td>5.0.18</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>上传附件限制</th>\n");
      out.write("                            <td>2M</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>执行时间限制</th>\n");
      out.write("                            <td>30s</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>剩余空间</th>\n");
      out.write("                            <td>86015.2M</td></tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </fieldset>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </body>\n");
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
