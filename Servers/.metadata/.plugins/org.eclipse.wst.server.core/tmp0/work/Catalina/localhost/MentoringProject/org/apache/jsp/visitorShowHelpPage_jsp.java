/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-05-31 04:55:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class visitorShowHelpPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  }

  public void _jspDestroy() {
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
      out.write("\t<head>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
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
      out.write("\t</head>\n");
      out.write("\t\t<body>\n");
      out.write("\t\t    <header id=\"header\">\n");
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
      out.write("                        <li><a href=\"visitorShowHelpPage.jsp\">도움말</a></li>\n");
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
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <div class=\"cont\">\n");
      out.write("\t\t\n");
      out.write("    \n");
      out.write(" \n");
      out.write("\t\t<div class=\"tab\">\n");
      out.write("\t\t  <button class=\"tablinks active\" onclick=\"openTab(event, 'tab1')\">도움말</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"tab1\" class=\"tabcontent\" style=\"display: block;\">\n");
      out.write("\t\t <ol id=\"help-content\"> \n");
      out.write("\t  <li>\n");
      out.write("\t   <span id=\"faq-title\">일반</span> \n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-1-1\"><span id=\"que-1-1-toggle\" ></span>\n");
      out.write("\t\t  <span>'마스터'란 무엇인가요?</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-1-1\" style=\"display: none\">\n");
      out.write("\t\t  \t\t마스터란 해당분야의 전문지식이 있는 사용자를 지칭합니다.<br>\n");
      out.write("\t\t\t\t마스터는 제다이와의 만남을 통해 제다이에게 포스를 전수해 줄 수 있습니다.<br>\n");
      out.write("\t\t\t\t일반적으로 멘토의 역할이 됩니다.<br>\n");
      out.write("\t\t\t\t마스터는 관리자 인증 절차를 거쳐야 진정한 마스터로 거듭날 수 있습니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t<button class=\"question\" id=\"que-1-2\"><span id=\"que-1-2-toggle\"></span>\n");
      out.write("\t\t<span>'제다이'란 무엇인가요?</span></button>\n");
      out.write("\t\t<div class=\"answer\" id=\"ans-1-2\" style=\"display: none\">\n");
      out.write("\t\t\t\t제다이란 전문지식이 있는 사용자의 도움을 필요로 하는 사용자를 지칭합니다.<br>\n");
      out.write("\t\t\t\t제다이는 마스터와의 만남을 통해 포스를 전수 받을 수 있습니다.<br>\n");
      out.write("\t\t\t\t일반적으로 멘티의 역할이 됩니다.<br>\n");
      out.write("\t\t\t\t제다이는 가입만 한다면 누구나 될 수 있습니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-1-3\"><span id=\"que-1-3-toggle\"></span>\n");
      out.write("\t\t  <span>'포스'란 무엇인가요?</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-1-3\" style=\"display: none\">\n");
      out.write("\t\t  \t\t포스란 전문지식을 세분화 한 것을 지칭합니다.<br>\n");
      out.write("\t\t\t\t마스터는 제다이에게 포스를 전수해 줄 수 있으며,<br>\n");
      out.write("\t\t\t\t제다이는 마스터에게 포스를 전수 받을 수 있습니다<br>\n");
      out.write("\t\t\t\t일반적으로 메인포스는 대분류이며 서브포스는 세부분류 입니다.<br>\n");
      out.write("\t\t\t\t포스는 마스터만 등록 할 수 있습니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-1-4\"><span id=\"que-1-4-toggle\"></span>\n");
      out.write("\t\t  <span>'포터링'이란 무엇인가요?</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-1-4\" style=\"display: none\">\n");
      out.write("\t\t  \t\t포터링이란 마스터와 제다이의 만남을 통해 포스가 전수 되어지는 일련의 행위를 지칭 합니다.<br>\n");
      out.write("\t\t\t\t포터링을 통하여 제다이는 조금 더 마스터에 다다를 수 있으며, 마스터는 포스력을 쌓아갑니다.<br>\n");
      out.write("\t\t\t\t일반적으로 멘토링의 행위 입니다.<br>\n");
      out.write("\t\t\t\t포터링이 이루어지기 위해서는 제다이가 마스터에게 포터링 신청을 하고 마스터가 수락을 해야 합니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<br>\n");
      out.write("\t  <li>\n");
      out.write("\t  <span id=\"faq-title\">가입/변경/탈퇴</span>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-2-1\"><span id=\"que-2-1-toggle\"></span>\n");
      out.write("\t\t  <span>마스터로 가입하려면 어떻게하면 되나요?</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-2-1\" style=\"display: none\">\n");
      out.write("\t\t  \t\t처음부터 멘토로 가입하시는 것은불가능 합니다.<br>\n");
      out.write("\t\t\t\t최초로 일반 유저로 회원가입 하신 후 멘토가 되어보세요를 클릭하시면 멘토로 가입신청이 가능합니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t<button class=\"question\" id=\"que-2-2\"><span id=\"que-2-2-toggle\"></span>\n");
      out.write("\t\t<span>등록된 전화번호를 바꾸고 싶어요.</span></button>\n");
      out.write("\t\t<div class=\"answer\" id=\"ans-2-2\" style=\"display: none\">\n");
      out.write("\t\t\t\t내 프로필 > 프로필 관리 > 개인정보 변경 메뉴에서 전화번호 인증을 거친 후에<br>\n");
      out.write("\t\t\t\t새로운 전화번호로 변경할 수 있습니다.<br>\n");
      out.write("\t\t\t\t내 프로필 > 프로필 설정 > 개인정보 변경 메뉴에 진입해 바꾸고 싶은 전화번호로 변경해보세요.<br>\n");
      out.write("                한번 변경 후에는 더이상 수정이 불가하니 신중하게 선택해주세요.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-2-3\"><span id=\"que-2-3-toggle\"></span>\n");
      out.write("\t\t  <span>탈퇴하고 싶어요.</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-2-3\" style=\"display: none\">\n");
      out.write("\t\t  \t\t내 프로필 > 프로필 관리 > 회원탈퇴 메뉴에서 탈퇴 할 수 있습니다.<br>\n");
      out.write("\t\t\t\t탈퇴는 가입시 등록되어 있던 회원님의 회원 정보를 모두 삭제하는 기능입니다.<br>\n");
      out.write("                한 번 탈퇴한 후에는 기존의 데이터는 사용할 수 없습니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-2-4\"><span id=\"que-2-4-toggle\"></span>\n");
      out.write("\t\t  <span>탈퇴 후 재가입이 가능한가요?</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-2-4\" style=\"display: none\">\n");
      out.write("\t\t  \t\t탈퇴 후 재가입은 가능 하지만 기존에 사용한 것과 동일한 이메일 또는<br>\n");
      out.write("\t\t\t\t동일한 연락처로는 가입이 불가능 합니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<br>\n");
      out.write("\t  <li>\n");
      out.write("\t  \t  <span id=\"faq-title\">신고/이용제한</span>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-3-1\"><span id=\"que-3-1-toggle\"></span>\n");
      out.write("\t\t  <span>불량 사용자를 신고하고싶어요.</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-3-1\" style=\"display: none\">\n");
      out.write("\t\t  \t\t신고는 QnA를 통하여 가능합니다.<br>\n");
      out.write("\t\t\t\t불량 사용자로 신고를 당하거나 취지에 맞지 않는 행위를 한 사용자에게는<br>\n");
      out.write("\t\t\t\t관리자 직권으로 이용제한을 할 수 있습니다.<br>\n");
      out.write("\t\t\t\t이용제한이 잦거나 사안이 심각 한 경우 영구 제한될 수 있으므로 주의해주세요.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t<button class=\"question\" id=\"que-3-2\"><span id=\"que-3-2-toggle\"></span>\n");
      out.write("\t\t<span>당일 예약취소를 하면 어떻게 되나요?</span></button>\n");
      out.write("\t\t<div class=\"answer\" id=\"ans-3-2\" style=\"display: none\">\n");
      out.write("\t\t\t\t일방적인 당일 예약취소를 할 경우 선 예약 취소자에게 패널티가 부과되며<br>\n");
      out.write("\t\t\t\t당일 예약취소를 반복할 경우 계정이 제한되므로 주의해주세요.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<br>\n");
      out.write("\t  <li>\n");
      out.write("\t  \t  <span id=\"faq-title\">스케쥴</span>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-4-1\"><span id=\"que-4-1-toggle\"></span>\n");
      out.write("\t\t  <span>스케쥴 관리는 어떻게하면 되나요?</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-4-1\" style=\"display: none\">\n");
      out.write("\t\t  \t\t내 프로필 > 프로필 관리 > 스케쥴 관리 메뉴에서 스케쥴을 관리 할 수 있습니다.<br>\n");
      out.write("\t\t\t\t단, 이미 완료된 스케쥴이거나 현재시점보다 과거는 스케쥴을 등록/수정/삭제를 할 수 없으니 주의해 주세요.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t  </li>\n");
      out.write("\t  <br>\n");
      out.write("\t  <li>\n");
      out.write("\t  \t  <span id=\"faq-title\">이용요금/결제 및 환불</span>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-5-1\"><span id=\"que-5-1-toggle\"></span>\n");
      out.write("\t\t  <span>서비스는 무료인가요?</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-5-1\" style=\"display: none\">\n");
      out.write("\t\t  \t\t저희는 멘토링 서비스를 제공하며, 고객님은 자유롭게 궁금한 종목을 검색하여 <br>\n");
      out.write("\t\t  \t\t해당 종목을 등록한 마스터와 그 세부 종목을 확인할 수 있습니다.<br>\n");
      out.write("\t\t  \t\t이 모든 서비스는 무료로 제공됩니다.<br>\n");
      out.write("\t\t\t\t단, ‘포터링’ 서비스의 경우 마스터와의 만남을 예약하면서 비용을 결제하게 되는데,<br>\n");
      out.write("\t\t\t\t이는 저희가 아닌 만남을 제공하는 마스터에게 지불되는 것입니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t<button class=\"question\" id=\"que-5-2\"><span id=\"que-5-2-toggle\"></span>\n");
      out.write("\t\t<span>결제 완료 후 인증 토큰이 생성 되지 않아요. 어떻게 하나요?</span></button>\n");
      out.write("\t\t<div class=\"answer\" id=\"ans-5-2\" style=\"display: none\">\n");
      out.write("\t\t\t\t1. 결제 계좌번호를 올바르게 입력하셨는지 다시 한번 확인해주세요.<br>\n");
      out.write("                결제 계좌번호 입력창에는 해당 은행과 본인 명의의 계좌번호 그리고 입금자명을 정확히 입력해 주셔야 합니다.<br>\n");
      out.write("                예) ㅇㅇ은행 000-0000-0000 홍길동<br><br>\n");
      out.write("                \n");
      out.write("                2. 일부 지역의 경우 인터넷 사정에 따라 결제가 완료되기까지 다소 시간이 걸릴 수 있습니다.<br>\n");
      out.write("                하루가 지나도 인증토큰이 발행되지 않을 경우 고객센터를 통해 문의해주세요.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-5-3\"><span id=\"que-5-3-toggle\"></span>\n");
      out.write("\t\t  <span>결제 취소 후 환불 완료까지는 얼마나 걸리죠?</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-5-3\" style=\"display: none\">\n");
      out.write("\t\t  \t\t신용카드및 체크카드의 경우, 결제 취소 후 취소 완료(환불 완료)까지 3~4일 정도 소요되며,<br>\n");
      out.write("\t\t\t\t계좌이체 및 실시간이체의 경우 일주일 정도 소요될 수 있습니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t  </li> \n");
      out.write("\t  <br> \n");
      out.write("\t  <li>\n");
      out.write("\t  \t  <span id=\"faq-title\">기타</span>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-6-1\"><span id=\"que-6-1-toggle\"></span>\n");
      out.write("\t\t  <span>해외에서 사용하고 싶어요. 어떻게 하나요?</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-6-1\" style=\"display: none\">\n");
      out.write("\t\t  \t\t해외지역은 현재 서비스 준비중 입니다.<br>\n");
      out.write("\t\t\t\t추후에 지역 입력란에 해당 국가를 선택하신 후, 위치 인증을 거치시면<br>\n");
      out.write("\t\t\t\t사용이 가능하도록 서비스를 준비 중에 있으니 조금만 기다려 주세요!<br>\n");
      out.write("\t\t\t\t감사합니다.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t<button class=\"question\" id=\"que-6-2\"><span id=\"que-6-2-toggle\"></span>\n");
      out.write("\t\t<span>검색결과에 원하는 내용이 없는 경우에는 어떻게 하나요?</span></button>\n");
      out.write("\t\t<div class=\"answer\" id=\"ans-6-2\" style=\"display: none\">\n");
      out.write("\t\t\t\t검색한 키워드와 유사한 키워드로 재검색하시거나,<br>\n");
      out.write("\t\t\t\t화면 하단에 마스터 포스 키워드 / 분야 키워드를 참고하여 재검색해보세요.</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"faq-content\">\n");
      out.write("\t\t  <button class=\"question\" id=\"que-6-3\"><span id=\"que-6-3-toggle\"></span>\n");
      out.write("\t\t  <span>추가 문의하기</span></button>\n");
      out.write("\t\t  <div class=\"answer\" id=\"ans-6-3\" style=\"display: none\">\n");
      out.write("\t\t  \t\t원하시는 답변을 찾지못하셨다면, 고객센터로 문의해 주세요.<br>\n");
      out.write("\t\t\t\t<a href=\"\">직접입력하여 문의하기</a></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t  </li>  \n");
      out.write("\t  </div>\n");
      out.write("\t </div> \n");
      out.write("\t \n");
      out.write("\t<!-- </ol><br> -->\n");
      out.write("\t\t <footer id=\"footer\">\n");
      out.write("        <div class=\"row\">\n");
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
      out.write("\t\t\n");
      out.write("\t<style>\n");
      out.write("\t\t\n");
      out.write("\t\t.tab {\n");
      out.write("\t\t  width: 100%;\n");
      out.write("\t\t  height: 50px;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.tablinks {\n");
      out.write("\t\t  float: left;\n");
      out.write("\t\t  width: 33%;\n");
      out.write("\t\t  height: 100%;\n");
      out.write("\t\t  border: none;\n");
      out.write("\t\t  outline: none;\n");
      out.write("\t\t  font-size: 16px;\n");
      out.write("\t\t  font-weight: bold;\n");
      out.write("\t\t  color: #a6a6a6;\n");
      out.write("\t\t  background-color: #fff;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.tablinks.active {\n");
      out.write("\t\t  color: #000;\n");
      out.write("\t\t  background-color: #a6a6a6;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\t    <!-- 목차 클릭시 내용 접기/ 펴기 스타일-->\n");
      out.write("\t<style>\n");
      out.write("\t  .answer {\n");
      out.write("\t    display: none;\n");
      out.write("\t    padding-bottom: 30px;\n");
      out.write("\t  }\n");
      out.write("\t  #faq-title {\n");
      out.write("\t    font-size: 25px;\n");
      out.write("\t  }\n");
      out.write("\t  .faq-content {\n");
      out.write("\t    border-bottom: 1px solid #e0e0e0;\n");
      out.write("\t  }\n");
      out.write("\t  .question {\n");
      out.write("\t    font-size: 15px;\n");
      out.write("\t    padding: 20px 0;\n");
      out.write("\t    cursor: pointer;\n");
      out.write("\t    border: none;\n");
      out.write("\t    outline: none;\n");
      out.write("\t    background: none;\n");
      out.write("\t    width: 100%;\n");
      out.write("\t    text-align: left;\n");
      out.write("\t  }\n");
      out.write("\t  .question:hover {\n");
      out.write("\t    color: #2962ff;\n");
      out.write("\t  }\n");
      out.write("\t  [id$=\"-toggle\"] {\n");
      out.write("\t    margin-right: 10px;\n");
      out.write("\t  }\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t<!-- 목차 탭 스크립트-->\t  \t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction openTab(evt, tabName) {\n");
      out.write("\t\t    var i, tabcontent, tablinks;\n");
      out.write("\t\t    tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("\t\t    for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("\t\t      tabcontent[i].style.display = \"none\";\n");
      out.write("\t\t    }\n");
      out.write("\t\t    tablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("\t\t    for (i = 0; i < tablinks.length; i++) {\n");
      out.write("\t\t      tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("\t\t    }\n");
      out.write("\t\t    document.getElementById(tabName).style.display = \"block\";\n");
      out.write("\t\t    evt.currentTarget.className += \" active\";\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t</script>\t\t\t\n");
      out.write("      \n");
      out.write("    \t\n");
      out.write("\t<script>\n");
      out.write("\t  const items = document.querySelectorAll('.question');\n");
      out.write("\t\n");
      out.write("\t  function openCloseAnswer() {\n");
      out.write("\t    const answerId = this.id.replace('que', 'ans');\n");
      out.write("\t\n");
      out.write("\t    if(document.getElementById(answerId).style.display === 'block') {\n");
      out.write("\t      document.getElementById(answerId).style.display = 'none';\n");
      out.write("\t      document.getElementById(this.id + '-toggle').textContent = '+';\n");
      out.write("\t    } else {\n");
      out.write("\t      document.getElementById(answerId).style.display = 'block';\n");
      out.write("\t      document.getElementById(this.id + '-toggle').textContent = '-';\n");
      out.write("\t    }\n");
      out.write("\t  }\n");
      out.write("\t\n");
      out.write("\t  items.forEach(item => item.addEventListener('click', openCloseAnswer));\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t</body>\n");
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
}
