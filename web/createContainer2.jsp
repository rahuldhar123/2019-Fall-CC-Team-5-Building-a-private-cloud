<%-- 
    Document   : createContainer2
    Created on : Dec 4, 2019, 3:09:04 AM
    Author     : Lohitha
--%>

<%@page import="org.apache.commons.io.IOUtils"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.nio.charset.StandardCharsets"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.io.DataOutputStream"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="com.mongodb.MongoClientURI"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%    
            String port;
            String line="";
            if(request.getParameter("image").equals("nginx"))
                port = "80/tcp";
            else 
                port = "27017/tcp";
                            
            String query_url = "http://128.110.153.70:5550/containers/create";
            String json = "{\"Image\":\"" + request.getParameter("image") + "\", "+
                         "\"HostConfig\": {\"Memory\":"+ request.getParameter("memory")+",\"PortBindings\": { \"" + port +"\" :[{\"HostPort\":\"" +request.getParameter("port") + "\" }]}}} ";
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
            JSONObject myResponse = new JSONObject(result);
            String containerId = myResponse.getString("Id");
            int responseCode = conn.getResponseCode();
            in.close();
            conn.disconnect();
            if (responseCode == HttpURLConnection.HTTP_CREATED) { // success
                URL obj = new URL("http://128.110.153.70:5550/containers/"+containerId+"/start");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("User-Agent", "Mozilla/5.0");
                responseCode = con.getResponseCode();
                if(responseCode==HttpURLConnection.HTTP_NO_CONTENT)
                {
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
            response.sendRedirect("myservices.jsp");
        %>
    </body>
</html>
