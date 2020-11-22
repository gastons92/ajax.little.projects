package com.mycompany.experimento01;
import static spark.Spark.get;
import static spark.Spark.staticFiles;

/**
 *
 * @author Gaston
 */
public class Main {
    
    public static void main(String[] args){
        //consulta -> http://localhost:4567/getImg
        // http://localhost:4567/getImg?indice=1
        
        staticFiles.location("/public");

        get("/getImg",Controlador.getImg);
        get("/index",Controlador.index);
        get("/getTest",Controlador.getTest);
    }
     
}
