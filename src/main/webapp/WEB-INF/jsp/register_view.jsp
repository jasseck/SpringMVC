<%-- 
    Document   : register_view
    Created on : Sep 14, 2018, 1:57:34 AM
    Author     : Tichaona
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registo de Usuario</h1>
        <h2>${usuario}, Seja bem vindo</h2>
        <form action="registerProcess" method="post">
            Usuario: <input type="text" name="usuario" value=""><br><br>
            Senha:      <input type="password" name="senha" value=""><br><br>
            <input type="submit" value="Entrar">
        </form>
    </body>
</html>
