/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-19 22:00:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Account;
import java.util.List;
import java.util.ArrayList;

public final class mainpagehello_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    body {\r\n");
      out.write("\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("        justify-content: center;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        font-family: \"fira-sans-2\", Verdana, sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    .overlay {\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        width: 0;\r\n");
      out.write("        position: fixed;\r\n");
      out.write("        z-index: 1;\r\n");
      out.write("        top: 0;\r\n");
      out.write("        left: 0;\r\n");
      out.write("        background-color: rgb(0,0,0);\r\n");
      out.write("        background-color: rgba(0,0,0, 0.9);\r\n");
      out.write("        overflow-x: hidden;\r\n");
      out.write("        transition: 0.5s;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .overlay-content {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        top: 25%;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        margin-top: 30px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .overlay a {\r\n");
      out.write("        padding: 8px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        font-size: 36px;\r\n");
      out.write("        color: #818181;\r\n");
      out.write("        display: block;\r\n");
      out.write("        transition: 0.3s;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .overlay a:hover, .overlay a:focus {\r\n");
      out.write("        color:#39cccc;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .overlay .closebtn {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        top: 20px;\r\n");
      out.write("        right: 45px;\r\n");
      out.write("        font-size: 60px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    @media screen and (max-height: 450px) {\r\n");
      out.write("        .overlay a {font-size: 20px}\r\n");
      out.write("        .overlay .closebtn {\r\n");
      out.write("            font-size: 40px;\r\n");
      out.write("            top: 15px;\r\n");
      out.write("            right: 35px;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    p1{\r\n");
      out.write("        margin-left: 16px;\r\n");
      out.write("        font-size: 30px;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #q-graph {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        display: block; /* fixes layout wonkiness in FF1.5 */\r\n");
      out.write("        position: relative;\r\n");
      out.write("        width: 600px;\r\n");
      out.write("        height: 300px;\r\n");
      out.write("        margin: 1.1em 0 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        background: transparent;\r\n");
      out.write("        font-size: 11px;\r\n");
      out.write("        margin-left: 35%;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #q-graph caption {\r\n");
      out.write("        caption-side: top;\r\n");
      out.write("        width: 600px;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        letter-spacing: .5px;\r\n");
      out.write("        top: -40px;\r\n");
      out.write("        position: relative;\r\n");
      out.write("        z-index: 10;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #q-graph tr, #q-graph th, #q-graph td {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        bottom: 0;\r\n");
      out.write("        width: 150px;\r\n");
      out.write("        z-index: 2;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #q-graph td {\r\n");
      out.write("        transition: all .3s ease;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #q-graph thead tr {\r\n");
      out.write("        left: 100%;\r\n");
      out.write("        top: 50%;\r\n");
      out.write("        bottom: auto;\r\n");
      out.write("        margin: -2.5em 0 0 5em;}\r\n");
      out.write("    #q-graph thead th {\r\n");
      out.write("        width: 7.5em;\r\n");
      out.write("        height: auto;\r\n");
      out.write("        padding: 0.5em 1em;\r\n");
      out.write("    }\r\n");
      out.write("    #q-graph thead th.sent {\r\n");
      out.write("        top: 0;\r\n");
      out.write("        left: 0;\r\n");
      out.write("        line-height: 2;\r\n");
      out.write("    }\r\n");
      out.write("    #q-graph thead th.paid {\r\n");
      out.write("        top: 2.75em;\r\n");
      out.write("        line-height: 2;\r\n");
      out.write("        left: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #q-graph tbody tr {\r\n");
      out.write("        height: 296px;\r\n");
      out.write("        padding-top: 2px;\r\n");
      out.write("        border-right: 1px dotted #C4C4C4;\r\n");
      out.write("        color: #AAA;\r\n");
      out.write("    }\r\n");
      out.write("    #q-graph #q1 {\r\n");
      out.write("        left: 0;\r\n");
      out.write("    }\r\n");
      out.write("    #q-graph #q2 {left: 150px;}\r\n");
      out.write("    #q-graph #q3 {left: 300px;}\r\n");
      out.write("    #q-graph #q4 {left: 450px; border-right: none;}\r\n");
      out.write("    #q-graph tbody th {bottom: -1.75em; vertical-align: top;\r\n");
      out.write("        font-weight: normal; color: #333;}\r\n");
      out.write("    #q-graph .bar {\r\n");
      out.write("        width: 60px;\r\n");
      out.write("        border: 1px solid;\r\n");
      out.write("        border-bottom: none;\r\n");
      out.write("        color: #000;\r\n");
      out.write("    }\r\n");
      out.write("    #q-graph .bar p {\r\n");
      out.write("        margin: 5px 0 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        opacity: .4;\r\n");
      out.write("    }\r\n");
      out.write("    #q-graph .sent {\r\n");
      out.write("        left: 13px;\r\n");
      out.write("        background-color:#39cccc;\r\n");
      out.write("        border-color: transparent;\r\n");
      out.write("    }\r\n");
      out.write("    #q-graph .paid {\r\n");
      out.write("        left: 77px;\r\n");
      out.write("        background-color: #39cccc;\r\n");
      out.write("        border-color: transparent;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    #ticks {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        top: -300px;\r\n");
      out.write("        left: 2px;\r\n");
      out.write("        width: 596px;\r\n");
      out.write("        height: 300px;\r\n");
      out.write("        z-index: 1;\r\n");
      out.write("        margin-bottom: -300px;\r\n");
      out.write("        font-size: 10px;\r\n");
      out.write("        font-family: \"fira-sans-2\", Verdana, sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #ticks .tick {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        border-bottom: 1px dotted #C4C4C4;\r\n");
      out.write("        width: 600px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #ticks .tick p {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        left: -5em;\r\n");
      out.write("        top: -0.8em;\r\n");
      out.write("        margin: 0 0 0 0.5em;\r\n");
      out.write("    }\r\n");
      out.write("    .container {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        padding: 5px;\r\n");
      out.write("    }\r\n");
      out.write("    body {font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("\r\n");
      out.write("    /* The Modal (background) */\r\n");
      out.write("    .modal {\r\n");
      out.write("        display: none; /* Hidden by default */\r\n");
      out.write("        position: fixed; /* Stay in place */\r\n");
      out.write("        z-index: 1; /* Sit on top */\r\n");
      out.write("        padding-top: 100px; /* Location of the box */\r\n");
      out.write("        left: 0;\r\n");
      out.write("        top: 0;\r\n");
      out.write("        width: 100%; /* Full width */\r\n");
      out.write("        height: 100%; /* Full height */\r\n");
      out.write("        overflow: auto; /* Enable scroll if needed */\r\n");
      out.write("        background-color: rgb(0,0,0); /* Fallback color */\r\n");
      out.write("        background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Modal Content */\r\n");
      out.write("    .modal-content {\r\n");
      out.write("        background-color: #fefefe;\r\n");
      out.write("        margin: auto;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        border: 1px solid #888;\r\n");
      out.write("        width: 80%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* The Close Button */\r\n");
      out.write("    .close {\r\n");
      out.write("        color: #aaaaaa;\r\n");
      out.write("        float: right;\r\n");
      out.write("        font-size: 28px;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .close:hover,\r\n");
      out.write("    .close:focus {\r\n");
      out.write("        color: #000;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("    input[type=text] {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 12px 20px;\r\n");
      out.write("        margin: 8px 0;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        border: none;\r\n");
      out.write("        border-bottom: 2px solid #39cccc;\r\n");
      out.write("    }\r\n");
      out.write("    input[type=button] {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 12px 20px;\r\n");
      out.write("        margin: 8px 0;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        border-top-left-radius: 15px;\r\n");
      out.write("        border-bottom-right-radius: 15px;\r\n");
      out.write("        background:#39cccc;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    .butonpop-up {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 12px 20px;\r\n");
      out.write("        margin: 8px 0;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        border-top-left-radius: 15px;\r\n");
      out.write("        border-top-right-radius: 15px;\r\n");
      out.write("        border-bottom-right-radius: 15px;\r\n");
      out.write("        border-bottom-left-radius: 15px;\r\n");
      out.write("        background: #39cccc;\r\n");
      out.write("    }\r\n");
      out.write("    input[type=submit] {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 12px 20px;\r\n");
      out.write("        margin: 8px 0;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        border-top-left-radius: 15px;\r\n");
      out.write("        border-top-right-radius: 15px;\r\n");
      out.write("        border-bottom-right-radius: 15px;\r\n");
      out.write("        border-bottom-left-radius: 15px;\r\n");
      out.write("        background: #39cccc;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<head>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p style=\"font-size: 30px;text-align: center;position: center;padding-top: 10px;\" align=\"center\">\r\n");
      out.write("<div id=\"myNav\" class=\"overlay\">\r\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("    <div class=\"overlay-content\">\r\n");
      out.write("        <a href=\"#\">Pagina Hello</a>\r\n");
      out.write("        <a href=\"#\">Prieteni</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<span style=\"font-size:30px;cursor:pointer;alignment:center;text-align: center;\" onclick=\"openNav()\">&#9776; Open Menu </span>\r\n");
      out.write("<p style=\"font-size: 30px;text-align: center;position: center;padding-top: 10px;\" align=\"center\">\r\n");
      out.write("    ");

        if (request.getAttribute("name") != null) {
            out.print("Hello, " + request.getAttribute("name"));
            out.print("<br>");
            out.print("<br>");

        }
    
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<p1>Your Cards :</p1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    <div class=\"w3-container\" style=\"width: 100%;text-align: center;\">\r\n");
      out.write("\r\n");
      out.write("        <p>");

            if (request.getAttribute("accounts")!=null){
                String it="0";
                for (Account account:(List<Account>)request.getAttribute("accounts")){
                    it=Integer.toString(Integer.parseInt(it)+1);
                    String nr_card=" <div class=\"w3-card-4\" style=\"width:25%;display:inline-block;margin:2%;\">\n" +
                            "            <header class=\"\">\n" +
                            "                <h3>"+account.getNrCard()+"</h3>\n" +
                            "            </header>\n" +
                            "            <div class=\"w3-container\">\n" +
                            "                <p>"+account.getValuta()+"</p><br>\n" +
                            "                <hr>\n" +
                            "                <p>"+account.getAmount()+"</p><br>\n" +

                            "            </div>\n" +
                            "            <button id='myBtn"+it+"' class=\"butonpop-up\" >Depunere/Retragere</button>\n" +

                            "        </div>" +
                            "<div id=\"myModal"+it+"\" class=\"modal\">\n" +
                            "\n" +
                            "            <!-- Modal content -->\n" +
                            "            <div class=\"modal-content\">\n" +
                            "                <span class=\"close\">&times;</span>\n" +
                            "                <form method='post' action='/mainpagehello'>\n" +
                            "                    <label for=\"suma\">Introduceti Suma</label>\n" +
                            "                    <input type=\"text\" id=\"suma\" name=\"suma\">\n" +
                            "                    <input type='hidden' name='nrCardcont' value='"+account.getNrCard()+"'>\n" +
                            "                    <input type='submit' name='Confirmati suma' value='Confirmati suma'/>\n" +
                            "                    <input type='hidden' name='userName' value='"+request.getAttribute("name")+"'>\n"+
                            "                </form>\n" +
                            "            </div>\n" +
                            "\n" +
                            "        </div>";
                    out.print(nr_card);
                }
            }



        
      out.write("</p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <table id=\"q-graph\" align=\"centre\">\r\n");
      out.write("        <caption>Your Total Revenue Per Account(Ron)</caption>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <p>");


            if (request.getAttribute("accounts")!=null){
                int value=0;
                for (Account account:(List<Account>)request.getAttribute("accounts")){
                    value++;
                    String nr_card=" <tr class=\"qtr\" id=\"q"+value+"\">\n" +
                            "            <td class=\"sent bar\" style=\"height:"+0.02 *account.ConversieLaRon()+"%;\"><p>"+account.ConversieLaRon()+"</p></td>\n" +
                            "        </tr> ";
                    out.print(nr_card);
                }
            }








        
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function openNav() {\r\n");
      out.write("        document.getElementById(\"myNav\").style.width = \"30%\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function closeNav() {\r\n");
      out.write("        document.getElementById(\"myNav\").style.width = \"0%\";\r\n");
      out.write("    }\r\n");
      out.write("    // Get the modal\r\n");
      out.write("    //var modal = document.getElementsByClassName('modal');\r\n");
      out.write("\r\n");
      out.write("    // Get the button that opens the modal\r\n");
      out.write("    var btn = document.getElementsByClassName(\"butonpop-up\");\r\n");
      out.write("\r\n");
      out.write("    // All page modals\r\n");
      out.write("    var modals = document.getElementsByClassName('modal');\r\n");
      out.write("\r\n");
      out.write("    // Get the <span> element that closes the modal\r\n");
      out.write("    var spans = document.getElementsByClassName(\"close\");\r\n");
      out.write("\r\n");
      out.write("    // When the user clicks the button, open the modal\r\n");
      out.write("    for (let i = 0; i < btn.length; i++) {\r\n");
      out.write("        btn[i].onclick = function() {\r\n");
      out.write("            modals[i].style.display = \"block\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // When the user clicks on <span> (x), close the modal\r\n");
      out.write("    for (let i = 0; i < spans.length; i++) {\r\n");
      out.write("        spans[i].onclick = function() {\r\n");
      out.write("            modals[i].style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // When the user clicks anywhere outside of the modal, close it\r\n");
      out.write("    window.onclick = function(event) {\r\n");
      out.write("        if (event.target == modal) {\r\n");
      out.write("            modal.style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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
