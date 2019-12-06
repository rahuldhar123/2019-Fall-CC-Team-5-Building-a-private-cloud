package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.text.Document;
import com.mongodb.client.MongoCursor;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public final class deleteContainer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!");
      out.print( request.getParameter("id") );
      out.write("</h1>\n");
      out.write("\n");
      out.write(" ");

String user = request.getParameter("userid");
int cnt=0,c=0;

MongoClientURI uri = new MongoClientURI(
    "mongodb://lohitha:Sathya%40123@cluster0-shard-00-00-kwnes.mongodb.net:27017,cluster0-shard-00-01-kwnes.mongodb.net:27017,cluster0-shard-00-02-kwnes.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority");

MongoClient mongoClient = new MongoClient(uri);
MongoDatabase db = mongoClient.getDatabase("test");
MongoCollection collection = db.getCollection("Users");
BasicDBObject doc = new BasicDBObject();
BasicDBObject searchQuery = new BasicDBObject();
    searchQuery.put("name",user);
 
BasicDBObject containerSpec = new BasicDBObject();
containerSpec.put( "id", request.getParameter("id") );
 
BasicDBObject update = new BasicDBObject();
update.put( "$pull", new BasicDBObject( "containerid", containerSpec ) );

collection.updateOne( searchQuery, update );
mongoClient.close();

    try{
         URL obj = new URL("http://128.110.153.70:5550/containers/"+request.getParameter("id")+"/stop");
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_NO_CONTENT) { // success
                    obj = new URL("http://128.110.153.70:5550/containers/"+request.getParameter("id"));
                    con = (HttpURLConnection) obj.openConnection();
                    con.setRequestMethod("DELETE");
                    con.setRequestProperty("User-Agent", "Mozilla/5.0");
                    responseCode = con.getResponseCode();
                           System.out.println("GET Response Code :: " + responseCode);
		} else {
			System.out.println("DELETE request not worked");
		}       
    }
    catch(Exception e){
        System.out.println(e.toString());
    }


      out.write("       \n");
      out.write("\n");
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
