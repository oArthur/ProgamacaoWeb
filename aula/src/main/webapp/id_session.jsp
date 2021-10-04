<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ID da sessão do usuário:</title>
</head>
<body>
<p>ID da sessao do usuario: <%= session.getId() %> <p>
<%! 
int qtd_acesso = 1; 
Date date = new Date();
String data_primeiro = date.toString();
%>

<p>Acesso de numero: <%= qtd_acesso%></p>
<p>Horario primeiro acesso: <%=data_primeiro%></p>

<%Date date = new Date();
String data_ultimo = date.toString(); %>

<p>Ultimo acesso: <%= data_ultimo %> </p>

<%qtd_acesso += 1; %>

</body>
</html>