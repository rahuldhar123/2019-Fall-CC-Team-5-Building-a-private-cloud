<%-- 
    Document   : deleteContainer
    Created on : Dec 4, 2019, 1:33:40 AM
    Author     : Lohitha
--%>

<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page import="javax.swing.text.Document"%>
<%@page import="com.mongodb.client.MongoCursor"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.client.MongoCollection"%>
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

 <%
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
response.sendRedirect("myservices.jsp");
%>       

    </body>
</html>
