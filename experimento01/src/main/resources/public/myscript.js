$(document).ready(function(){
    $("#btnver").click(function(){
        //hacer  consulta Ajax
        var consulta = "http://localhost:4567/contenedorImg?indice="+$("#indice").val();
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
                $("#contenedorimagen").html(ans);
                console.log("Succes");
            },
            error: function(){
                $("#contenedorimagen").html("<p> NO ANDUVO WACHO </p>");
                console.log("Fail");
            }
        });
    });
});