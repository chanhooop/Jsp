/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-06-01 06:58:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userFindId_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Program%20Files/Apache%20Software%20Foundation/Tomcat%208.5/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("file:/C:/Program%20Files/Apache%20Software%20Foundation/Tomcat%208.5/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1620622623430L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>TakeYourTime</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/components/loginPage.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/common.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/subpage.css\">\n");
      out.write("    <link rel=\"shortcut icon\" sizes=\"76x76\" type=\"image/x-icon\"\n");
      out.write("        href=\"https://a0.muscache.com/airbnb/static/logotype_favicon-21cc8e6c6a2cca43f061d2dcabdf6e58.ico\">\n");
      out.write("    <script src=\"js/jquery-3.5.1.min.js\"></script>\n");
      out.write("    <script src=\"js/slick.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/join.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tfunction FindIdByEmail(){\n");
      out.write("\t\tif(document.findIdEmail.username.value == \"\" || document.findIdEmail.useremail.value == \"\"){\n");
      out.write("\t\t\talert(\"내용을 입력해 주세요\");\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}else{\n");
      out.write("\t\tdocument.findIdEmail.submit();\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t/* \t\n");
      out.write("\t\turl = \"/MentoringProject/userFindIdByEmail.do\";\n");
      out.write("\t\t\topen(url , \"find\",\"toolbar=no,location=no,status=no,scrollbar=no,resizable=no,width=300,height=200\"); */\n");
      out.write("\t}\n");
      out.write("\tfunction FindIdByPhone(){\n");
      out.write("\t\tif(document.findIdPhone.username.value == \"\" || document.findIdPhone.userphone.value == \"\"){\n");
      out.write("\t\t\talert(\"내용을 입력해 주세요\");\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tdocument.findIdPhone.submit();\t\t\n");
      out.write("\t\t}\n");
      out.write("\t/* \t\n");
      out.write("\t\turl = \"/MentoringProject/userFindIdByEmail.do\";\n");
      out.write("\t\t\topen(url , \"find\",\"toolbar=no,location=no,status=no,scrollbar=no,resizable=no,width=300,height=200\"); */\n");
      out.write("\t}\n");
      out.write("\t\t\n");
      out.write("</script>\n");
      out.write("<header id=\"header\">\n");
      out.write("        <div class=\"topmenu\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <a href=\"#none\"><i class=\"fab fa-facebook-square\"></i></a>\n");
      out.write("                <a href=\"#none\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                <a href=\"#none\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                <a href=\"#none\"><i class=\"fas fa-comment-dots\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menubar row\">\n");
      out.write("            <div class=\"logo cf\">\n");
      out.write("                <!-- <svg viewBox=\"0 0 1000 1000\" role=\"presentation\" aria-hidden=\"true\" focusable=\"false\"\n");
      out.write("                        style=\"height: 1em; width: 1em; display: inline-block; fill: currentcolor;\">\n");
      out.write("                        <path\n");
      out.write("                            d=\"m499.3 736.7c-51-64-81-120.1-91-168.1-10-39-6-70 11-93 18-27 45-40 80-40s62 13 80 40c17 23 21 54 11 93-11 49-41 105-91 168.1zm362.2 43c-7 47-39 86-83 105-85 37-169.1-22-241.1-102 119.1-149.1 141.1-265.1 90-340.2-30-43-73-64-128.1-64-111 0-172.1 94-148.1 203.1 14 59 51 126.1 110 201.1-37 41-72 70-103 88-24 13-47 21-69 23-101 15-180.1-83-144.1-184.1 5-13 15-37 32-74l1-2c55-120.1 122.1-256.1 199.1-407.2l2-5 22-42c17-31 24-45 51-62 13-8 29-12 47-12 36 0 64 21 76 38 6 9 13 21 22 36l21 41 3 6c77 151.1 144.1 287.1 199.1 407.2l1 1 20 46 12 29c9.2 23.1 11.2 46.1 8.2 70.1zm46-90.1c-7-22-19-48-34-79v-1c-71-151.1-137.1-287.1-200.1-409.2l-4-6c-45-92-77-147.1-170.1-147.1-92 0-131.1 64-171.1 147.1l-3 6c-63 122.1-129.1 258.1-200.1 409.2v2l-21 46c-8 19-12 29-13 32-51 140.1 54 263.1 181.1 263.1 1 0 5 0 10-1h14c66-8 134.1-50 203.1-125.1 69 75 137.1 117.1 203.1 125.1h14c5 1 9 1 10 1 127.1.1 232.1-123 181.1-263.1z\">\n");
      out.write("                        </path>\n");
      out.write("    \t                <h2>Take Your Time</h2>\n");
      out.write("                    </svg> -->\n");
      out.write("                <h1><a href=\"home.do\">LOGO</a></h1>\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <!-- <li><a href=\"userBeMentorPage.jsp\">마스터가 되어보세요</a></li> -->\n");
      out.write("                        <li><a href=\"/MentoringProject/help.do\">도움말</a></li>\n");
      out.write("                        <li><a href=\"userSignUpPage.jsp\">회원가입</a></li>\n");
      out.write("                        <li><a href=\"userLoginPage.jsp\">로그인</a></li>\n");
      out.write("                        <!-- <li><a href=\"#article2\">Force</a></li>\n");
      out.write("                        <li><a href=\"#article4\">Master</a></li>\n");
      out.write("                        <li><a href=\"#article5\"></a></li>\n");
      out.write("                        <li><a href=\"#none\">도움말</a></li> -->\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    \t<div class=\"cont\">\n");
      out.write("    \t<div class=\"demo\">\n");
      out.write("\t\t회원 ID 찾기 페이지 입니다. \n");
      out.write("\t<div class=\"joinBox row\">\n");
      out.write("\t<form action=\"userFindIdByEmail.do\" method=\"post\" name=\"findIdEmail\" >\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\n");
      out.write("\t\t<h2>이메일로 아이디 찾기</h2>\n");
      out.write("\t\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>이름 :</td>\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"username\" placeholder=\"이름을 입력해주세요\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>이메일 :</td>\n");
      out.write("\t\t\t<td><input type=\"email\" name=\"useremail\" placeholder=\"이메일을 입력해 주세요\"></td>\n");
      out.write("\t\t</tr>\t\n");
      out.write("\t\t\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<div class=\"btn\">\n");
      out.write("\t\t\t<input type=\"button\" value=\"ID 찾기\" onclick=\"FindIdByEmail(this.form)\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"joinBox row\">\n");
      out.write("\t<form action=\"userFindIdByPhone.do\" method=\"post\" name=\"findIdPhone\">\n");
      out.write("\t\t<h2>핸드폰 번호로 아이디 찾기</h2>\n");
      out.write("\t\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>이름 :</td>\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"username\" placeholder=\"이름을 입력해주세요\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>번호 :</td>\n");
      out.write("\t\t\t<td><input type=\"tel\" name=\"userphone\" placeholder=\"핸드폰 번호를 입력해 주세요\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<div class=\"btn\">\n");
      out.write("\t\t\t<input type=\"button\" value=\"ID 찾기\" onclick=\"FindIdByPhone(this.form)\">\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t     \t<footer id=\"footer\">\n");
      out.write("        \t<div class=\"row\">\n");
      out.write("            <p>\n");
      out.write("                <a href=\"#none\">회사소개</a>\n");
      out.write("                <a href=\"#none\">사업분야</a>\n");
      out.write("                <a href=\"#none\">갤러리</a>\n");
      out.write("                <a href=\"#none\">온라인문의</a>\n");
      out.write("                <a href=\"#none\">고객센터</a>\n");
      out.write("            </p>\n");
      out.write("            <p><span>주소 : 부산광역시 해운대구 좌동 273-10</span> <span class=\"hide\"> / </span> <span>상호 : 디자인선사인</span> <span\n");
      out.write("                    class=\"hide\"> / </span>사업자등록번호 : 123-456-7890<br>\n");
      out.write("                <a href=\"tel:070-7155-19749\">Tel : 070-7155-19749</a> <span class=\"hide\"> / </span><span>Fax :\n");
      out.write("                    02-2139-1142</span> <span class=\"hide\"> / </span><a href=\"mailto:gijung23@nate.com\">E-mail :\n");
      out.write("                    gijung23@nate.com</a></p>\n");
      out.write("            <p>Copyright &copy; Sunsine.com All Rights Reserved.</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write('\n');
          out.write('	');
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /userFindId.jsp(25,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${findIdResult=='0'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t<script>\t\t\n");
          out.write("\t\t\talert(\"입력하신 정보의 아이디가 없습니다. 다시 확인해주세요.\");\n");
          out.write("\t\t</script>\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /userFindId.jsp(30,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty findIdResult}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t<script type=\"text/javascript\">\n");
          out.write("\t\tvar findIdResult = '");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
            return true;
          out.write("';\n");
          out.write("\t\t\talert(\"당신의 아이디는 \"+findIdResult+\" 입니다.\" );\n");
          out.write("\t\t\tlocation.href='userLoginPage.jsp';\n");
          out.write("\t\t</script>\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
      // /userFindId.jsp(32,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${findIdResult}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}