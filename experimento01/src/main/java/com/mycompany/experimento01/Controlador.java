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
    public static Route getList = (Request req, Response res) -> {
                
        String indice = req.queryParams("indice");
        
        if(indice != null){
        
        }
            
        
        UrlDAO urlDAO = new UrlDAO();
        

                
        HashMap model = new HashMap();
        model.put("lista", url);
        model.put("template", "templates/center.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
}
