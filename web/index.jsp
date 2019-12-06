<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<html>
<head>
<title>Get Services</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
</head>
<body id="body">

    <%
        URL obj = new URL("http://128.110.153.70:5555/services");
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response1 = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response1.append(inputLine);
			}
			in.close();

			// print result
			out.println(response1.toString());
		} else {
			out.println("GET request not worked");
		}
    %>
 
 
This is Hello World by HTML
 
<div id="msgid">
</div>
 <div class="postcode-input" id="btn">
    <input type="button" value="<%out.println("1");%>" class="add" id="add" />
</div>
</body>
</html>