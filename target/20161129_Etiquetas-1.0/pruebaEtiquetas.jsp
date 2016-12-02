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
        <table border ="1">
            <tr>
                <th>Etiqueta</th><TH>Parametros</th><th>Descripcion</th><th>Ejemplo</th><th>Salida</th>
            </tr>
            <tr>
                <td>&ltki:mifor></td><td>lista<br>separador</td><td>Imprime una lista de elementos separados con algun caracter<td><pre> &ltki:mifor lista="hola,mundo,este,es,mi,recorrelistas" separador=','/></pre></td><td> <ki:mifor lista="hola,mundo,este,es,mi,recorrelistas" separador=','/><br></td>
            </tr>
            <tr>
                <td>&ltki:antiespacios></td><td>cadena</td><td>quita los espacios excesivos de una cadena</td><TD> &ltki:antiespacios cadena="              hola mundo, estoy      probando el antiespacios     "/></td><td> <ki:antiespacios cadena="              hola mundo, estoy      probando el antiespacios     "/></td>
            </tr>
            <tr>
                <td>&ltki:reves></td><td>cadena</td><td>Imprime la cadena introducida al reves </td><td>&ltki:reves cadena="Enrique"/></td><td><ki:reves cadena="Enrique"/></td>
            </tr>
            <tr>
                <td>&ltki:misuma></td><td>num1<br>num2</td><td>Imprime la suma entre los dos numeros introducidos</td><td>&ltki:misuma num1="4" num2="1"/></td><td><ki:misuma num1="4" num2="1"/></td>
            </tr>
            <tr>
                <td>&ltki:sustituye></td><td>cadena<br>sustituir<br>sustituto</td><td>Retorna la cadena introducida con los caracteres cambiados</td><td>&ltki:sustituye cadena="hola mundo" sustituir="a" sustituto="e"/></td><td><ki:sustituye cadena="hola mundo" sustituir="a" sustituto="e"/></td>
            </tr>
            
        </table>
  
    </body>
</html>
