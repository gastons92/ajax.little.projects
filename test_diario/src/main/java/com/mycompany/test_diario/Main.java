package com.mycompany.test_diario;
import static spark.Spark.get;
import static spark.Spark.staticFiles;
/**
 *
 * @author Gaston
 */
public class Main {
    public static void main(String[] args){
        
        //http://localhost:4567/index
        
        staticFiles.location("/public");

        get("/index",Controlador.index);
        get("/getNoticias",Controlador.getNoticias);
    }
}
