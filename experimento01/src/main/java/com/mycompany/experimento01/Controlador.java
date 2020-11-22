package com.mycompany.experimento01;
import java.util.ArrayList;
import spark.Request;
import spark.Response;
import spark.Route;
import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author Gaston
 */
public class Controlador {
    public static Route getImg = (Request req, Response res) -> {
                
        Integer indice = (req.queryParams("indice") ==  null) ? null : Integer.parseInt(req.queryParams("indice"));
        
        UrlDAO urlDAO = new UrlDAO();
               
        HashMap model = new HashMap();
        model.put("imagen", urlDAO.getUrl(indice));
        model.put("template", "templates/center.vsl");
        
        //Deberia retornar una porcion de HTMl para que Ajax lo reciba e inserte en en documento.
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
}
