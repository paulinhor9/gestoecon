<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@include file="validaSessao.jsp" %> --%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sistema de Usuário</title>
</head>
Listagem de Usuários
<br> <br>

<body>
<%
   ResultSet listagem = (ResultSet)session.getAttribute("lista");
%>

<table border="1">
  <tr> 
     <th>Email </th>
     <th>Nome </th>
     <th>Senha </th>
  </tr>
  <% if (listagem!=null){
	  while (listagem.next()) {
	  %> 
  <tr>
    <td><%=listagem.getString("email")%> </td>
    <td><%=listagem.getString("nome")%> </td>
    <td><%=listagem.getString("senha")%> </td>
    <td>Excluir - <a href="alterarUsuario.jsp?login=<%=listagem.getString("login")%>">Alterar</a> </td>
  </tr> 
  <%}
	  }%>

</table>

</body>
</html>