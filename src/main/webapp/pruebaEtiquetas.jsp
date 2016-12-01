<%-- 
    Document   : pruebaEtiquetas
    Created on : 01-dic-2016, 10:12:39
    Author     : rpk19
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
         <%@ taglib uri="/tlds/milibreria" prefix="ki" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Imprimir una lista</h1><BR>
        <ki:mifor lista="hola,mundo,este,es,mi,recorrelistas" separador=','/><br>
        <h1> Quita espacios</h1><br>
        <ki:antiespacios cadena="              hola mundo, estoy      probando el antiespacios     "/><br>
        <h1>Del reves </h1><br>
        <ki:reves cadena="Enrique"/><br>
        <h1> Suma de dos enteros</h1><br>
        <ki:misuma num1="4" num2="1"/>
        <h1> Sustituye caracteres</h1>
        <ki:sustituye cadena="hola mundo" sustituir="a" sustituto="e"/>
    </body>
</html>
