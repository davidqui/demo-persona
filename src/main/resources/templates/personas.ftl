<!DOCTYPE html>
<html>
    <head>
        <title>Personas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col">
                    <#if msg_error??>
                    <div class="alert alert-danger" role="alert">
                        ${msg_error}
                        </div>
                    <#elseif msg_ok??>
                    <div class="alert alert-success" role="alert">
                        ${msg_ok}
                        </div>
                    <#else>
                    <div class="alert alert-info" role="alert">
                        Registre la información de la persona.
                        </div>
                </#if>
                    </div>
                </div>

            <div class="row">
                <div class="col">
                    <h1>Administrable de Personas</h1>
                    </div>
                </div>

            <div class="row">
                <div class="col">
                    <form action="/personas" method="POST">

                        <div class="form-group">
                            <label for="personaDocIdLabel">Documento de identidad</label>
                            <input type="text" class="form-control" id="docid" name="docid" placeholder="Ingrese el número del documento de identidad.">
                            </div>
                        <div class="form-group">
                            <label for="personaNombreLabel">Nombre</label>
                            <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Ingrese el nombre.">
                            </div>
                        <div class="form-group">
                            <label for="personaApellidoLabel">Apellido</label>
                            <input type="text" class="form-control" id="apellido" name="apellido" placeholder="Ingrese el apellido.">
                            </div>
                        <div class="form-group">
                            <label for="personaEdadLabel">Apellido</label>
                            <input type="text" class="form-control" id="edad" name="edad" placeholder="Ingrese la edad.">
                            </div>
                        <button type="submit" class="btn btn-primary">Registrar</button>

                        </form>
                    </div>
                </div>



            <div class="row">
                <div class="col">
                    <hr/>
                    </div>
                </div>

            <div class="row">
                <div class="col">
                    <h2>Lista de personas</h2>
                    </div>
                </div>

            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Doc. Id.</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Apellido</th>
                                <th scope="col">Edad</th>
                                </tr>
                            </thead>
                        <tbody>
                            <#if personas??>
                                <#list personas as persona>                            
                            <tr>
                                <th scope="row">${persona.docid}</th>
                                <td>${persona.nombre}</td>
                                <td>${persona.apellido}</td>
                                <td>${persona.edad}</td>
                                </tr>
                                </#list>
                            </#if>
                            </tbody>
                        </table>
                    </div>
                </div>

            </div>

    <!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        </body>
    </html>
