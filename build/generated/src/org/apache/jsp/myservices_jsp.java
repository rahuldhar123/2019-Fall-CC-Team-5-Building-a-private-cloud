package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import org.bson.BsonArray;
import org.bson.BsonDocument;
import org.bson.Document;
import com.mongodb.client.MongoCursor;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;

public final class myservices_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-US\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"profile\" href=\"https://gmpg.org/xfn/11\">\n");
      out.write("\n");
      out.write("<title>My Services &#8211; user&#039;s Blog!</title>\n");
      out.write("\n");
      out.write("<link rel='dns-prefetch' href='//fonts.googleapis.com'/>\n");
      out.write("<link rel='dns-prefetch' href='//s.w.org'/>\n");
      out.write("<link rel=\"alternate\" type=\"application/rss+xml\" title=\"user&#039;s Blog! &raquo; Feed\" href=\"http://192.168.1.251/feed/\"/>\n");
      out.write("<link rel=\"alternate\" type=\"application/rss+xml\" title=\"user&#039;s Blog! &raquo; Comments Feed\" href=\"http://192.168.1.251/comments/feed/\"/>\n");
      out.write("\t\t<script type=\"text/javascript\">window._wpemojiSettings={\"baseUrl\":\"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/12.0.0-1\\/72x72\\/\",\"ext\":\".png\",\"svgUrl\":\"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/12.0.0-1\\/svg\\/\",\"svgExt\":\".svg\",\"source\":{\"concatemoji\":\"http:\\/\\/192.168.1.251\\/wp-includes\\/js\\/wp-emoji-release.min.js?ver=5.2.4\"}};!function(a,b,c){function d(a,b){var c=String.fromCharCode;l.clearRect(0,0,k.width,k.height),l.fillText(c.apply(this,a),0,0);var d=k.toDataURL();l.clearRect(0,0,k.width,k.height),l.fillText(c.apply(this,b),0,0);var e=k.toDataURL();return d===e}function e(a){var b;if(!l||!l.fillText)return!1;switch(l.textBaseline=\"top\",l.font=\"600 32px Arial\",a){case\"flag\":return!(b=d([55356,56826,55356,56819],[55356,56826,8203,55356,56819]))&&(b=d([55356,57332,56128,56423,56128,56418,56128,56421,56128,56430,56128,56423,56128,56447],[55356,57332,8203,56128,56423,8203,56128,56418,8203,56128,56421,8203,56128,56430,8203,56128,56423,8203,56128,56447]),!b);case\"emoji\":return b=d([55357,56424,55356,57342,8205,55358,56605,8205,55357,56424,55356,57340],[55357,56424,55356,57342,8203,55358,56605,8203,55357,56424,55356,57340]),!b}return!1}function f(a){var c=b.createElement(\"script\");c.src=a,c.defer=c.type=\"text/javascript\",b.getElementsByTagName(\"head\")[0].appendChild(c)}var g,h,i,j,k=b.createElement(\"canvas\"),l=k.getContext&&k.getContext(\"2d\");for(j=Array(\"flag\",\"emoji\"),c.supports={everything:!0,everythingExceptFlag:!0},i=0;i<j.length;i++)c.supports[j[i]]=e(j[i]),c.supports.everything=c.supports.everything&&c.supports[j[i]],\"flag\"!==j[i]&&(c.supports.everythingExceptFlag=c.supports.everythingExceptFlag&&c.supports[j[i]]);c.supports.everythingExceptFlag=c.supports.everythingExceptFlag&&!c.supports.flag,c.DOMReady=!1,c.readyCallback=function(){c.DOMReady=!0},c.supports.everything||(h=function(){c.readyCallback()},b.addEventListener?(b.addEventListener(\"DOMContentLoaded\",h,!1),a.addEventListener(\"load\",h,!1)):(a.attachEvent(\"onload\",h),b.attachEvent(\"onreadystatechange\",function(){\"complete\"===b.readyState&&c.readyCallback()})),g=c.source||{},g.concatemoji?f(g.concatemoji):g.wpemoji&&g.twemoji&&(f(g.twemoji),f(g.wpemoji)))}(window,document,window._wpemojiSettings);</script>\n");
      out.write("\t\t<style type=\"text/css\">img.wp-smiley,img.emoji{display:inline!important;border:none!important;box-shadow:none!important;height:1em!important;width:1em!important;margin:0 .07em!important;vertical-align:-.1em!important;background:none!important;padding:0!important}</style>\n");
      out.write("\t<link rel='stylesheet' id='dashicons-css' href='http://192.168.1.251/wp-includes/css/dashicons.min.css?ver=5.2.4' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='admin-bar-css' href='http://192.168.1.251/wp-includes/css/admin-bar.min.css?ver=5.2.4' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='astra-theme-css-css' href='http://192.168.1.251/wp-content/themes/astra/assets/css/minified/style.min.css?ver=2.1.1' type='text/css' media='all'/>\n");
      out.write("<style id='astra-theme-css-inline-css' type='text/css'>@font-face{font-family:\"Astra\";src:url(http://192.168.1.251/wp-content/themes/astra/assets/fonts/astra.woff) format(\"woff\") , url(http://192.168.1.251/wp-content/themes/astra/assets/fonts/astra.ttf) format(\"truetype\") , url(http://192.168.1.251/wp-content/themes/astra/assets/fonts/astra.svg#astra) format(\"svg\");font-weight:normal;font-style:normal;font-display:fallback}html{font-size:87.5%}a,.page-title{color:#4064d7}a:hover,a:focus{color:#3a3a3a}body,button,input,select,textarea{font-family:'Varela Round',sans-serif;font-weight:400;font-size:14px;font-size:1rem}blockquote{color:#000}.site-title{font-size:35px;font-size:2.5rem}header .site-logo-img .custom-logo-link img{max-width:54px}.astra-logo-svg{width:54px}.ast-archive-description .ast-archive-title{font-size:40px;font-size:2.8571428571429rem}.site-header .site-description{font-size:10px;font-size:.71428571428571rem}.entry-title{font-size:30px;font-size:2.1428571428571rem}.comment-reply-title{font-size:23px;font-size:1.6428571428571rem}.ast-comment-list #cancel-comment-reply-link{font-size:14px;font-size:1rem}h1,.entry-content h1,.entry-content h1 a{font-size:42px;font-size:3rem}h2,.entry-content h2,.entry-content h2 a{font-size:42px;font-size:3rem}h3,.entry-content h3,.entry-content h3 a{font-size:30px;font-size:2.1428571428571rem}h4,.entry-content h4,.entry-content h4 a{font-size:20px;font-size:1.4285714285714rem}h5,.entry-content h5,.entry-content h5 a{font-size:18px;font-size:1.2857142857143rem}h6,.entry-content h6,.entry-content h6 a{font-size:15px;font-size:1.0714285714286rem}.ast-single-post .entry-title,.page-title{font-size:30px;font-size:2.1428571428571rem}#secondary,#secondary button,#secondary input,#secondary select,#secondary textarea{font-size:14px;font-size:1rem}::selection{background-color:#4064d7;color:#fff}body,h1,.entry-title a,.entry-content h1,.entry-content h1 a,h2,.entry-content h2,.entry-content h2 a,h3,.entry-content h3,.entry-content h3 a,h4,.entry-content h4,.entry-content h4 a,h5,.entry-content h5,.entry-content h5 a,h6,.entry-content h6,.entry-content h6 a{color:#3a3a3a}.tagcloud a:hover,.tagcloud a:focus,.tagcloud a.current-item{color:#fff;border-color:#4064d7;background-color:#4064d7}.main-header-menu a,.ast-header-custom-item a{color:#3a3a3a}.main-header-menu li:hover>a,.main-header-menu li:hover>.ast-menu-toggle,.main-header-menu .ast-masthead-custom-menu-items a:hover,.main-header-menu li.focus>a,.main-header-menu li.focus>.ast-menu-toggle,.main-header-menu .current-menu-item>a,.main-header-menu .current-menu-ancestor>a,.main-header-menu .current_page_item>a,.main-header-menu .current-menu-item>.ast-menu-toggle,.main-header-menu .current-menu-ancestor>.ast-menu-toggle,.main-header-menu .current_page_item>.ast-menu-toggle{color:#4064d7}input:focus,input[type=\"text\"]:focus,input[type=\"email\"]:focus,input[type=\"url\"]:focus,input[type=\"password\"]:focus,input[type=\"reset\"]:focus,input[type=\"search\"]:focus,textarea:focus{border-color:#4064d7}input[type=\"radio\"]:checked,input[type=\"reset\"],input[type=\"checkbox\"]:checked,input[type=\"checkbox\"]:hover:checked,input[type=\"checkbox\"]:focus:checked,input[type=\"range\"]::-webkit-slider-thumb{border-color:#4064d7;background-color:#4064d7;box-shadow:none}.site-footer a:hover+.post-count,.site-footer a:focus+.post-count{background:#4064d7;border-color:#4064d7}.footer-adv .footer-adv-overlay{border-top-style:solid;border-top-color:#7a7a7a}.ast-comment-meta{line-height:1.666666667;font-size:11px;font-size:.78571428571429rem}.single .nav-links .nav-previous,.single .nav-links .nav-next,.single .ast-author-details .author-title,.ast-comment-meta{color:#4064d7}.menu-toggle,button,.ast-button,.button,input#submit,input[type=\"button\"],input[type=\"submit\"],input[type=\"reset\"]{border-radius:50px;padding:10px 40px;color:#fff;border-color:#4064d7;background-color:#4064d7}button:focus,.menu-toggle:hover,button:hover,.ast-button:hover,.button:hover,input[type=\"reset\"]:hover,input[type=\"reset\"]:focus,input#submit:hover,input#submit:focus,input[type=\"button\"]:hover,input[type=\"button\"]:focus,input[type=\"submit\"]:hover,input[type=\"submit\"]:focus{color:#fff;border-color:#3a3a3a;background-color:#3a3a3a}.entry-meta,.entry-meta *{line-height:1.45;color:#4064d7}.entry-meta a:hover,.entry-meta a:hover *,.entry-meta a:focus,.entry-meta a:focus *{color:#3a3a3a}.ast-404-layout-1 .ast-404-text{font-size:200px;font-size:14.285714285714rem}.widget-title{font-size:20px;font-size:1.4285714285714rem;color:#3a3a3a}#cat option,.secondary .calendar_wrap thead a,.secondary .calendar_wrap thead a:visited{color:#4064d7}.secondary .calendar_wrap #today,.ast-progress-val span{background:#4064d7}.secondary a:hover+.post-count,.secondary a:focus+.post-count{background:#4064d7;border-color:#4064d7}.calendar_wrap #today>a{color:#fff}.ast-pagination a,.page-links .page-link,.single .post-navigation a{color:#4064d7}.ast-pagination a:hover,.ast-pagination a:focus,.ast-pagination > span:hover:not(.dots),.ast-pagination > span.current,.page-links > .page-link,.page-links .page-link:hover,.post-navigation a:hover{color:#3a3a3a}.ast-header-break-point .ast-mobile-menu-buttons-minimal.menu-toggle{background:transparent;color:#4064d7}.ast-header-break-point .ast-mobile-menu-buttons-outline.menu-toggle{background:transparent;border:1px solid #4064d7;color:#4064d7}.ast-header-break-point .ast-mobile-menu-buttons-fill.menu-toggle{background:#4064d7}.ast-header-break-point .main-header-bar .ast-button-wrap .menu-toggle{border-radius:0}@media (min-width:545px){.ast-page-builder-template .comments-area,.single.ast-page-builder-template .entry-header,.single.ast-page-builder-template .post-navigation{max-width:1240px;margin-left:auto;margin-right:auto}}@media (max-width:768px){.ast-archive-description .ast-archive-title{font-size:40px}.entry-title{font-size:30px}h1,.entry-content h1,.entry-content h1 a{font-size:30px}h2,.entry-content h2,.entry-content h2 a{font-size:25px}h3,.entry-content h3,.entry-content h3 a{font-size:20px}.ast-single-post .entry-title,.page-title{font-size:30px}}@media (max-width:544px){.ast-archive-description .ast-archive-title{font-size:40px}.entry-title{font-size:30px}h1,.entry-content h1,.entry-content h1 a{font-size:30px}h2,.entry-content h2,.entry-content h2 a{font-size:25px}h3,.entry-content h3,.entry-content h3 a{font-size:20px}.ast-single-post .entry-title,.page-title{font-size:30px}}@media (max-width:768px){html{font-size:79.8%}}@media (max-width:544px){html{font-size:79.8%}}@media (min-width:769px){.ast-container{max-width:1240px}}@media (max-width:921px){.main-header-bar .main-header-bar-navigation{display:none}}.ast-desktop .main-header-menu.submenu-with-border .sub-menu,.ast-desktop .main-header-menu.submenu-with-border .children,.ast-desktop .main-header-menu.submenu-with-border .astra-full-megamenu-wrapper{border-color:#eaeaea}.ast-desktop .main-header-menu.submenu-with-border .sub-menu,.ast-desktop .main-header-menu.submenu-with-border .children{border-top-width:1px;border-right-width:1px;border-left-width:1px;border-bottom-width:1px;border-style:solid}.ast-desktop .main-header-menu.submenu-with-border .sub-menu .sub-menu,.ast-desktop .main-header-menu.submenu-with-border .children .children{top:-1px}.ast-desktop .main-header-menu.submenu-with-border .sub-menu a,.ast-desktop .main-header-menu.submenu-with-border .children a{border-bottom-width:1px;border-style:solid;border-color:#eaeaea}@media (min-width:769px){.main-header-menu .sub-menu li.ast-left-align-sub-menu:hover>ul,.main-header-menu .sub-menu li.ast-left-align-sub-menu.focus>ul{margin-left:-2px}}.ast-small-footer{border-top-style:solid;border-top-width:1px;border-top-color:#545454}.ast-small-footer-wrap{text-align:center}@media (max-width:920px){.ast-404-layout-1 .ast-404-text{font-size:100px;font-size:7.1428571428571rem}}.ast-breadcrumbs .trail-browse,.ast-breadcrumbs .trail-items,.ast-breadcrumbs .trail-items li{display:inline-block;margin:0;padding:0;border:none;background:inherit;text-indent:0}.ast-breadcrumbs .trail-browse{font-size:inherit;font-style:inherit;font-weight:inherit;color:inherit}.ast-breadcrumbs .trail-items{list-style:none}.trail-items li::after{padding:0 .3em;content:\"»\"}.trail-items li:last-of-type::after{display:none}.ast-header-break-point .site-header{border-bottom-width:0}@media (min-width:769px){.main-header-bar{border-bottom-width:0}}.ast-flex{-webkit-align-content:center;-ms-flex-line-pack:center;align-content:center;-webkit-box-align:center;-webkit-align-items:center;-moz-box-align:center;-ms-flex-align:center;align-items:center}.main-header-bar{padding:1em 0}.ast-site-identity{padding:0}</style>\n");
      out.write("<link rel='stylesheet' id='astra-google-fonts-css' href='//fonts.googleapis.com/css?family=Varela+Round%3A400&#038;display=fallback&#038;ver=2.1.1' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='elementor-icons-css' href='http://192.168.1.251/wp-content/plugins/elementor/assets/lib/eicons/css/elementor-icons.min.css?ver=5.4.0' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='elementor-common-css' href='http://192.168.1.251/wp-content/plugins/elementor/assets/css/common.min.css?ver=2.7.4' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='wp-block-library-css' href='http://192.168.1.251/wp-includes/css/dist/block-library/style.min.css?ver=5.2.4' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='nk-awb-css' href='http://192.168.1.251/wp-content/plugins/advanced-backgrounds/assets/awb/awb.min.css?ver=1.6.0' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='ctdb-style-css' href='http://192.168.1.251/wp-content/plugins/wp-discussion-board/assets/css/style.css?ver=2.3.13' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='elementor-animations-css' href='http://192.168.1.251/wp-content/plugins/elementor/assets/lib/animations/animations.min.css?ver=2.7.4' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='elementor-frontend-css' href='http://192.168.1.251/wp-content/plugins/elementor/assets/css/frontend.min.css?ver=2.7.4' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='elementor-parallax-css' href='http://192.168.1.251/wp-content/plugins/we-elementor-parallax/assets/css/elementor-parallax.css?ver=1.0.0' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='elementor-global-css' href='http://192.168.1.251/wp-content/uploads/elementor/css/global.css?ver=1570431040' type='text/css' media='all'/>\n");
      out.write("<link rel='stylesheet' id='elementor-post-1183-css' href='http://192.168.1.251/wp-content/uploads/elementor/css/post-1183.css?ver=1572136065' type='text/css' media='all'/>\n");
      out.write("<!--[if IE]>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/themes/astra/assets/js/minified/flexibility.min.js?ver=2.1.1'></script>\n");
      out.write("<script type='text/javascript'>\n");
      out.write("flexibility(document.documentElement);\n");
      out.write("</script>\n");
      out.write("<![endif]-->\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/jquery/jquery.js?ver=1.12.4-wp'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.4.1'></script>\n");
      out.write("<link rel='https://api.w.org/' href='http://192.168.1.251/wp-json/'/>\n");
      out.write("<link rel=\"EditURI\" type=\"application/rsd+xml\" title=\"RSD\" href=\"http://192.168.1.251/xmlrpc.php?rsd\"/>\n");
      out.write("<link rel=\"wlwmanifest\" type=\"application/wlwmanifest+xml\" href=\"http://192.168.1.251/wp-includes/wlwmanifest.xml\"/> \n");
      out.write("<meta name=\"generator\" content=\"WordPress 5.2.4\"/>\n");
      out.write("<link rel=\"canonical\" href=\"http://192.168.1.251/my-services-2/\"/>\n");
      out.write("<link rel='shortlink' href='http://192.168.1.251/?p=1183'/>\n");
      out.write("<link rel=\"alternate\" type=\"application/json+oembed\" href=\"http://192.168.1.251/wp-json/oembed/1.0/embed?url=http%3A%2F%2F192.168.1.251%2Fmy-services-2%2F\"/>\n");
      out.write("<link rel=\"alternate\" type=\"text/xml+oembed\" href=\"http://192.168.1.251/wp-json/oembed/1.0/embed?url=http%3A%2F%2F192.168.1.251%2Fmy-services-2%2F&#038;format=xml\"/>\n");
      out.write("<script type=\"text/javascript\">var ajaxurl=\"http://192.168.1.251/wp-admin/admin-ajax.php\";</script>\t\t<style type=\"text/css\">.recentcomments a{display:inline!important;padding:0!important;margin:0!important}</style>\n");
      out.write("\t\t<style type=\"text/css\" media=\"print\">#wpadminbar{display:none}</style>\n");
      out.write("\t<style type=\"text/css\" media=\"screen\">html{margin-top:32px!important}* html body{margin-top:32px!important}@media screen and (max-width:782px ){html{margin-top:46px!important}* html body{margin-top:46px!important}}</style>\n");
      out.write("\t\t\t<style type=\"text/css\" id=\"wp-custom-css\"></style>\n");
      out.write("                        \n");
      out.write("                                <script>\n");
      out.write("                                    ");

                                        String userid = (String)session.getAttribute("userid");
                                    
      out.write("\n");
      out.write("                                        console.log(");
      out.print(userid);
      out.write(");\n");
      out.write("                                    if(");
      out.print(userid);
      out.write("!==null)\n");
      out.write("                                        $(\"#menu-item-1168\").hide();\n");
      out.write("                                    else\n");
      out.write("                                        $(\"#menu-item-1167\").hide();\n");
      out.write("                                </script>                    \n");
      out.write("                        \n");
      out.write("\t\t</head>\n");
      out.write("\n");
      out.write("<body itemtype='https://schema.org/WebPage' itemscope='itemscope' class=\"page-template-default page page-id-1183 logged-in admin-bar no-customize-support wp-custom-logo ctdb-layout-classic ctdb-archive-layout-classic ctdb-astra ctdb-user-can-view ctdb-user-can-post ast-desktop ast-page-builder-template ast-no-sidebar astra-2.1.1 ast-header-custom-item-inside ast-single-post ast-inherit-site-logo-transparent elementor-default elementor-page elementor-page-1183\">    \n");

    Object arr = new Object();
    System.out.println("userid"+session.getAttribute("userid"));
