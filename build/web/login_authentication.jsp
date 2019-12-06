<%@page import="javax.swing.text.Document"%>
<%@page import="com.mongodb.client.MongoCursor"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#81BEF7">
<form>
<%



String user = request.getParameter("ctdb_user_login");
String pass = request.getParameter("ctdb_user_pass");
int cnt=0,c=0;

MongoClientURI uri = new MongoClientURI(
    "mongodb://lohitha:Sathya%40123@cluster0-shard-00-00-kwnes.mongodb.net:27017,cluster0-shard-00-01-kwnes.mongodb.net:27017,cluster0-shard-00-02-kwnes.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority");

MongoClient mongoClient = new MongoClient(uri);
MongoDatabase db = mongoClient.getDatabase("test");
MongoCollection collection = db.getCollection("Users");
BasicDBObject doc = new BasicDBObject();
BasicDBObject searchQuery = new BasicDBObject();
    searchQuery.put("name",user);
    searchQuery.put("password",pass);

    MongoCursor<Document> cursor = collection.find(searchQuery).iterator(); 
    System.out.println(cursor);
    try {
        if(cursor.hasNext()) {
            System.out.println(cursor.next());
            session.setAttribute("history"," ");
            session.setAttribute("userid", user);	 
            response.sendRedirect("myservices.jsp");
        }
        else{
         %><center> Invalid User-Id Or Password<br><br><strong><a href="javascript:history.go(-1)">Try Again</a></strong></center> 
         <%           
        }
    } 
    finally {
        cursor.close();
        mongoClient.close();
    }
%>
</form>
</body>
</html>