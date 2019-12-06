package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.io.IOUtils;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public final class createContainer2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");
    
            String port;
            String line="";
                if(request.getParameter("image")=="nginx")
                    port = "80/tcp";
                else 
                    port = "27017/tcp";
                            
            String query_url = "http://128.110.153.70:5550/containers/create";
            String json = "{\"Image\":" + request.getParameter("image") + ", "+
                         "\"HostConfig\": {\"PortBindings\": { " + port +" :[{\"HostPort\":\"" +request.getParameter("port") + "\" }]}}} ";
            
            json = "{\"Image\": \"nginx\",\"HostConfig\": {\"PortBindings\": { \"80/tcp\": [{ \"HostPort\": " +request.getParameter("port")+" }] }}} ";
            System.out.println("json"+json);
            try {
            URL url = new URL(query_url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            OutputStream os = conn.getOutputStream();
            os.write(json.getBytes());
            os.close(); 
            // read the response
            InputStream in = new BufferedInputStream(conn.getInputStream());
            String result = IOUtils.toString(in);
            System.out.println(result);
            System.out.println("result after Reading JSON Response");
            JSONObject myResponse = new JSONObject(result);
            String containerId = myResponse.getString("Id");
            int responseCode = conn.getResponseCode();
            in.close();
            conn.disconnect();
            System.out.println("GET Response Code :: " + responseCode);
            System.out.println("containerId :: " + containerId);
            if (responseCode == HttpURLConnection.HTTP_CREATED) { // success
                URL obj = new URL("http://128.110.153.70:5550/containers/"+containerId+"/start");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("User-Agent", "Mozilla/5.0");
                responseCode = con.getResponseCode();
                System.out.println("responseCode :: " + responseCode);
                if(responseCode==HttpURLConnection.HTTP_NO_CONTENT)
                {
                    //////////////////
                    MongoClientURI uri = new MongoClientURI(
                        "mongodb://lohitha:Sathya%40123@cluster0-shard-00-00-kwnes.mongodb.net:27017,cluster0-shard-00-01-kwnes.mongodb.net:27017,cluster0-shard-00-02-kwnes.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority");

                    MongoClient mongoClient = new MongoClient(uri);
                    MongoDatabase db = mongoClient.getDatabase("test");
                    MongoCollection collection = db.getCollection("Users");
                    BasicDBObject doc = new BasicDBObject();
                    BasicDBObject searchQuery = new BasicDBObject();
                    searchQuery.put("name",session.getAttribute("userid"));

                    BasicDBObject containerSpec = new BasicDBObject();
                    containerSpec.put( "id", containerId );
                    containerSpec.put( "port", request.getParameter("port") );

                    BasicDBObject update = new BasicDBObject();
                    update.put( "$push", new BasicDBObject( "containerid", containerSpec ) );

                    collection.updateOne( searchQuery, update );
                    mongoClient.close();
                    //////////////////
                }
                else
                {
                    System.out.println("Container start failed");
                }
                
                
		} else {
			System.out.println("Container creation failed");
		} 
           
           
           } catch (Exception e) {
   			System.out.println(e);
   		}       
            
            out.println(request.getParameter("port"));
            out.println(request.getParameter("image"));
            out.println(session.getAttribute("userid"));   
            //response.sendRedirect("myservices.jsp");
        
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