if(session.getAttribute("userid")==null)
{
	 response.sendRedirect("login_wp.jsp");
}

      out.write("   \n");
      out.write("    \n");
      out.write("<div class=\"hfeed site\" id=\"page\">\n");
      out.write("\t<a class=\"skip-link screen-reader-text\" href=\"#content\">Skip to content</a>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\t<header class=\"site-header header-main-layout-1 ast-primary-menu-enabled ast-menu-toggle-icon ast-mobile-header-stack\" itemtype=\"https://schema.org/WPHeader\" itemscope=\"itemscope\" id=\"masthead\" role=\"banner\">\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("<div class=\"main-header-bar-wrap\">\n");
      out.write("\t<div class=\"main-header-bar\">\n");
      out.write("\t\t\t\t<div class=\"ast-container\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"ast-flex main-header-container\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<div class=\"site-branding\">\n");
      out.write("\t\t\t<div class=\"ast-site-identity\" itemscope=\"itemscope\" itemtype=\"https://schema.org/Organization\">\n");
      out.write("\t\t\t\t<span class=\"site-logo-img\"><a href=\"http://192.168.1.251/\" class=\"custom-logo-link\" rel=\"home\"><script data-pagespeed-no-defer>//<![CDATA[\n");
      out.write("(function(){for(var g=\"function\"==typeof Object.defineProperties?Object.defineProperty:function(b,c,a){if(a.get||a.set)throw new TypeError(\"ES3 does not support getters and setters.\");b!=Array.prototype&&b!=Object.prototype&&(b[c]=a.value)},h=\"undefined\"!=typeof window&&window===this?this:\"undefined\"!=typeof global&&null!=global?global:this,k=[\"String\",\"prototype\",\"repeat\"],l=0;l<k.length-1;l++){var m=k[l];m in h||(h[m]={});h=h[m]}var n=k[k.length-1],p=h[n],q=p?p:function(b){var c;if(null==this)throw new TypeError(\"The 'this' value for String.prototype.repeat must not be null or undefined\");c=this+\"\";if(0>b||1342177279<b)throw new RangeError(\"Invalid count value\");b|=0;for(var a=\"\";b;)if(b&1&&(a+=c),b>>>=1)c+=c;return a};q!=p&&null!=q&&g(h,n,{configurable:!0,writable:!0,value:q});var t=this;function u(b,c){var a=b.split(\".\"),d=t;a[0]in d||!d.execScript||d.execScript(\"var \"+a[0]);for(var e;a.length&&(e=a.shift());)a.length||void 0===c?d[e]?d=d[e]:d=d[e]={}:d[e]=c};function v(b){var c=b.length;if(0<c){for(var a=Array(c),d=0;d<c;d++)a[d]=b[d];return a}return[]};function w(b){var c=window;if(c.addEventListener)c.addEventListener(\"load\",b,!1);else if(c.attachEvent)c.attachEvent(\"onload\",b);else{var a=c.onload;c.onload=function(){b.call(this);a&&a.call(this)}}};var x;function y(b,c,a,d,e){this.h=b;this.j=c;this.l=a;this.f=e;this.g={height:window.innerHeight||document.documentElement.clientHeight||document.body.clientHeight,width:window.innerWidth||document.documentElement.clientWidth||document.body.clientWidth};this.i=d;this.b={};this.a=[];this.c={}}function z(b,c){var a,d,e=c.getAttribute(\"data-pagespeed-url-hash\");if(a=e&&!(e in b.c))if(0>=c.offsetWidth&&0>=c.offsetHeight)a=!1;else{d=c.getBoundingClientRect();var f=document.body;a=d.top+(\"pageYOffset\"in window?window.pageYOffset:(document.documentElement||f.parentNode||f).scrollTop);d=d.left+(\"pageXOffset\"in window?window.pageXOffset:(document.documentElement||f.parentNode||f).scrollLeft);f=a.toString()+\",\"+d;b.b.hasOwnProperty(f)?a=!1:(b.b[f]=!0,a=a<=b.g.height&&d<=b.g.width)}a&&(b.a.push(e),b.c[e]=!0)}y.prototype.checkImageForCriticality=function(b){b.getBoundingClientRect&&z(this,b)};u(\"pagespeed.CriticalImages.checkImageForCriticality\",function(b){;});u(\"pagespeed.CriticalImages.checkCriticalImages\",function(){A(x)});function A(b){b.b={};for(var c=[\"IMG\",\"INPUT\"],a=[],d=0;d<c.length;++d)a=a.concat(v(document.getElementsByTagName(c[d])));if(a.length&&a[0].getBoundingClientRect){for(d=0;c=a[d];++d)z(b,c);a=\"oh=\"+b.l;b.f&&(a+=\"&n=\"+b.f);if(c=!!b.a.length)for(a+=\"&ci=\"+encodeURIComponent(b.a[0]),d=1;d<b.a.length;++d){var e=\",\"+encodeURIComponent(b.a[d]);131072>=a.length+e.length&&(a+=e)}b.i&&(e=\"&rd=\"+encodeURIComponent(JSON.stringify(B())),131072>=a.length+e.length&&(a+=e),c=!0);C=a;if(c){d=b.h;b=b.j;var f;if(window.XMLHttpRequest)f=new XMLHttpRequest;else if(window.ActiveXObject)try{f=new ActiveXObject(\"Msxml2.XMLHTTP\")}catch(r){try{f=new ActiveXObject(\"Microsoft.XMLHTTP\")}catch(D){}}f&&(f.open(\"POST\",d+(-1==d.indexOf(\"?\")?\"?\":\"&\")+\"url=\"+encodeURIComponent(b)),f.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded\"),f.send(a))}}}function B(){var b={},c;c=document.getElementsByTagName(\"IMG\");if(!c.length)return{};var a=c[0];if(!(\"naturalWidth\"in a&&\"naturalHeight\"in a))return{};for(var d=0;a=c[d];++d){var e=a.getAttribute(\"data-pagespeed-url-hash\");e&&(!(e in b)&&0<a.width&&0<a.height&&0<a.naturalWidth&&0<a.naturalHeight||e in b&&a.width>=b[e].o&&a.height>=b[e].m)&&(b[e]={rw:a.width,rh:a.height,ow:a.naturalWidth,oh:a.naturalHeight})}return b}var C=\"\";u(\"pagespeed.CriticalImages.Run\",function(b,c,a,d,e,f){var r=new y(b,c,a,e,f);x=r;d&&w(function(){window.setTimeout(function(){A(r)},0)})});})();\n");
      out.write("//]]></script><img width=\"54\" height=\"54\" src=\"http://192.168.1.251/wp-content/uploads/2019/10/docker-1-54x54.png\" class=\"custom-logo\" alt=\"user&#039;s Blog!\" data-pagespeed-url-hash=\"3937648321\" onload=\"pagespeed.CriticalImages.checkImageForCriticality(this);\"/></a></span><div class=\"ast-site-title-wrap\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<p class=\"site-description\" itemprop=\"description\">\n");
      out.write("\t\t\t\t\tBuilding PaaS through IaaS\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- .site-branding -->\n");
      out.write("\t\t\t\t<div class=\"ast-mobile-menu-buttons\">\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"ast-button-wrap\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"menu-toggle main-header-menu-toggle  ast-mobile-menu-buttons-fill \" aria-controls='primary-menu'>\n");
      out.write("\t\t\t\t<span class=\"screen-reader-text\">Main Menu</span>\n");
      out.write("\t\t\t\t<span class=\"menu-toggle-icon\"></span>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<div class=\"ast-main-header-bar-alignment\"><div class=\"main-header-bar-navigation\"><nav itemtype=\"https://schema.org/SiteNavigationElement\" itemscope=\"itemscope\" id=\"site-navigation\" class=\"ast-flex-grow-1 navigation-accessibility\" aria-label=\"Site Navigation\"><div class=\"main-navigation\"><ul id=\"primary-menu\" class=\"main-header-menu ast-nav-menu ast-flex ast-justify-content-flex-end  submenu-with-border\"><li id=\"menu-item-727\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-727\"><a href=\"Home.html\">Home</a></li>\n");
      out.write("<li id=\"menu-item-726\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-726\"><a href=\"http://192.168.1.251/about/\">About</a></li>\n");
      out.write("<li id=\"menu-item-1182\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-1182\"><a href=\"myservices.jsp\">My Services</a></li>\n");
      out.write("<li id=\"menu-item-1167\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-1167\"><a href=\"login_wp.html\">Log In</a></li>\n");
      out.write("<li id=\"menu-item-1168\" class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-1095 current_page_item menu-item-1168\"><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("</ul></div></nav></div></div>\t\t\t</div><!-- Main Header Container -->\n");
      out.write("\t\t</div><!-- ast-row -->\n");
      out.write("\t\t\t</div> <!-- Main Header Bar -->\n");
      out.write("</div> <!-- Main Header Bar Wrap -->\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</header><!-- #masthead -->\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div id=\"content\" class=\"site-content\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"ast-container\">\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t<div id=\"primary\" class=\"content-area primary\">\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t<main id=\"main\" class=\"site-main\">\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("<article class=\"post-1183 page type-page status-publish ast-article-single\" itemtype=\"https://schema.org/CreativeWork\" itemscope=\"itemscope\" id=\"post-1183\">\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<header class=\"entry-header ast-header-without-markup\">\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t</header><!-- .entry-header -->\n");
      out.write("\n");
      out.write("\t<div class=\"entry-content clear\" itemprop=\"text\">\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<div data-elementor-type=\"wp-page\" data-elementor-id=\"1183\" class=\"elementor elementor-1183\" data-elementor-settings=\"[]\">\n");
      out.write("\t\t\t<div class=\"elementor-inner\">\n");
      out.write("\t\t\t\t<div class=\"elementor-section-wrap\">\n");
      out.write("\t\t\t\t\t\t\t<section class=\"elementor-element elementor-element-972a5ae elementor-section-boxed elementor-section-height-default elementor-section-height-default elementor-section elementor-top-section\" data-id=\"972a5ae\" data-element_type=\"section\">\n");
      out.write("\t\t\t\t\t\t<div class=\"elementor-container elementor-column-gap-default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-row\">\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-e8eabd0 elementor-column elementor-col-100 elementor-top-column\" data-id=\"e8eabd0\" data-element_type=\"column\">\n");
      out.write("\t\t\t<div class=\"elementor-column-wrap  elementor-element-populated\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-widget-wrap\">\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-662a19c elementor-widget elementor-widget-spacer\" data-id=\"662a19c\" data-element_type=\"widget\" data-widget_type=\"spacer.default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-widget-container\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-spacer\">\n");
      out.write("\t\t\t<div class=\"elementor-spacer-inner\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-4229c07 elementor-widget elementor-widget-heading\" data-id=\"4229c07\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-widget-container\">\n");
      out.write("\t\t\t<h3 class=\"elementor-heading-title elementor-size-default\">Containers</h3>\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>                                 \n");
      out.write("                                    \n");

{    
    MongoClientURI uri = new MongoClientURI(
    "mongodb://lohitha:Sathya%40123@cluster0-shard-00-00-kwnes.mongodb.net:27017,cluster0-shard-00-01-kwnes.mongodb.net:27017,cluster0-shard-00-02-kwnes.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority");

MongoClient mongoClient = new MongoClient(uri);
MongoDatabase db = mongoClient.getDatabase("test");
MongoCollection<Document> collection = db.getCollection("Users");
BasicDBObject searchQuery = new BasicDBObject();
searchQuery.put("name",session.getAttribute("userid"));
    try 
    {
	List<Document> users = (List<Document>) collection.find(searchQuery).into(
				new ArrayList<Document>());
        for (Document user : users) {
            List<Document> containers = (List<Document>) user.get("containerid");
            for (Document container : containers) 
            {
                String url = "http://128.110.153.70:" + container.getString("port");
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \t\t\t\t<section class=\"elementor-element elementor-element-f3dbc2d elementor-section-boxed elementor-section-height-default elementor-section-height-default elementor-section elementor-top-section\" data-id=\"f3dbc2d\" data-element_type=\"section\">\n");
      out.write("\t\t\t\t\t\t<div class=\"elementor-container elementor-column-gap-default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-row\">\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-8c8f052 elementor-column elementor-col-33 elementor-top-column\" data-id=\"8c8f052\" data-element_type=\"column\">\n");
      out.write("\t\t\t<div class=\"elementor-column-wrap  elementor-element-populated\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-widget-wrap\">\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-1c4f7b8 elementor-widget elementor-widget-text-editor\" data-id=\"1c4f7b8\" data-element_type=\"widget\" data-widget_type=\"text-editor.default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-widget-container\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-text-editor elementor-clearfix\">                <p style=\"font-size:25px;\"><a href=");
      out.print( url );
      out.write(" target=\"_blank\"\n");
      out.write("                      >");
      out.print( url );
      out.write("</a></p></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-796d25c elementor-column elementor-col-33 elementor-top-column\" data-id=\"796d25c\" data-element_type=\"column\">\n");
      out.write("\t\t\t<div class=\"elementor-column-wrap  elementor-element-populated\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-widget-wrap\">\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-5d5c8fb elementor-widget elementor-widget-button\" data-id=\"5d5c8fb\" data-element_type=\"widget\" data-widget_type=\"button.default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-widget-container\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-button-wrapper\">\n");
      out.write("\t\t\t<a href=\"/Cloud/deleteContainer.jsp?id=");
      out.print(container.getString("id"));
      out.write("&userid=");
      out.print(session.getAttribute("userid"));
      out.write("\"  class=\"elementor-button-link elementor-button elementor-size-sm\" role=\"button\">\n");
      out.write("\t\t\t\t\t\t<span class=\"elementor-button-content-wrapper\">\n");
      out.write("\t\t\t\t\t\t<span class=\"elementor-button-text\" id=");
      out.print(container.getString("id"));
      out.write(">Delete Container</span>\n");
      out.write("\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("                ");

            }
        }
    }
    finally 
    {
        mongoClient.close();
    }
    

                
}

      out.write("                                     \n");
      out.write("\n");
      out.write("\t\t\t\t<section class=\"elementor-element elementor-element-86e79db elementor-section-boxed elementor-section-height-default elementor-section-height-default elementor-section elementor-top-section\" data-id=\"86e79db\" data-element_type=\"section\">\n");
      out.write("\t\t\t\t\t\t<div class=\"elementor-container elementor-column-gap-default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-row\">\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-2f74d67 elementor-column elementor-col-100 elementor-top-column\" data-id=\"2f74d67\" data-element_type=\"column\">\n");
      out.write("\t\t\t<div class=\"elementor-column-wrap  elementor-element-populated\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-widget-wrap\">\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-b476463 elementor-widget elementor-widget-spacer\" data-id=\"b476463\" data-element_type=\"widget\" data-widget_type=\"spacer.default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-widget-container\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-spacer\">\n");
      out.write("\t\t\t<div class=\"elementor-spacer-inner\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t\t\t<section class=\"elementor-element elementor-element-b1b9170 elementor-section-boxed elementor-section-height-default elementor-section-height-default elementor-section elementor-top-section\" data-id=\"b1b9170\" data-element_type=\"section\">\n");
      out.write("\t\t\t\t\t\t<div class=\"elementor-container elementor-column-gap-default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-row\">\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-3e3c007 elementor-column elementor-col-100 elementor-top-column\" data-id=\"3e3c007\" data-element_type=\"column\">\n");
      out.write("\t\t\t<div class=\"elementor-column-wrap  elementor-element-populated\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-widget-wrap\">\n");
      out.write("\t\t\t\t<div class=\"elementor-element elementor-element-767b79f elementor-align-center elementor-widget elementor-widget-button\" data-id=\"767b79f\" data-element_type=\"widget\" data-widget_type=\"button.default\">\n");
      out.write("\t\t\t\t<div class=\"elementor-widget-container\">\n");
      out.write("\t\t\t\t\t<div class=\"elementor-button-wrapper\">\n");
      out.write("\t\t\t<a href=\"/Cloud/createContainer.jsp?userid=");
      out.print(session.getAttribute("userid"));
      out.write("\" class=\"elementor-button-link elementor-button elementor-size-sm\" role=\"button\">\n");
      out.write("\t\t\t\t\t\t<span class=\"elementor-button-content-wrapper\">\n");
      out.write("\t\t\t\t\t\t<span class=\"elementor-button-text\">Create Containers</span>\n");
      out.write("\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</div><!-- .entry-content .clear -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</article><!-- #post-## -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</main><!-- #main -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t</div><!-- #primary -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div> <!-- ast-container -->\n");
      out.write("\n");
      out.write("\t\t</div><!-- #content -->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</div><!-- #page -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/template\" id=\"tmpl-elementor-templates-modal__header\">\n");
      out.write("\t<div class=\"elementor-templates-modal__header__logo-area\"></div>\n");
      out.write("\t<div class=\"elementor-templates-modal__header__menu-area\"></div>\n");
      out.write("\t<div class=\"elementor-templates-modal__header__items-area\">\n");
      out.write("\t\t<# if ( closeType ) { #>\n");
      out.write("\t\t\t<div class=\"elementor-templates-modal__header__close elementor-templates-modal__header__close--{{{ closeType }}} elementor-templates-modal__header__item\">\n");
      out.write("\t\t\t\t<# if ( 'skip' === closeType ) { #>\n");
      out.write("\t\t\t\t<span>Skip</span>\n");
      out.write("\t\t\t\t<# } #>\n");
      out.write("\t\t\t\t<i class=\"eicon-close\" aria-hidden=\"true\" title=\"Close\"></i>\n");
      out.write("\t\t\t\t<span class=\"elementor-screen-only\">Close</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<# } #>\n");
      out.write("\t\t<div id=\"elementor-template-library-header-tools\"></div>\n");
      out.write("\t</div>\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/template\" id=\"tmpl-elementor-templates-modal__header__logo\">\n");
      out.write("\t<span class=\"elementor-templates-modal__header__logo__icon-wrapper\">\n");
      out.write("\t\t<i class=\"eicon-elementor\"></i>\n");
      out.write("\t</span>\n");
      out.write("\t<span class=\"elementor-templates-modal__header__logo__title\">{{{ title }}}</span>\n");
      out.write("</script>\n");
      out.write("<script type=\"text/template\" id=\"tmpl-elementor-finder\">\n");
      out.write("\t<div id=\"elementor-finder__search\">\n");
      out.write("\t\t<i class=\"eicon-search\"></i>\n");
      out.write("\t\t<input id=\"elementor-finder__search__input\" placeholder=\"Type to find anything in Elementor\">\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"elementor-finder__content\"></div>\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/template\" id=\"tmpl-elementor-finder-results-container\">\n");
      out.write("\t<div id=\"elementor-finder__no-results\">No Results Found</div>\n");
      out.write("\t<div id=\"elementor-finder__results\"></div>\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/template\" id=\"tmpl-elementor-finder__results__category\">\n");
      out.write("\t<div class=\"elementor-finder__results__category__title\">{{{ title }}}</div>\n");
      out.write("\t<div class=\"elementor-finder__results__category__items\"></div>\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/template\" id=\"tmpl-elementor-finder__results__item\">\n");
      out.write("\t<a href=\"{{ url }}\" class=\"elementor-finder__results__item__link\">\n");
      out.write("\t\t<div class=\"elementor-finder__results__item__icon\">\n");
      out.write("\t\t\t<i class=\"eicon-{{{ icon }}}\"></i>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"elementor-finder__results__item__title\">{{{ title }}}</div>\n");
      out.write("\t\t<# if ( description ) { #>\n");
      out.write("\t\t\t<div class=\"elementor-finder__results__item__description\">- {{{ description }}}</div>\n");
      out.write("\t\t<# } #>\n");
      out.write("\t</a>\n");
      out.write("\t<# if ( actions.length ) { #>\n");
      out.write("\t\t<div class=\"elementor-finder__results__item__actions\">\n");
      out.write("\t\t<# jQuery.each( actions, function() { #>\n");
      out.write("\t\t\t<a class=\"elementor-finder__results__item__action elementor-finder__results__item__action--{{ this.name }}\" href=\"{{ this.url }}\" target=\"_blank\">\n");
      out.write("\t\t\t\t<i class=\"eicon-{{{ this.icon }}}\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t<# } ); #>\n");
      out.write("\t\t</div>\n");
      out.write("\t<# } #>\n");
      out.write("</script>\n");
      out.write("<link rel='stylesheet' id='astra-widgets-astra-widget-list-icons-css' href='http://192.168.1.251/wp-content/plugins/astra-widgets/assets/css/minified/astra-widget-list-icons.min.css?ver=5.2.4' type='text/css' media='all'/>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/admin-bar.min.js?ver=5.2.4'></script>\n");
      out.write("<script type='text/javascript'>//<![CDATA[\n");
      out.write("var astra={\"break_point\":\"921\",\"isRtl\":\"\"};\n");
      out.write("//]]></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/themes/astra/assets/js/minified/style.min.js?ver=2.1.1'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/advanced-backgrounds/assets/vendor/resize-observer-polyfill/ResizeObserver.global.min.js?ver=1.5.0'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/advanced-backgrounds/assets/vendor/jarallax/jarallax.min.js?ver=1.11.0'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/advanced-backgrounds/assets/vendor/jarallax/jarallax-video.min.js?ver=1.11.0'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/advanced-backgrounds/assets/vendor/object-fit-images/ofi.min.js?ver=3.2.4'></script>\n");
      out.write("<script type='text/javascript'>//<![CDATA[\n");
      out.write("var AWBData={\"settings\":{\"disable_parallax\":[],\"disable_video\":[],\"full_width_fallback\":false}};\n");
      out.write("//]]></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/advanced-backgrounds/assets/awb/awb.min.js?ver=1.6.0'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/jquery/ui/core.min.js?ver=1.11.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/jquery/ui/widget.min.js?ver=1.11.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/jquery/ui/mouse.min.js?ver=1.11.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/jquery/ui/draggable.min.js?ver=1.11.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/underscore.min.js?ver=1.8.3'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/backbone.min.js?ver=1.2.3'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/elementor/assets/lib/backbone/backbone.marionette.min.js?ver=2.4.5'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/elementor/assets/lib/backbone/backbone.radio.min.js?ver=1.0.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/elementor/assets/js/common-modules.min.js?ver=2.7.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/jquery/ui/position.min.js?ver=1.11.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/elementor/assets/lib/dialog/dialog.min.js?ver=4.7.3'></script>\n");
      out.write("<script type='text/javascript'>var elementorCommonConfig={\"version\":\"2.7.4\",\"isRTL\":false,\"activeModules\":[\"ajax\",\"finder\",\"connect\"],\"urls\":{\"assets\":\"http:\\/\\/192.168.1.251\\/wp-content\\/plugins\\/elementor\\/assets\\/\"},\"ajax\":{\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin-ajax.php\",\"nonce\":\"82b620c58c\"},\"finder\":{\"data\":{\"edit\":{\"title\":\"Edit\",\"dynamic\":true,\"name\":\"edit\"},\"general\":{\"title\":\"General\",\"dynamic\":false,\"items\":{\"saved-templates\":{\"title\":\"Saved Templates\",\"icon\":\"library-save\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/edit.php?post_type=elementor_library&tabs_group=library\",\"keywords\":[\"template\",\"section\",\"page\",\"library\"]},\"system-info\":{\"title\":\"System Info\",\"icon\":\"info\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=elementor-system-info\",\"keywords\":[\"system\",\"info\",\"environment\",\"elementor\"]},\"role-manager\":{\"title\":\"Role Manager\",\"icon\":\"person\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=elementor-role-manager\",\"keywords\":[\"role\",\"manager\",\"user\",\"elementor\"]},\"knowledge-base\":{\"title\":\"Knowledge Base\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=go_knowledge_base_site\",\"keywords\":[\"help\",\"knowledge\",\"docs\",\"elementor\"]}},\"name\":\"general\"},\"create\":{\"title\":\"Create\",\"dynamic\":false,\"items\":{\"post\":{\"title\":\"Add New Post\",\"icon\":\"plus-circle-o\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/edit.php?action=elementor_new_post&post_type=post&_wpnonce=676544016f\",\"keywords\":[\"post\",\"page\",\"template\",\"new\",\"create\"]},\"page\":{\"title\":\"Add New Page\",\"icon\":\"plus-circle-o\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/edit.php?action=elementor_new_post&post_type=page&_wpnonce=676544016f\",\"keywords\":[\"post\",\"page\",\"template\",\"new\",\"create\"]},\"elementor_library\":{\"title\":\"Add New Template\",\"icon\":\"plus-circle-o\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/edit.php?post_type=elementor_library#add_new\",\"keywords\":[\"post\",\"page\",\"template\",\"new\",\"create\"]}},\"name\":\"create\"},\"site\":{\"title\":\"Site\",\"dynamic\":false,\"items\":{\"homepage\":{\"title\":\"Homepage\",\"url\":\"http:\\/\\/192.168.1.251\",\"icon\":\"home-heart\",\"keywords\":[\"home\",\"page\"]},\"wordpress-dashboard\":{\"title\":\"Dashboard\",\"icon\":\"dashboard\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/\",\"keywords\":[\"dashboard\",\"wordpress\"]},\"wordpress-menus\":{\"title\":\"Menus\",\"icon\":\"wordpress\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/nav-menus.php\",\"keywords\":[\"menu\",\"wordpress\"]},\"wordpress-themes\":{\"title\":\"Themes\",\"icon\":\"wordpress\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/themes.php\",\"keywords\":[\"themes\",\"wordpress\"]},\"wordpress-customizer\":{\"title\":\"Customizer\",\"icon\":\"wordpress\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/customize.php\",\"keywords\":[\"customizer\",\"wordpress\"]},\"wordpress-plugins\":{\"title\":\"Plugins\",\"icon\":\"wordpress\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/plugins.php\",\"keywords\":[\"plugins\",\"wordpress\"]},\"wordpress-users\":{\"title\":\"Users\",\"icon\":\"wordpress\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/users.php\",\"keywords\":[\"users\",\"profile\",\"wordpress\"]}},\"name\":\"site\"},\"settings\":{\"title\":\"Settings\",\"dynamic\":false,\"items\":{\"general-settings\":{\"title\":\"General Settings\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=elementor\",\"keywords\":[\"general\",\"settings\",\"elementor\"]},\"style\":{\"title\":\"Style\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=elementor#tab-style\",\"keywords\":[\"style\",\"settings\",\"elementor\"]},\"advanced\":{\"title\":\"Advanced\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=elementor#tab-advanced\",\"keywords\":[\"advanced\",\"settings\",\"elementor\"]}},\"name\":\"settings\"},\"tools\":{\"title\":\"Tools\",\"dynamic\":false,\"items\":{\"tools\":{\"title\":\"Tools\",\"icon\":\"tools\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=elementor-tools\",\"keywords\":[\"tools\",\"regenerate css\",\"safe mode\",\"debug bar\",\"sync library\",\"elementor\"]},\"replace-url\":{\"title\":\"Replace URL\",\"icon\":\"tools\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=elementor-tools#tab-replace_url\",\"keywords\":[\"tools\",\"replace url\",\"domain\",\"elementor\"]},\"version-control\":{\"title\":\"Version Control\",\"icon\":\"time-line\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=elementor-tools#tab-versions\",\"keywords\":[\"tools\",\"version\",\"control\",\"rollback\",\"beta\",\"elementor\"]},\"maintenance-mode\":{\"title\":\"Maintenance Mode\",\"icon\":\"tools\",\"url\":\"http:\\/\\/192.168.1.251\\/wp-admin\\/admin.php?page=elementor-tools#tab-maintenance_mode\",\"keywords\":[\"tools\",\"maintenance\",\"coming soon\",\"elementor\"]}},\"name\":\"tools\"}},\"i18n\":{\"finder\":\"Finder\"}},\"connect\":[]};</script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/elementor/assets/js/common.min.js?ver=2.7.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-includes/js/wp-embed.min.js?ver=5.2.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/we-elementor-parallax/assets/js/elementor-parallax.js?ver=1.0.0'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/elementor/assets/js/frontend-modules.min.js?ver=2.7.4'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/elementor/assets/lib/waypoints/waypoints.min.js?ver=4.0.2'></script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/elementor/assets/lib/swiper/swiper.min.js?ver=4.4.6'></script>\n");
      out.write("<script type='text/javascript'>var elementorFrontendConfig={\"environmentMode\":{\"edit\":false,\"wpPreview\":false},\"is_rtl\":false,\"breakpoints\":{\"xs\":0,\"sm\":480,\"md\":768,\"lg\":1025,\"xl\":1440,\"xxl\":1600},\"version\":\"2.7.4\",\"urls\":{\"assets\":\"http:\\/\\/192.168.1.251\\/wp-content\\/plugins\\/elementor\\/assets\\/\"},\"settings\":{\"page\":[],\"general\":{\"elementor_global_image_lightbox\":\"yes\",\"elementor_enable_lightbox_in_editor\":\"yes\"}},\"post\":{\"id\":1183,\"title\":\"My Services\",\"excerpt\":\"\"},\"user\":{\"roles\":[\"administrator\"]}};</script>\n");
      out.write("<script type='text/javascript' src='http://192.168.1.251/wp-content/plugins/elementor/assets/js/frontend.min.js?ver=2.7.4'></script>\n");
      out.write("\t\t\t<script>/(trident|msie)/i.test(navigator.userAgent)&&document.getElementById&&window.addEventListener&&window.addEventListener(\"hashchange\",function(){var t,e=location.hash.substring(1);/^[A-z0-9_-]+$/.test(e)&&(t=document.getElementById(e))&&(/^(?:a|select|input|button|textarea)$/i.test(t.tagName)||(t.tabIndex=-1),t.focus())},!1);</script>\n");
      out.write("\t\t\t\t<!--[if lte IE 8]>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tdocument.body.className = document.body.className.replace( /(^|\\s)(no-)?customize-support(?=\\s|$)/, '' ) + ' no-customize-support';\n");
      out.write("\t\t</script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\t<!--[if gte IE 9]><!-->\n");
      out.write("\t\t<script type=\"text/javascript\">(function(){var request,b=document.body,c='className',cs='customize-support',rcs=new RegExp('(^|\\\\s+)(no-)?'+cs+'(\\\\s+|$)');request=true;b[c]=b[c].replace(rcs,' ');b[c]+=(window.postMessage&&request?' ':' no-')+cs;}());</script>\n");
      out.write("\t<!--<![endif]-->\n");
      out.write("\t\t\n");
      out.write("   </body>\n");
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
