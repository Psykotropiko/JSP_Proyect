<%-- 
    Document   : index
    Created on : Nov 15, 2019, 4:48:57 PM
    Author     : sergio13v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
        <!--Validacion Manuel:
        Si el selected es distinto de vacio(1 seleccionado) = bien, sino = mal.
        Pendiente de continuar...
        -->
        <title>Animales</title>
        <script type="text/javascript">
        function comprobar(){
            
            if ( document.getElementById("opts").selected != null ) {
                alert("bien");
            } else {
                alert("mal");
            }
            
        }
        </script>
    </head>
    <body>
        <div class="container-fluid bg-primary">
            <div class="container text-center py-5">
                <h1 class="display-1">Animales</h1>
                <form action="animales" method="POST" autocomplete="on">
                    <!--Bucle for, mostrara tantos animales como haya en la db
                        falta poner la variable del servlet que los muestra en el select!!!
                        -->
                    <select>
                <option id="opt" name="animales" select="seleted" disabled='disabled'>--Seleccionar Animal--</option>
                    <%for ( int i = 0; i < 6; i++){ %>
        
                          <!-- ${i} se suprime por el id en la base de datos y el resultado sera el nombre -->
                        <option id="opts" value="${i}"> ${resultados}</option>
          
                    <%}%>
            </select> 
                </form>
            </div>
        </div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
