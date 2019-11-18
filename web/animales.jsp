<%-- 
    Document   : animales
    Created on : Nov 15, 2019, 4:51:29 PM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="card" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <c:forEach items="animales" var="animal">
  <div class="card-body">
    <h5 class="card-title">${animal.nombre}</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Descripcion</a>
  </div>
  </c:forEach>
</div>
        <h1>Hello World!</h1>
        <h2>${resultados}</h2>
        <h2>${a1.nombre}</h2>
    </body>
</html>
