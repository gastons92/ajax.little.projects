package com.mycompany.test_diario;
import java.util.ArrayList;
import java.util.List;
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
    public static Route index = (Request req, Response res) -> {
        HashMap model = new HashMap();
        
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
    
    public static Route getNoticias = (Request req, Response res) -> {
        NoticiaDAO nDAO = new NoticiaDAO();
        List<Noticia> noticias = nDAO.getNoticias();
        
        HashMap model = new HashMap();
        
        model.put("noticias", noticias);
        
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/center.vsl")); 
    };
    
}
