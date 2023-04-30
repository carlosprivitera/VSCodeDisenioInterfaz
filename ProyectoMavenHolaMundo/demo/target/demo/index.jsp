<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>index</title>
    </head>
    <body id="miBody">
        <div id="contenedor">
            <div id="Formulario">
                <form name="miForm" action="calculararea" method="get" target="salida" id="miForm">
                    <input type="text" name="base" value="4" maxlength="30" size="30"/>
                    <br/>
                    <input type="text" name="altura" value="4" maxlength="30" size="30"/>
                    <br/>
                    <input type="submit" name="enviar" value="CalcularRec"/>
                    <input type="submit" name="enviar" value="CalcularTri"/>
                </form>
            </div>
            <div id="panelSalida">
                <iframe id="salida" name="salida">
                  salida
                </iframe>
            </div>
        </div>
    </body>
</html>