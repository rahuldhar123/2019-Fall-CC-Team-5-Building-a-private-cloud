<%-- 
    Document   : register
    Created on : Oct 26, 2019, 6:11:40 PM
    Author     : Lohitha
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClientURI"%>
<%@ page language="java" 
    contentType="text/html; 
    charset=windows-1256"
     pageEncoding="windows-1256" 
     import="com.mongodb.BasicDBObject"
     import="com.mongodb.DB"
     import="com.mongodb.DBCollection"
     import="com.mongodb.DBCursor"
     import="com.mongodb.MongoClient"
     import="java.net.UnknownHostException"
	 import="com.sun.org.apache.bcel.internal.generic.NEW"
	 import="com.mongodb.DBObject"
	 import="com.mongodb.Mongo"
      %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256"> 
<title>Insert title here</title>
</head>
<body bgcolor=#81BEF7>
<form>

<br>
<% 

MongoClientURI uri = new MongoClientURI(
    "mongodb://lohitha:Sathya%40123@cluster0-shard-00-00-kwnes.mongodb.net:27017,cluster0-shard-00-01-kwnes.mongodb.net:27017,cluster0-shard-00-02-kwnes.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority");

MongoClient mongoClient = new MongoClient(uri);
MongoDatabase db = mongoClient.getDatabase("test");
MongoCollection collection = db.getCollection("Users");
Document doc = new Document();
List<DBObject> array = new ArrayList<DBObject>();
        doc.append("name",request.getParameter("ctdb_user_login"));
	doc.append("password",request.getParameter("ctdb_user_pass"));
        doc.append("containerid", array);
	collection.insertOne(doc);
	mongoClient.close();

        session.setAttribute("history"," ");
        session.setAttribute("userid", request.getParameter("ctdb_user_login"));	 
        response.sendRedirect("myservices.jsp");	
%>	
<br>
		<a href="javascript:history.go(-1)">Confirm</a>
</form>
</body>
</html>
