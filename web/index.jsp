<%-- 
    Document   : index
    Created on : Nov 15, 2019, 4:48:57 PM
    Author     : sergio13v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Animales</title>
    </head>
    <body>
        <h1>Animales</h1>
        <form action="animales" method="POST" autocomplete="on">
            <select name="animal">
                <option value="perro" selected>Perro</option>
                <option value="gato">Gato</option>
                <option value="leon">Leon</option>
		<option value="conejo">Conejo</option>
            </select>
            <input type="submit" value="Send">
        </form>
    </body>
</html>
