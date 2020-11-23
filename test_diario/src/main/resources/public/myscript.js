$(document).ready(function(){
    $("#btnver").click(function(){
        //hacer  consulta Ajax
        var consulta = "http://localhost:4567/getNoticias";
        $("#consulta").html("la consulta es:  "+consulta);
        /*
        $.get(consulta, function(answer){
            //insertar codigo obtenido
            console.log("consulta recibida");
            $("#contenedorimagen").html(answer);
        });
        */
        
        $.ajax({
            url: consulta,
            type: 'GET',
            success: function(ans) {
                $("#contenedor").html(ans);
                console.log("Succes");
            },
            error: function(){
                $("#contenedor").html("<p> NO ANDUVO WACHO </p>");
                console.log("Fail");
            }
        });
    });
});