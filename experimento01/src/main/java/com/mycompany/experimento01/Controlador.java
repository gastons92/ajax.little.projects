package com.mycompany.experimento01;
import java.util.ArrayList;
import spark.Request;
import spark.Response;
import spark.Route;
import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class Controlador {
    public static Route index = (Request req, Response res) -> {
        String s="";
        HashMap model = new HashMap();
        model.put("imagen", s); //si mando un string vacio velocity pone el texto "sin imagen" en lugar de la imagen
        model.put("template", "templates/center.vsl");
        
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
    
    public static Route getImg = (Request req, Response res) -> {
                
        UrlDAO urlDAO = new UrlDAO();
        String parametro = req.queryParams("indice");
        String urlImagen;
        
        if(parametro == null)   // si --> http://localhost:4567/getImg (no recibo parametro)
            urlImagen = "";     //mando a velocity string vacio
        else
            urlImagen = urlDAO.getUrl(Integer.parseInt(parametro));
        
        //Integer indice = (req.queryParams("indice") ==  null) ? null : Integer.parseInt(req.queryParams("indice"));
        
        HashMap model = new HashMap();
        model.put("imagen", urlImagen);
        model.put("template", "templates/center.vsl");
        
        //Deberia retornar una porcion de HTMl para que Ajax lo reciba e inserte en en documento.
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
    
    public static Route getTest = (Request req, Response res) -> {
                
        UrlDAO urlDAO = new UrlDAO();
        String parametro = req.queryParams("indice");
        String urlImagen;
        
        if(parametro == null)   // si --> http://localhost:4567/getImg (no recibo parametro)
            urlImagen = "";     //mando a velocity string vacio
        else
            urlImagen = urlDAO.getUrl(Integer.parseInt(parametro));
        
        HashMap model = new HashMap();
        model.put("imagen", urlImagen);
        model.put("template", "templates/center.vsl");
        
        //Deberia retornar una porcion de HTMl para que Ajax lo reciba e inserte en en documento.
        //porcion de HTML = div centrado
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/container.vsl")); 
    };
}
